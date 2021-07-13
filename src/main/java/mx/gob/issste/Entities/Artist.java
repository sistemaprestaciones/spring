package mx.gob.issste.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Artist {
    
    @Id
    @Column(name = "ArtistId")
    private Integer id_artista;
    
    @Column(name = "Name")
    private String Nombre;

        
}
