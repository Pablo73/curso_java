package com.project.podcasts.entity;

public record Person(String name, Integer age) {
  public String greeting() {
    return String.format("Olá, meu nome é %s e tenho %s anos", name, age);
  }

}
