package wvsdev.cardapp.domain;

import jakarta.persistence.*;
import lombok.*;

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
}
