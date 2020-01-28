package hu.flowacademy.musicstore.Service;

import hu.flowacademy.musicstore.Exceptions.ValidationException;
import hu.flowacademy.musicstore.Model.Album;
import hu.flowacademy.musicstore.Model.Artist;
import hu.flowacademy.musicstore.Repository.AlbumRepo;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@NoArgsConstructor
public class AlbumService {


    @Autowired
    AlbumRepo albumRepo;


    //create
    public Album createAlbum(Album album) {
        if (album.getTitle()== null || album.getTitle()== "" && album.getCount() < 1)   {
            throw new ValidationException("Fill out the all fields and cont must be 1 or more");
        }
        return albumRepo.save(album);
    }

    //read one album
    public Album getAlbum(Long id){
        return albumRepo.findById(id).get();
    }

    //read all album
    public List<Album> findAll(){
        return albumRepo.findAll();
    }

    //delete album
    public void deleteAlbum(Long id){
        albumRepo.deleteById(id);
    }

    //update album
    public ResponseEntity<Void> updateAlbum(Album album) {
        if (album.getTitle()== null || album.getTitle()== "" && album.getCount() < 1) {
            throw new ValidationException("fill it out man!");
        }
        createAlbum(album);
        albumRepo.save(album);
        return ResponseEntity.ok().build();
    }
}
