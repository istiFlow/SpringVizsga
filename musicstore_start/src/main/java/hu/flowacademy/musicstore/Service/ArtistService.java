package hu.flowacademy.musicstore.Service;

import hu.flowacademy.musicstore.Exceptions.ValidationException;
import hu.flowacademy.musicstore.Model.Album;
import hu.flowacademy.musicstore.Model.Artist;
import hu.flowacademy.musicstore.Repository.ArtistRepo;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@NoArgsConstructor
public class ArtistService {

    @Autowired
    ArtistRepo artistRepo;
    //create
    public Artist createArtist(Artist artist) {
        if (StringUtils.isEmpty(artist.getFirstName()) && StringUtils.isEmpty(artist.getLastName()) || (artist.getFirstName() == null || artist.getLastName()== null))   {
        throw new ValidationException("Fill out the all fields");
        }
        return artistRepo.save(artist);
    }

    //read one Artist
    public Artist getArtist(Long id){
        return artistRepo.findById(id).get();
    }

    //read all Artist
    public List<Artist> findAll(){
        return artistRepo.findAll();
    }

    //delete artist
    public void deleteArtist(Long id){
        artistRepo.deleteById(id);
    }

    //update user
    public ResponseEntity<Void> updateArtist(Artist artist) {
        if(artist.getId() == null || artist.getLastName() == null || artist.getFirstName() == null){
            throw new ValidationException("fill it out man!");
        }
        createArtist(artist);
        artistRepo.save(artist);
        return ResponseEntity.ok().build();
    }
}
