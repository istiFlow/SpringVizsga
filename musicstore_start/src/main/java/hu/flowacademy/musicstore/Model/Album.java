package hu.flowacademy.musicstore.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "_album")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Album {
    @Id
    private Long id;

    private String title;

    private Long count;

}



