package hu.flowacademy.musicstore.Controller;

import hu.flowacademy.musicstore.Model.Artist;
import hu.flowacademy.musicstore.Service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @PostMapping("/artists")
    public ResponseEntity save(@RequestBody Artist artist){
            artistService.createArtist(artist);
            return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/artists")
    public List<Artist> findAll(){
        return artistService.findAll();
    }

    @GetMapping("/artists/{id}")
    public Artist get(@PathVariable Long id ){
        return artistService.getArtist(id);
    }

    @PutMapping("/artists")
    public ResponseEntity update(@RequestBody Artist artist){
        artistService.updateArtist(artist);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/artists/{id}")
    public ResponseEntity<Void> deleteArtists(@PathVariable Long id){
        artistService.deleteArtist(id);
        return ResponseEntity.ok().build();
    }
}
