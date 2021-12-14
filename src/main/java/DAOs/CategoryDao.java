package DAOs;

import Base.BaseDao;
import Entities.Category;
import org.hibernate.query.Query;

import java.util.List;

public class CategoryDao extends BaseDao implements IDaoBaseEntity {


    @Override
    public List<Category> findAll() {
        Query query = getCurrentSession().createQuery("select category from Category category");

        return query.list();
    }

    @Override
    public Category findById(Long id) {
        String sql="select category from Category category where category.id = :id";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id",id);

        return (Category) query.uniqueResult();

    }
}
