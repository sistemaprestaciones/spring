package mx.gob.issste.Service;

import java.util.List;

import mx.gob.issste.Entities.Album;
import mx.gob.issste.Entities.Artist;

public interface ArtistsService {

    public List<Artist> getAllArtist();

    public List<Album> getAllAlbums();

    public void saveArtista(Artist art);

    public void deleteArtist(Integer id);
    
}
