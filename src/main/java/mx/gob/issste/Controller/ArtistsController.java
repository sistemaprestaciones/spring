package mx.gob.issste.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.gob.issste.Entities.Artists;

@RestController
@RequestMapping(value = "/tienda")
public class ArtistsController {

    @GetMapping(value = "/artistas")
    public Artists getArtistas(){
        
    }
    
}
