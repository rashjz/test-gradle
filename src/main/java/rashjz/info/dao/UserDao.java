package rashjz.info.dao;

import rashjz.info.domain.User;
import rashjz.info.service.UserService;

/**
 * Created by Rashad Javadov on 1/12/2017.
 */
public interface UserDao {

    public User loadByUsername(String username);
}
