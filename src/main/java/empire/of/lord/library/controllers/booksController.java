package empire.of.lord.library.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class booksController {
    // todo fix problem Cannot resolve MVC view 'index'
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
