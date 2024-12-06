package pe.edu.cibertec.DAWI_VILLAGARAY_RIVAS_JOSUE.GABRIEL.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer filmId;
    private String title;
    private String description;
    private Integer releaseYear;
    private Integer originalLanguageId;
    private Integer rentalDuration;
    private Double rentalRate;
    private Integer length;
    private Double replacementCost;
    private String rating;
    private String specialFeatures;
    private Date lastUpdate;

    // Relación con Language
    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

    // Relación con FilmCategory
    @OneToMany(mappedBy = "film", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @ToString.Exclude
    private List<FilmCategory> categories;

    // Relación con FilmActor
    @OneToMany(mappedBy = "film", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @ToString.Exclude
    private List<FilmActor> filmActors;

    // Relación con Inventory
    @OneToMany(mappedBy = "film", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @ToString.Exclude
    private List<Inventory> inventoryItems;
}
