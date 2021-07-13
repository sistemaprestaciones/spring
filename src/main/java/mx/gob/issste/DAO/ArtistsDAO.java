package mx.gob.issste.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.gob.issste.Entities.Artist;


@Repository
public interface ArtistsDAO extends JpaRepository<Artist, Integer> {

    //Ejemplo de implementacion de consulta personalizada
    // @Query(value = "SELECT a FROM Artists a WHERE a.cancion = ?1 AND a.anio = ?2")
    // public Artists getArtistBySong(String cancion, Integer anio);

    @Query(value = "Update Artist set status=0 where id = ?1")
    public void borrarPorId(Integer id);
    
}
