package rashjz.info.service;

import rashjz.info.domain.User;

/**
 * Created by Rashad Javadov on 1/12/2017.
 */

public interface UserService {

    public User loadByUsername(String username);
}
