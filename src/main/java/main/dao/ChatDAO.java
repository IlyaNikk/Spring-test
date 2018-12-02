package main.dao;

import main.entities.Chat;
import main.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.criteria.internal.ValueHandlerFactory;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatDAO {

    public void addNewChat(Chat chat) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        NativeQuery<ChatDAO> q = session.createNativeQuery("insert into Chat(creator, title, create_date) values (:creator, :title, :create_date)");
        q.setParameter("creator", chat.getCreator().getId());
        q.setParameter("title", chat.getTitle());
        q.setParameter("create_date", chat.getDate());
        Transaction tx1 = session.beginTransaction();
        q.executeUpdate();
        tx1.commit();
        session.close();
    }

    public Chat getChatInfo(Long id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Chat> q = cb.createQuery(Chat.class);
        Root<Chat> c = q.from(Chat.class);
        ParameterExpression<Integer> p = cb.parameter(Integer.class);
        q.select(c).where(cb.equal(c.get("id"), id));
        List<Chat> res = session.createQuery(q).getResultList();

        tx1.commit();
        session.close();
        return res.get(0);
    }
}
