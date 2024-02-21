package ca.sheridancollege.scharfm.midtermscharfm;



import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "car_items")
public class CarItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "car_brand")
    private String carBrand;

    private double price;

    @Column(name = "car_description")
    private String description;

    private String hyperlink;
}


