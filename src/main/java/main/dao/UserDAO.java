package main.dao;

import main.entities.User;
import main.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDAO {

    public void addNewUser(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public User getUserInfo(Long userId) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, userId);
    }
}
