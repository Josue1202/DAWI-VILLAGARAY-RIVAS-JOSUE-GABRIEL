package pe.edu.cibertec.DAWI_VILLAGARAY_RIVAS_JOSUE.GABRIEL.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmActorPk {
    private Integer filmId;
    private Integer actorId;
}
