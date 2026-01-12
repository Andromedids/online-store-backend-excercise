package pl.upsanok.onlinestorebackendexcercise.controllers;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import pl.upsanok.onlinestorebackendexcercise.controllers.dtos.Fruit;
import pl.upsanok.onlinestorebackendexcercise.controllers.dtos.FruitsFrequency;

@Service
public record FruitsService(List<Fruit> fruits) {

  public Fruit addNew(String name, int price, String url) {
    Integer newId = fruits.stream()
        .max(Comparator.comparingInt(Fruit::id))
        .map(Fruit::id)
        .map(id -> id + 1)
        .orElse(1);
    Fruit newFruit = Fruit.builder()
            .id(newId)
            .url(url)
            .name(name)
            .price(price)
        .build();
    fruits.add(newFruit);
    return newFruit;
  }

  public boolean removeFruitBy(int id) {
    return fruits.removeIf(fruit -> fruit.id() == id);
  }

  public List<Fruit> getAllFruits() {
    return fruits;
  }

  public Fruit getMostExpensive() {
    Fruit fruit = null; // FIXME !
    return fruit;
  }

  public Fruit getCheapest() {
    Fruit fruit = null; // FIXME !
    return fruit;
  }

  public Double getAveragePrice() {
    double averagePrice = 0.0; // FIXME!
    return averagePrice;
  }

  public int sumAllPrices() {
    int sum = 0; // FIXME!
    return sum;
  }

  public List<FruitsFrequency> getFruitFrequency() {
    Map<String, Long> frequency = getFrequenceMap();
    return frequency.entrySet()
        .stream()
        .map((k) -> new FruitsFrequency(k.getKey(), k.getValue()))
        .toList();
  }

  private Map<String, Long> getFrequenceMap() {
    Map<String, Long> resukt = new HashMap<>(); //FIXME!
    return resukt;
  }
}
