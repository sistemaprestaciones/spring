package mx.gob.issste.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.gob.issste.DAO.AlbumDAO;
import mx.gob.issste.DAO.ArtistsDAO;
import mx.gob.issste.Entities.Album;
import mx.gob.issste.Entities.Artist;
import mx.gob.issste.Service.ArtistsService;

@Service
public class ArtistsServiceImpl implements ArtistsService {

    @Autowired
    private AlbumDAO album;

    @Autowired
    private ArtistsDAO artist;
    
    
    @Override
    public List<Artist> getAllArtist(){        
        return artist.findAll();
    }

    @Override
    public List<Album> getAllAlbums() {
        return album.findAll();
    }

    @Override
    public void saveArtista(Artist art) {
        artist.save(art);        
    }

    @Override
    public void deleteArtist(Integer id) {
        artist.deleteById(id);
    }
}
