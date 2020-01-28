package hu.flowacademy.musicstore.Repository;

import hu.flowacademy.musicstore.Model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepo extends JpaRepository<Artist,Long> {
}
