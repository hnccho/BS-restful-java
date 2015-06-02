package org.coffeeshop;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * A simple JAX-RS resource which demonstrates a sample Coffee shop hello world application
 * @author Bhakti Mehta
 *
 */
@Path("v1/coffees")
public class CoffeesResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/orders/{id}")
    public Response streamExample(@PathParam("id") int id) {
        final Coffee coffee = CoffeeService.getCoffee(id);
        return Response.ok(coffee.toString()).build();
    }

}