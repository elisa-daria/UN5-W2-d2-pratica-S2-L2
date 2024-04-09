package elisadaria.UN5W2d2praticaS2L2.entities;

import lombok.Data;

import java.time.LocalTime;
@Data
public class Author {
    private int id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private String readingTime;

}
