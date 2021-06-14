package com.desafio.pokeapi;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private int id;
    private String name;
    private List<String> type;
    private int weight;
    private List<String> abilities;
    private String image;

    public Pokemon() {
    }

    public Pokemon(int id) {
        this.id = id;
    }

    public Pokemon(int id, String name, List<String> type, int weight, List<String> abilities, String image) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.abilities = abilities;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String>abilities) {
        this.abilities = abilities;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                ", abilities=" + abilities +
                '}';
    }
}
