package com.example.ecommerceproductcatalog.model; 
import jakarta.persistence.*; 
import lombok.AllArgsConstructor; 
import lombok.Data; 
import lombok.NoArgsConstructor; 
@Entity 
@Table(name = "products") // Specifies the table name in the database 
@Data // Lombok: Generates getters, setters, toString, equals, and hashCode 
@NoArgsConstructor // Lombok: Generates a no-argument constructor 
@AllArgsConstructor // Lombok: Generates a constructor with all fields 
public class Product { 
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrementing primary 
key 
    private Long productId; 
    @Column(nullable = false) // Name cannot be null 
    private String name; 
    @Column(columnDefinition = "TEXT") // Description can be longer 
    private String description; 
    @Column(nullable = false) 
    private Double price; 
    @Column(nullable = false) 
    private String category; 
    @Column(nullable = false) 
    private Integer stockQuantity; 
}
