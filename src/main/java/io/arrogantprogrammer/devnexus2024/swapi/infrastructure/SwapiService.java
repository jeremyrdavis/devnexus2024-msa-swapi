package io.arrogantprogrammer.devnexus2024.swapi.infrastructure;

import io.arrogantprogrammer.devnexus2024.swapi.domain.PersonRecord;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class SwapiService {

    static final Logger LOGGER = LoggerFactory.getLogger(SwapiService.class);

    @RestClient
    SwapiClient swapiClient;

    public PersonRecord getRandomPerson() {
        return swapiClient.getPerson((int) (Math.random() * 82) + 1);
    }

    public PersonRecord getPersonById(int i) {
        return swapiClient.getPerson(i);
    }
}
