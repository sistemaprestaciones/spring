package mx.gob.issste.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Album {

    @Id
    @Column(name = "AlbumId")
    private Integer id_album;

    @Column(name = "Title")
    private String titulo;

    @Column(name = "ArtistId")
    private Integer id_artista;
    
}
