package io.arrogantprogrammer.devnexus2024.swapi.domain;

public record VehicleResponse(int count, String next, String previous, VehicleRecord[] results) {
}
