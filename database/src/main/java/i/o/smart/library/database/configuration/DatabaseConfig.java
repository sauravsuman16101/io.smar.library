package i.o.smart.library.database.configuration;

import java.util.Objects;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.PlainTextAuthProvider;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.exceptions.AuthenticationException;
import com.datastax.driver.core.exceptions.NoHostAvailableException;

public class DatabaseConfig
{
    private Cluster cluster;
    private Session session;

    public void connect(String node, Integer port, String user, String password) throws LibraryDbException
    {
        try
        {

            Cluster.Builder clusterBuilder = Cluster.builder()
                    .withAuthProvider(new PlainTextAuthProvider(user, password))
                    .addContactPoint(node)
                    .withoutJMXReporting();

            if (Objects.nonNull(port))
            {
                clusterBuilder.withPort(port);
            }

            cluster = clusterBuilder.build();
            session = cluster.connect();
        }
        catch (NoHostAvailableException e)
        {
            throw new LibraryDbException("400", e.getMessage());
        }
        catch (AuthenticationException e)
        {
            throw new LibraryDbException("401", e.getMessage());
        }
        catch (IllegalStateException e)
        {
            throw new LibraryDbException("500", e.getMessage(), e.getCause());
        }
    }

    public Session getSession()
    {
        return session;
    }

    public void close()
    {
        session.close();
        cluster.close();
    }
}
