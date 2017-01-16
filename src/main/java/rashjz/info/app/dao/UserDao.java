package rashjz.info.app.dao;

import rashjz.info.app.domain.User;
import rashjz.info.app.domain.UsersEntity;

import java.util.List;

/**
 * Created by Rashad Javadov on 1/12/2017.
 */
public interface UserDao {

    public User loadByUsername(String username);
    public List<UsersEntity> getListUsers();
}
