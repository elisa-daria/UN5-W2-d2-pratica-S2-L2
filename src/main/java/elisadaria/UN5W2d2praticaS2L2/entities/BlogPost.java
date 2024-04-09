package elisadaria.UN5W2d2praticaS2L2.entities;

import lombok.*;

import java.time.LocalDate;

@Data
public class BlogPost {
    private int id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private String readingTime;
}
