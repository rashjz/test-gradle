import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import rashjz.info.dao.UserDao;
import rashjz.info.domain.User;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Rashad Javadov on 1/12/2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/test-context.xml"})
public class UserDaoSpringJunitTest {


    @Autowired
    UserDao userDao;

    private User user;

    @Test
    public void loadbyUserNameTestMethod() {
        User user = userDao.loadByUsername("test");
        assertNotNull(user);
    }



}
