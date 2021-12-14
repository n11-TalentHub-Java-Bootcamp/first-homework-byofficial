package DAOs;

import Base.BaseDao;
import Entities.User;
import org.hibernate.query.Query;

import java.util.List;

public class UserDao extends BaseDao implements IDaoBaseEntity {

    @Override
    public List<User> findAll() {
        Query query = getCurrentSession().createQuery("select user from User user");

        return query.list();
    }

    @Override
    public User findById(Long id) {
        String sql="select user from User user where user.id = :id";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id",id);

        return (User) query.uniqueResult();
    }
}
