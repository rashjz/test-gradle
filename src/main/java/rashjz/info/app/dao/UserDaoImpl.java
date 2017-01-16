package rashjz.info.app.dao;

import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import rashjz.info.app.configuration.SessionFactoryHelper;
import rashjz.info.app.domain.User;
import rashjz.info.app.domain.UsersEntity;

import java.util.List;
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
        user.setName("Rashad");
        user.setSurname("Javadov");
        logger.info("username : " + username + " user " + user);
        return user;
    }

    @Override
    public List<UsersEntity> getListUsers() {
        List<UsersEntity> list = null;
        org.hibernate.Session session = SessionFactoryHelper.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(UsersEntity.class);
        list = (List<UsersEntity>) criteria.list();
        transaction.commit();
        session.close();
        logger.info("user List ::::: " + list.size());
        return list;
    }


}
