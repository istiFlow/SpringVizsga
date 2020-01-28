package hu.flowacademy.musicstore.DTO;

import hu.flowacademy.musicstore.Model.Genre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class SongDTO {

    private String title;
    private Long length;
    private String lyrics;
    private LocalDate year;
    private String writerName;
    private Genre genre;
}
