package hu.flowacademy.musicstore.utils;



import hu.flowacademy.musicstore.Repository.AlbumRepo;
import hu.flowacademy.musicstore.Repository.ArtistRepo;
import hu.flowacademy.musicstore.Repository.SongRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.transaction.Transactional;

@Component
@Transactional
@Slf4j
@AllArgsConstructor
public class InitDataLoader {

    private final AlbumRepo albumRepo;
    private final ArtistRepo artistRepo;
    private final SongRepo songRepo;


/*    @PostConstruct
    public void init() {
        loadAlbum();
        loadArtist();
        loadSong()
       // loadCart();
    }

    private void loadAlbum() {
        albumRepo.save(
    }

  */




}
