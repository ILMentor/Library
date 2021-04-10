package empire.of.lord.library.dao;

import empire.of.lord.library.models.Book;
import empire.of.lord.library.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookDAO {

    public List<Book> showAll(){
        return (List<Book>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Book").list();
    }

    public Book show(int id){
        return null;
    }

    public void create(Book book){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(book);
        tx1.commit();
        session.close();
    }

    public Book update(int id){
        return null;
    }

    public Book delete(int id){
        return null;
    }
}
