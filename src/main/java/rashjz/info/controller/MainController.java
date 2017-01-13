package rashjz.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import rashjz.info.domain.User;
import rashjz.info.service.UserService;

/**
 * Created by Mobby on 1/5/2017.
 */
@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/","index"}, method = RequestMethod.GET)
    public String gettopage(Model model) {
        User user = userService.loadByUsername("test@box");
        model.addAttribute("user",user);
        return "home";
    }

    @RequestMapping(value = "/security-error", method = RequestMethod.GET)
    public String securityError(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("page_error", "You do have have permission to do that!");
        return "redirect:/";
    }
}
