package hu.flowacademy.musicstore.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Component
public class ArtistDTO {

    private String firstName;
    private String lastName;

}
