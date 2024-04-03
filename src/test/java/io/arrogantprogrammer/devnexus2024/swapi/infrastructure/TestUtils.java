package io.arrogantprogrammer.devnexus2024.swapi.infrastructure;

import io.arrogantprogrammer.devnexus2024.swapi.domain.PersonRecord;

import java.net.URI;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;

public class TestUtils {

    public static PersonRecord LUKE_SKYWALKER = new PersonRecord(
            "Luke Skywalker",
            "172",
            "77",
            "blond",
            "fair",
            "blue",
            "19BBY",
            "male",
            "https://swapi.dev/api/planets/1/",
            Arrays.asList("https://swapi.dev/api/films/1/",
                    "https://swapi.dev/api/films/2/",
                    "https://swapi.dev/api/films/3/",
                    "https://swapi.dev/api/films/6/"),
            Collections.emptyList(),
            Arrays.asList("https://swapi.dev/api/vehicles/14/",
                    "https://swapi.dev/api/vehicles/30/"),
            Arrays.asList("https://swapi.dev/api/starships/12/",
                    "https://swapi.dev/api/starships/22/"),
            Instant.parse("2014-12-09T13:50:51.644000Z"),
            Instant.parse("2014-12-20T21:17:56.891000Z"),
            URI.create("https://swapi.dev/api/people/1/"));


    public static String LUKE_SKYWALKER_JSON = """
            {
                "name": "Luke Skywalker",
                "height": "172",
                "mass": "77",
                "hair_color": "blond",
                "skin_color": "fair",
                "eye_color": "blue",
                "birth_year": "19BBY",
                "gender": "male",
                "homeworld": "https://swapi.dev/api/planets/1/",
                "films": [
                    "https://swapi.dev/api/films/1/",
                    "https://swapi.dev/api/films/2/",
                    "https://swapi.dev/api/films/3/",
                    "https://swapi.dev/api/films/6/"
                ],
                "species": [],
                "vehicles": [
                    "https://swapi.dev/api/vehicles/14/",
                    "https://swapi.dev/api/vehicles/30/"
                ],
                "starships": [
                    "https://swapi.dev/api/starships/12/",
                    "https://swapi.dev/api/starships/22/"
                ],
                "created": "2014-12-09T13:50:51.644000Z",
                "edited": "2014-12-20T21:17:56.891000Z",
                "url": "https://swapi.dev/api/people/1/"
            } 
            """;

    public static PersonRecord C3PO = new PersonRecord(
            "C-3PO",
            "167",
            "75",
            "n/a",
            "gold",
            "yellow",
            "112BBY",
            "n/a",
            "https://swapi.dev/api/planets/1/",
            Arrays.asList(
                    "https://swapi.dev/api/films/1/",
                    "https://swapi.dev/api/films/2/",
                    "https://swapi.dev/api/films/3/",
                    "https://swapi.dev/api/films/4/",
                    "https://swapi.dev/api/films/5/",
                    "https://swapi.dev/api/films/6/"),
            Collections.singletonList("https://swapi.dev/api/species/2/"),
            Collections.emptyList(),
            Collections.emptyList(),
            Instant.parse("2014-12-10T15:10:51.357000Z"),
            Instant.parse("2014-12-20T21:17:50.309000Z"),
            URI.create("https://swapi.dev/api/people/2/"));
    public static String C3PO_JSON = """
            {
                "name": "C-3PO",
                "height": "167",
                "mass": "75",
                "hair_color": "n/a",
                "skin_color": "gold",
                "eye_color": "yellow",
                "birth_year": "112BBY",
                "gender": "n/a",
                "homeworld": "https://swapi.dev/api/planets/1/",
                "films": [
                    "https://swapi.dev/api/films/1/",
                    "https://swapi.dev/api/films/2/",
                    "https://swapi.dev/api/films/3/",
                    "https://swapi.dev/api/films/4/",
                    "https://swapi.dev/api/films/5/",
                    "https://swapi.dev/api/films/6/"
                ],
                "species": [
                    "https://swapi.dev/api/species/2/"
                ],
                "vehicles": [],
                "starships": [],
                "created": "2014-12-10T15:10:51.357000Z",
                "edited": "2014-12-20T21:17:50.309000Z",
                "url": "https://swapi.dev/api/people/2/"
            }    """;
}
