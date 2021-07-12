package mx.gob.issste.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.gob.issste.Entities.Artists;

@Repository
public interface ArtistsDAO extends CrudRepository<Artists, Integer> {

    @Query(value = "SELECT a FROM Artists a WHERE a.cancion = ?1 AND a.anio = ?2")
    public Artists getArtistBySong(String cancion, Integer anio);
    
}
