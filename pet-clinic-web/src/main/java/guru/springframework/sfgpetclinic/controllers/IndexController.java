package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    //when the request comes to root context, root/index or index.html , there all gonna match to request mapping
    @RequestMapping({"","/","index","index.html"})
    public String index() {
        return "index";
    }
}
