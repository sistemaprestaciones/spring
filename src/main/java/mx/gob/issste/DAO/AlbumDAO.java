package mx.gob.issste.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.gob.issste.Entities.Album;

@Repository
public interface AlbumDAO extends JpaRepository<Album, Integer> {
    
}
