package io.arrogantprogrammer.devnexus2024.swapi.infrastructure;

import io.arrogantprogrammer.devnexus2024.swapi.domain.PersonRecord;
import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@QuarkusTest
public class SwapiServiceTest {

    static final Logger LOGGER = LoggerFactory.getLogger(SwapiServiceTest.class);

    @InjectMock
    @RestClient
    SwapiClient mockSwapiClient;

    @Inject
    SwapiService swapiService;

    @BeforeEach
    public void setUp() {
        LOGGER.info("Setting up SwapiServiceTest");
        when(mockSwapiClient.getPerson(anyInt())).thenReturn(TestUtils.LUKE_SKYWALKER);
    }

    @Test
    public void testGetPerson() {
        LOGGER.info("Running testGetPerson");
        PersonRecord personRecord = swapiService.getRandomPerson();
        assert personRecord.name().equals("Luke Skywalker");
    }

    @GET
    public void testGetPersonById() {
        LOGGER.info("Running testGetPersonById");
        PersonRecord personRecord = swapiService.getPersonById(1);
        assert personRecord.name().equals("Luke Skywalker");
    }
}
