package rashjz.info.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rashjz.info.dao.UserDao;
import rashjz.info.domain.User;

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
}
