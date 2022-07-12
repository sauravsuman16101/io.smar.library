package io.smart.library.database.Config;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.cassandra.exceptions.ConfigurationException;
import org.apache.thrift.transport.TTransportException;
import org.cassandraunit.utils.EmbeddedCassandraServerHelper;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;

import i.o.smart.library.database.configuration.DatabaseConfig;
import i.o.smart.library.database.configuration.DbKeyspace;
import i.o.smart.library.database.configuration.LibraryDbException;

public class DbConfigurationTest
{
    private static DatabaseConfig dbConfig;
    private static Session session;
    private static DbKeyspace keyspacerepo;

    @BeforeAll
    public static void setup() throws LibraryDbException, ConfigurationException, TTransportException, IOException, InterruptedException
    {
        EmbeddedCassandraServerHelper.startEmbeddedCassandra(20000L);
        dbConfig = new DatabaseConfig();
        dbConfig.connect("127.0.0.1", 9142, "cassandra", "cassandra");

        session = dbConfig.getSession();
        keyspacerepo = new DbKeyspace(dbConfig);
    }

    @Test
    @DisplayName ("Test to create keyspace in databse")
    public void testkeyspaceCreation()
    {
        keyspacerepo.createKeyspace("bookEntityKey", 1);
        ResultSet result = session.execute("SELECT * FROM system_schema.keyspaces;");
        List<String> matchedKeyspaces = result.all()
                .stream().filter(
                        r -> r.getString(0).equals("bookEntityKey".toLowerCase()))
                .map(r -> r.getString(0)).collect(Collectors.toList());
        assertThat(matchedKeyspaces.size()).isEqualTo(1);
        assertThat(matchedKeyspaces.get(0)).isEqualTo("bookEntityKey".toLowerCase());

    }

    @AfterAll
    public static void teardown()
    {
        session.close();
    }

}
