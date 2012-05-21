package cpm;


import com.sun.jersey.spi.container.servlet.ServletContainer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.Servlet;

/**
 * Created with IntelliJ IDEA.
 * User: Chuck
 * Date: 4/5/12
 * Time: 11:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class Runner {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8081);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);

        final Servlet servlet = new ServletContainer();
        final ServletHolder servletHolder = new ServletHolder(servlet);
        servletHolder.setInitParameter(
                "com.sun.jersey.config.property.packages",
                "cpm"
        );
        context.addServlet(servletHolder,"/*");

        server.start();
        server.join();
    }
}
