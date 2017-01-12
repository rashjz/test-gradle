package controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.stereotype.Controller;

/**
 * Created by Mobby on 1/5/2017.
 */
@Controller
public class MainController {

//    @RequestMapping(value="/method2", method=RequestMethod.POST)
    public String gettopage() {
        return "home";
    }
}
