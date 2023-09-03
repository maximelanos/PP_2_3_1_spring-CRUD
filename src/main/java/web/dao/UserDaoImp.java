package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional
public class UserDaoImp implements UserDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<User> findAll() {
        return em.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void create(User user) {
        em.persist(user);
        em.flush();
    }

    @Override
    public User read(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public void update(User user) {
        em.merge(user);
        em.flush();
    }

    @Override
    public User delete(Long id) {
        User user = read(id);
        em.remove(user);
        em.flush();
        return user;
    }
}
