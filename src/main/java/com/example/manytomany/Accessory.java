package com.example.manytomany;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Accessory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "accessories")
    private Set<Config> configs = new HashSet<>();

    public Accessory() {

    }

    public Accessory(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Accessory setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Accessory setName(String name) {
        this.name = name;
        return this;
    }

    public Set<Config> getConfigs() {
        return configs;
    }

    public void setConfigs(Set<Config> configs) {
        this.configs = configs;
    }
}
