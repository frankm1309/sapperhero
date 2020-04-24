package nl.sapperheroes.dao;

import nl.sapperheroes.model.user.User;
import org.springframework.stereotype.Repository;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class UserDao extends GenericDao{


    public User findUserById(Integer id) {
        return em.find(User.class, id);
    }


    public User saveOrUpdateUser(User user){
        return em.merge(user);
    }

    public User getUser(Integer id){
        return em.find(User.class, id);
    }

    public void deleteUser(Integer id) {
        em.remove(em.find(User.class, id));
    }

    public List<User> listAllUsers() {
        CriteriaQuery<User> criteriaQuery = em.getCriteriaBuilder().createQuery(User.class);
        Root<User> root = criteriaQuery.from(User.class);
        return em.createQuery(criteriaQuery).getResultList();
    }

}