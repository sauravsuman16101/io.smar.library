package i.o.smart.library.database.configuration;

import com.datastax.driver.core.Session;
import com.datastax.oss.driver.api.core.cql.SimpleStatement;
import com.datastax.oss.driver.api.querybuilder.SchemaBuilder;
import com.datastax.oss.driver.api.querybuilder.schema.CreateKeyspace;

public class DbKeyspace
{
    private Session session;

    public DbKeyspace(DatabaseConfig dbConfig)
    {
        this.session = dbConfig.getSession();
    }

    public void createKeyspace(String keyspaceName, int replicationFactor)
    {
        CreateKeyspace myKeyspace = SchemaBuilder.createKeyspace(keyspaceName)
                .ifNotExists()
                .withSimpleStrategy(replicationFactor);
        SimpleStatement simplestatement = myKeyspace.build();
        session.execute(simplestatement.getQuery());
    }
}
