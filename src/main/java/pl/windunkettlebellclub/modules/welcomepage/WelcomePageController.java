package pl.windunkettlebellclub.modules.welcomepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class WelcomePageController {

    @RequestMapping(method = RequestMethod.GET)
    public String welcomePage() {
        return "index.html";
    }

}
