package mx.gob.issste.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mx.gob.issste.DTO.ArtistaDTO;
import mx.gob.issste.Entities.Artist;
import mx.gob.issste.Service.ArtistsService;

@RestController
@RequestMapping(value = "/tienda")
@ResponseBody
public class ArtistsController {

    @Autowired
    private ArtistsService service;

    @GetMapping(value = "/artistas")
    public List<Artist> getArtistas(){
        return service.getAllArtist();
    }

    @PostMapping(value = "/artista/crear")
    public void saveArtist(@RequestBody ArtistaDTO artista){

        Artist artist = new Artist(artista.getId(), artista.getNombre());        
        service.saveArtista(artist);

    }

    @DeleteMapping(value = "/artista/borrar/{id}")
    public void deleteArtista(@PathVariable(name = "id") Integer id_artista){
        service.deleteArtist(id_artista);
    }
    
}
