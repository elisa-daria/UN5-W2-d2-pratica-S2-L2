package elisadaria.UN5W2d2praticaS2L2.entities;

import lombok.*;

import java.time.LocalDate;

@Data
public class BlogPost {

    private int id;
    private String name;
    private String surname;
    private String email;
    private LocalDate dateOfBirth;
    private String avatar;
}
