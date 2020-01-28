package hu.flowacademy.musicstore.Service;

import hu.flowacademy.musicstore.Exceptions.ValidationException;
import hu.flowacademy.musicstore.Model.Artist;
import hu.flowacademy.musicstore.Repository.ArtistRepo;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
}
