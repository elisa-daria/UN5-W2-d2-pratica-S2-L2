package elisadaria.UN5W2d2praticaS2L2.controllers;

import elisadaria.UN5W2d2praticaS2L2.entities.Author;
import elisadaria.UN5W2d2praticaS2L2.services.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/authors")
public class AuthorsController {
    @Autowired
    AuthorsService authorsService;
    //GENERIC GET
    @GetMapping
    public List<Author>getAuthors(){
       return authorsService.getAuthorsList();
    }
    //POST
    @PostMapping
    public Author savingAuthor(@RequestBody Author body){
        System.out.println(body);
        return this.authorsService.savingAuthor(body);
    }

}
