package com.uniremington.trajetacredito.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author 
 */
@Path("jakartaee9")
public class JakartaEE9Resource {
    
    @GET
    public Response ping(){
        return Response
                .ok("Capa de negocio y servicios en linea")
                .build();
    }
}
