package rashjz.info.dao;

import org.springframework.stereotype.Repository;
import rashjz.info.domain.User;

import java.util.logging.Logger;

/**
 * Created by Rashad Javadov on 1/12/2017.
 */
@Repository
public class UserDaoImpl implements UserDao {
    public static Logger logger = Logger.getLogger(UserDaoImpl.class.getName());

    @Override
    public User loadByUsername(String username) {

        User user = new User();
        user.setEmail(username);
        logger.info("username : " + username + " user " + user);
        return user;
    }
}
