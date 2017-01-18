import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.webapp.WebAppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by paul on 12/08/16.
 */
public class DevLauncher {
    private static Logger LOG = LoggerFactory.getLogger(DevLauncher.class);
    public static void main(String[] args) throws Exception {
        LOG.info("Start");
        Server server = new Server();

        SelectChannelConnector connector = new SelectChannelConnector();
        connector.setPort(18080);

        server.addConnector(connector);

        WebAppContext webAppContext = new WebAppContext("webapp", "/");

        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            // fix for Windows, so Jetty doesn't lock files
            webAppContext.getInitParams().put("org.eclipse.jetty.servlet.Default.useFileMappedBuffer", "false");
        }
        server.setHandler(webAppContext);
        server.start();
        server.join();
    }
}
