package elisadaria.UN5W2d2praticaS2L2.controllers;

import elisadaria.UN5W2d2praticaS2L2.services.BlogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blogs")
public class BlogsController {
    @Autowired
    BlogsService blogsService;
}
