package cpm;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created with IntelliJ IDEA.
 * User: Chuck
 * Date: 4/5/12
 * Time: 11:51 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("/helloworld")
@Produces(MediaType.TEXT_PLAIN)
public class HelloWorldResource {
    @GET
    public String sayHello() {
        return "Hello, world!";
    }
}
