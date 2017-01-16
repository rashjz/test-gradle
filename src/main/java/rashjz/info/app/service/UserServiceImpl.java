package rashjz.info.app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rashjz.info.app.dao.UserDao;
import rashjz.info.app.domain.User;
import rashjz.info.app.domain.UsersEntity;

import java.util.List;

/**
 * Created by Rashad Javadov on 1/12/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    //    @Autowired
    public void UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User loadByUsername(String username) {
        return userDao.loadByUsername(username);
    }

    public List<UsersEntity> getListUsers() {

        return userDao.getListUsers();
    }
}
