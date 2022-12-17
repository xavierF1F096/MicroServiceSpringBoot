package io.microservice;

public record CustomerRegistrationRequest(String firstName, String lastName, String email) {
}