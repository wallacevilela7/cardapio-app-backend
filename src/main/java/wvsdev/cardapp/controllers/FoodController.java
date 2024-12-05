package wvsdev.cardapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wvsdev.cardapp.FoodRepository;
import wvsdev.cardapp.domain.Food;
import wvsdev.cardapp.dtos.FoodResponseDTO;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired
    private FoodRepository repository;

    @GetMapping
    public List<FoodResponseDTO> getAll() {
        List<FoodResponseDTO> list = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return list;
    }
}
