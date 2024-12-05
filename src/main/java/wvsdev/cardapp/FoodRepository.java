package wvsdev.cardapp;

import org.springframework.data.jpa.repository.JpaRepository;
import wvsdev.cardapp.domain.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
