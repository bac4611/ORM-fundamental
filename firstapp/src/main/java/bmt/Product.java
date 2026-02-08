package bmt;
import jakarta.persistence.*;


@Entity
@Table(name="Products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    
    public Product() {}

    public Product( String name, double price) {
        this.name = name;
        this.price = price;
    }
    }


