package rashjz.info.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Mobby on 1/5/2017.
 */
@Controller
public class MainController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String gettopage() {
        return "home";
    }
}
