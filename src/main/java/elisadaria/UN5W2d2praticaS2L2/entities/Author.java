package elisadaria.UN5W2d2praticaS2L2.entities;

import lombok.Data;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
@Data
public class Author {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String dateOfBirth;
    private String avatar;

}
