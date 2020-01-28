package hu.flowacademy.musicstore.Repository;

import hu.flowacademy.musicstore.Model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepo extends JpaRepository<Album,Long> {
}
