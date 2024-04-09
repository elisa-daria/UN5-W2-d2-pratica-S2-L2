package elisadaria.UN5W2d2praticaS2L2.services;

import elisadaria.UN5W2d2praticaS2L2.entities.Author;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AuthorsService {
    public List<Author> authors=new ArrayList<>();
    Random rdm=new Random();

    //returning all authors
    public List<Author> getAuthorsList() {
        return authors;
    }
    //saving Author
    public Author savingAuthor(Author author){
        author.setId(rdm.nextInt(1,999));
        this.authors.add(author);
        return author;
    }
}
