package rashjz.info.app.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import rashjz.info.app.controller.MainController;
import rashjz.info.app.domain.UsersEntity;
import rashjz.info.app.service.UserService;

import static org.hamcrest.CoreMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Rashad Javadov on 1/14/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class UserDaoMockitoTestImpl {

    private MockMvc mockMvc;

    @Mock
    private UserService userService;

    @Before
    public void setup() {
        final MainController mainController = new MainController();
        mainController.setUserService(userService);
        mockMvc = MockMvcBuilders.standaloneSetup(mainController).build();
    }


    @Test
    public void findAll_Main_Controller_Index_View() throws Exception {
        mockMvc.perform(get("/index"))
                .andExpect(status().isOk())
//                .andExpect(forwardedUrl(MainController.PAGE_INDEX))
                .andExpect(model().attributeExists("user"))
        ;

    }

    @Test
    public void testPageView() throws Exception {
        mockMvc.perform(get("/testpage"))
                .andExpect(status().isOk())
                .andExpect(model().attribute("val", any(UsersEntity.class)))
        ;


//        this.mockMvc.perform(post("/globalerrors/password")
//                .param("password", "test").param("confirmedPassword", "other"))
//                .andExpect(globalErrors().hasGlobalError(
//                                "passwordForm", "passwords do not match")
//                )
//                .andExpect(status().isOk())
//                .andExpect(view().name("globalerrors/password"));

    }


}
