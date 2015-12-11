package planet.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/book")
public class BookRestService {
    @GET
    @Produces("text/plain")
    public String getBookTitle() {
        return "H2G2";
    }
}