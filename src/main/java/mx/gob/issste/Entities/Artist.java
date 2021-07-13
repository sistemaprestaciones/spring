package mx.gob.issste.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_artista;
    
    @Column(name = "Name")
    private String Nombre;

        
}
