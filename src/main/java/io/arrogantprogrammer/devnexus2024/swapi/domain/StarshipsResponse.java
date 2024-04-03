package io.arrogantprogrammer.devnexus2024.swapi.domain;

import java.util.List;

public record StarshipsResponse(int count, String next, String previous, List<StarshipRecord> results)  {
}
