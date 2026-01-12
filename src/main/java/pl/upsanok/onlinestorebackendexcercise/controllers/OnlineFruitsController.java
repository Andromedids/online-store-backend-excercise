package pl.upsanok.onlinestorebackendexcercise.controllers;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;

import jakarta.servlet.ServletRequest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.upsanok.onlinestorebackendexcercise.controllers.dtos.Fruit;
import pl.upsanok.onlinestorebackendexcercise.controllers.dtos.FruitsFrequency;
import pl.upsanok.onlinestorebackendexcercise.controllers.dtos.GenericResponse;
import pl.upsanok.onlinestorebackendexcercise.controllers.dtos.NewFruit;

@RestController
public class OnlineFruitsController {
  @Autowired
  private FruitsService fruitsService;

  @GetMapping(path = "/fruits")
  public ResponseEntity<List<Fruit>> getFruits() {
    return new ResponseEntity<>(
        fruitsService.getAllFruits(),
        OK
    );
  }

  @GetMapping(path = "/fruits/expensive")
  public ResponseEntity<Fruit> getMostExpensiveFruit() {
    Fruit mostExpensive = fruitsService.getMostExpensive();
    if (mostExpensive == null) {
      return new ResponseEntity<>(
          NOT_FOUND
      );
    }
    return new ResponseEntity<>(
        mostExpensive,
        OK
    );
  }

  @GetMapping(path = "/fruits/cheapest")
  public ResponseEntity<Fruit> getCheapestFruit() {
    Fruit cheapest = fruitsService.getCheapest();
    if (cheapest == null) {
      return new ResponseEntity<>(
          NOT_FOUND
      );
    }
    return new ResponseEntity<>(
        cheapest,
        OK
    );
  }

  @GetMapping(path = "/fruits/average")
  public ResponseEntity<GenericResponse> getAverageFruitPrice() {
    return new ResponseEntity<>(
        GenericResponse.builder().value(fruitsService.getAveragePrice()).build(),
        OK
    );
  }

  @GetMapping(path = "/fruits/price")
  public ResponseEntity<GenericResponse> getSumOfAllFruits() {
    return new ResponseEntity<>(
        GenericResponse.builder()
            .value(fruitsService.sumAllPrices())
            .build(),
        OK
    );
  }

  @GetMapping(path = "/fruits/frequency")
  public ResponseEntity<List<FruitsFrequency>> getFrequencyFruit(ServletRequest servletRequest) {
    return new ResponseEntity<>(
       fruitsService.getFruitFrequency(),
        OK
    );
  }

  @PostMapping(path = "/fruits")
  public ResponseEntity<Fruit> addFruit(
      @RequestBody NewFruit newFruit
  ) {
    Fruit fruit = fruitsService.addNew(newFruit.name(), newFruit.price(), newFruit.url());
    return new ResponseEntity<>(
        fruit,
        CREATED
    );
  }

  @DeleteMapping(path = "/fruits/{id}")
  public ResponseEntity<GenericResponse> deleteFruit(
      @PathVariable("id") int id
  ) {
    var result = fruitsService.removeFruitBy(id);
    if (result) {
      return new ResponseEntity<>(
          GenericResponse.builder()
              .value(id)
              .build(),
          NO_CONTENT
      );
    } else {
      return new ResponseEntity<>(
          NOT_FOUND
      );
    }
  }
}
