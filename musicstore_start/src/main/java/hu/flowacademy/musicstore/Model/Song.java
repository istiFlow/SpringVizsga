package hu.flowacademy.musicstore.Model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import javax.persistence.Id;
import java.time.LocalDate;

public class Song {

    @Id
    private Long id;

    private String title;

    private Long length;

    private String lyrics;

    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate year;

    private String writerName;

    private Genre genre;

    private Artist artist;

    private Album album;

}
