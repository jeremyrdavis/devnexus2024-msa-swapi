package io.arrogantprogrammer.devnexus2024.swapi.infrastructure;

import io.arrogantprogrammer.devnexus2024.swapi.domain.PersonRecord;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/swapi")
public class SwapiResource {

    static final Logger LOGGER = LoggerFactory.getLogger(SwapiResource.class);

    @Inject
    SwapiService swapiService;

    @GET
    @Path("/person")
    public Response getRandomPerson() {
        PersonRecord personRecord = swapiService.getRandomPerson();
        LOGGER.info("Returning person: {}", personRecord.name());
        return Response.ok().entity(personRecord).build();
    }

    @GET
    @Path("/person/{id}")
    public Response getPersonById(@PathParam("id") int id) {
        PersonRecord personRecord = swapiService.getPersonById(id);
        LOGGER.info("Returning for id: {} person: {}", id, personRecord.name());
        return Response.ok().entity(personRecord).build();
    }
}
