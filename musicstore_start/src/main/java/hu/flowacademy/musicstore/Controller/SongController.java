package hu.flowacademy.musicstore.Controller;

import hu.flowacademy.musicstore.Model.Artist;
import hu.flowacademy.musicstore.Model.Song;
import hu.flowacademy.musicstore.Service.ArtistService;
import hu.flowacademy.musicstore.Service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SongController {

    @Autowired
    private SongService songService;

    @PostMapping("/songs")
    public ResponseEntity save(@RequestBody Song song){
        songService.createSong(song);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/songs")
    public List<Song> findAll(){
        return songService.findAll();
    }

    @GetMapping("/songs/{id}")
    public Song get(@PathVariable Long id ){
        return songService.getSong(id);
    }

    @PutMapping("/songs")
    public ResponseEntity update(@RequestBody Song song){
        songService.updateSong(song);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/songs/{id}")
    public ResponseEntity<Void> deleteArtists(@PathVariable Long id){
        songService.deleteSong(id);
        return ResponseEntity.ok().build();
    }
}
