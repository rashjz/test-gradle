package rashjz.info.app.service;

import rashjz.info.app.domain.User;
import rashjz.info.app.domain.UsersEntity;

import java.util.List;

/**
 * Created by Rashad Javadov on 1/12/2017.
 */

public interface UserService {

    public User loadByUsername(String username);

    public List<UsersEntity> getListUsers();
}
