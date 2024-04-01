package ies6.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class controlador {
    @GetMapping("/")
    public String holaMundo (){

        return "index";
    }
}
 