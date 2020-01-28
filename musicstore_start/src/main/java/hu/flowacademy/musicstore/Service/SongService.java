package hu.flowacademy.musicstore.Service;

import hu.flowacademy.musicstore.Exceptions.ValidationException;
import hu.flowacademy.musicstore.Model.Artist;
import hu.flowacademy.musicstore.Model.Song;
import hu.flowacademy.musicstore.Repository.ArtistRepo;
import hu.flowacademy.musicstore.Repository.SongRepo;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@NoArgsConstructor
public class SongService {

    @Autowired
    SongRepo songRepo;



    //create
    public Song createSong(Song song) {
        if (song.getTitle() == "" || song.getArtist() == null || song.getAlbum() == null || song.getGenre() == null || song.getLength() < 1 || song.getYear() == null)   {
            throw new ValidationException("The time is too short to write more here.");
        }
        if(song.getWriterName()== "" || song.getWriterName()== null){
            Artist artist = new Artist();
            song.setWriterName(artist.getFirstName() + " "+ artist.getLastName());
        }
        return songRepo.save(song);
    }

    //read one song
    public Song getSong(Long id){
        return songRepo.findById(id).get();
    }

    //read all song
    public List<Song> findAll(){
        return songRepo.findAll();
    }

    //delete song
    public void deleteSong(Long id){
        songRepo.deleteById(id);
    }

    //update song
    public ResponseEntity<Void> updateSong(Song song) {
        if (song.getTitle() == "" || song.getArtist() == null || song.getAlbum() == null || song.getGenre() == null || song.getLength() < 1 || song.getYear() == null) {
            throw new ValidationException("something");
        }
        createSong(song);
        songRepo.save(song);
        return ResponseEntity.ok().build();
    }
}
