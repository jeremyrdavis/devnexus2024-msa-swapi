package io.arrogantprogrammer.devnexus2024.swapi.domain;

public record SpeciesResponse(
        int count,
        String next,
        String previous,
        SpeciesRecord[] results
) {
}
