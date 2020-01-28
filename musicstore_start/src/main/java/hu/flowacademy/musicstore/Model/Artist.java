package hu.flowacademy.musicstore.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Artist {
    @Id
    private Long id;

    private String firstName;

    private String lastName;



}
