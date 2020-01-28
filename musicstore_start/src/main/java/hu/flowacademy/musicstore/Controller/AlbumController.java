package hu.flowacademy.musicstore.Controller;

import hu.flowacademy.musicstore.Model.Album;
import hu.flowacademy.musicstore.Model.Artist;
import hu.flowacademy.musicstore.Service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @PostMapping("/albums")
    public ResponseEntity save(@RequestBody Album album){
        albumService.createAlbum(album);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/albums")
    public List<Album> findAll(){
        return albumService.findAll();
    }

    @GetMapping("/albums/{id}")
    public Album get(@PathVariable Long id ){
        return albumService.getAlbum(id);
    }

    @PutMapping("/albums")
    public ResponseEntity update(@RequestBody Album album){
        albumService.updateAlbum(album);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/albums/{id}")
    public ResponseEntity<Void> deleteArtists(@PathVariable Long id){
        albumService.deleteAlbum(id);
        return ResponseEntity.ok().build();
    }
}
