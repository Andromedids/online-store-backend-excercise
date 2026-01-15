package pl.upsanok.onlinestorebackendexcercise.controllers.dtos;

import lombok.Builder;

@Builder
public record Fruit(int id, String name, int price, String url) {
  public Fruit(int price) {
    this(0, "", price, "");
  }

}


