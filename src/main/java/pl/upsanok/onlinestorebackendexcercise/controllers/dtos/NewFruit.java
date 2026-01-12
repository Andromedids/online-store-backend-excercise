package pl.upsanok.onlinestorebackendexcercise.controllers.dtos;

import lombok.Builder;

@Builder
public record NewFruit(String name, int price, String url) {
}
