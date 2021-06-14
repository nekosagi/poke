package com.desafio.pokeapi;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class Pokeservice {

    private final WebClient webClient;

    public Pokeservice(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://pokeapi.co/api/v2/pokemon").build();
    }

    public String someRestCall(int id) {
        return this.webClient.get().uri("/{id}", id)
                .retrieve().bodyToMono(String.class).block();
    }

}
