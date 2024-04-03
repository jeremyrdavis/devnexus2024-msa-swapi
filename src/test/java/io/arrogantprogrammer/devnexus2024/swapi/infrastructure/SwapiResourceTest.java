package io.arrogantprogrammer.devnexus2024.swapi.infrastructure;

import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@QuarkusTest
public class SwapiResourceTest {
    static final Logger LOGGER = LoggerFactory.getLogger(SwapiResourceTest.class);

    @InjectMock
    SwapiService mockSwapiService;

    @BeforeEach
    public void setUp() {
        LOGGER.info("Setting up SwapiResourceTest");
        when(mockSwapiService.getRandomPerson()).thenReturn(TestUtils.LUKE_SKYWALKER);
        when(mockSwapiService.getPersonById(anyInt())).thenReturn(TestUtils.C3PO);
    }

    @Test
    public void testRandomPerson() {
        LOGGER.info("Running testRandomPerson");
        given()
                .when().get("/swapi/person")
                .then()
                .statusCode(200)
                .body("name",is(TestUtils.LUKE_SKYWALKER.name()));
    }

    @Test
    public void testPersonById() {
        LOGGER.info("Running testPersonById");
        given()
                .when().get("/swapi/person/2")
                .then()
                .statusCode(200)
                .body("name",is(TestUtils.C3PO.name()));
    }
}
