package wvsdev.cardapp.domain;

import jakarta.persistence.*;
import lombok.*;
import wvsdev.cardapp.dtos.FoodRequestDTO;

@Table(name = "foods")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private Integer price;

    public Food(FoodRequestDTO data){
        this.title = data.title();
        this.image = data.image();
        this.price = data.price();
    }
}
