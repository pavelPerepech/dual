import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.webapp.WebAppContext;

import java.io.File;

/**
 * Created by paul on 28/10/16.
 */
public class Launcher {
    public static void main(String[] args) throws Exception {
        Server server = new Server();      //javax.servlet.http.HttpServletResponse

        SelectChannelConnector connector = new SelectChannelConnector();
        connector.setPort(8080);

        server.addConnector(connector);

        File selfFile = new File(Launcher.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
        System.out.println(selfFile.getAbsolutePath());

        WebAppContext webAppContext = new WebAppContext(selfFile.getAbsolutePath(), "/");

        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            // fix for Windows, so Jetty doesn't lock files
            webAppContext.getInitParams().put("org.eclipse.jetty.servlet.Default.useFileMappedBuffer", "false");
        }
        server.setHandler(webAppContext);
        server.start();
        server.join();
    }
}
