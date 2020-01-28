package hu.flowacademy.musicstore.Repository;

import hu.flowacademy.musicstore.Model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepo extends JpaRepository<Song,Long> {
}
