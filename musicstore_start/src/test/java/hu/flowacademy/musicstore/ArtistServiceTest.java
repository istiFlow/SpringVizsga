package hu.flowacademy.musicstore;

import hu.flowacademy.musicstore.Model.Artist;
import hu.flowacademy.musicstore.Service.ArtistService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ArtistServiceTest {

    @BeforeAll
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void save(@Mock ArtistService artistService) {
        Artist artist = new Artist();
        assertNotEquals("Lajos", artist.getFirstName());
    }

}
