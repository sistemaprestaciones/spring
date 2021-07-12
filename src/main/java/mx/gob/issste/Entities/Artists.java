package mx.gob.issste.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "artistas")
@Table(name = "artistaz")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Artists {
    
    @Id
    @Column(name = "ArtistsId")
    private Integer Id_artista;

    @Column(name = "Name")
    private String Nombre_cancion;

        
}
