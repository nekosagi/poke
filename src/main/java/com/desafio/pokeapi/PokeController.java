package com.desafio.pokeapi;

import com.jayway.jsonpath.JsonPath;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PokeController {

    @Autowired
    Pokeservice pServ;
    JSONParser parse = new JSONParser();

    @RequestMapping("/")
    public String welcome() {
        return "index";
    }

    @GetMapping("/minipokeapi/{pokeId}")
    public Pokemon getPoke(@PathVariable("pokeId") int pokeId) {

        String prueba = pServ.someRestCall(pokeId);
        int id = pokeId;
        String name = JsonPath.read(prueba,"$.name");
        int weight = JsonPath.read(prueba, "$.weight");
        List<String> abilities = JsonPath.read(prueba, "$.abilities..name");
        List<String> type = JsonPath.read(prueba, "$.types..name");
        String image = JsonPath.read(prueba, "$.sprites.other.official-artwork.front_default");
        Pokemon poke = new Pokemon(id,name,type,weight,abilities,image);

        return poke;
    }
}



