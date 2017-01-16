package rashjz.info.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import rashjz.info.app.domain.User;
import rashjz.info.app.domain.UsersEntity;
import rashjz.info.app.service.UserService;

/**
 * Created by Mobby on 1/5/2017.
 */
@Controller
public class MainController {


    public static final String PAGE_INDEX = "home";
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String gettopage(Model model) {
        User user = userService.loadByUsername("rashadjavad@gmail.com");
        model.addAttribute("user", user);
        userService.getListUsers();
        return PAGE_INDEX;
    }

    @RequestMapping(value = "/security-error", method = RequestMethod.GET)
    public String securityError(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("page_error", "You do have have permission to do that!");
        return "redirect:/"+PAGE_INDEX;
    }

    @RequestMapping(value = "/testpage", method = RequestMethod.GET)
    public String testPage(Model model) {
        model.addAttribute("val", new UsersEntity());
        return "test";
    }
}
