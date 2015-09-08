package planet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/first")
public class MainController {

    @RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
    public String test() {
        return "index2";
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String secondTest() {
        return "home";
    }
}
