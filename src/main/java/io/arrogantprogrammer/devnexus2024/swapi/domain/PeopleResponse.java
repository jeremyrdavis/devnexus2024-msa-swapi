package io.arrogantprogrammer.devnexus2024.swapi.domain;

public record PeopleResponse(int count, String next, String previous, PersonRecord[] results) {
}
