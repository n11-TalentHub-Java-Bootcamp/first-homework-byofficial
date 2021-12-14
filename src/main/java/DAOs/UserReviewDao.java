package DAOs;

import Base.BaseDao;
import DTOs.UserReviewDto;
import org.hibernate.query.Query;

import java.util.List;

public class UserReviewDao extends BaseDao implements IDao{

    public List<UserReviewDto> findAllReviewUser(Long id){

        String sql=
                "select " +
                " new DTOs.UserReviewDto(user.id, user.firstName, product.productName, review.review, review.reviewDate) " +
                "from ProductReview review " +
                "left join User user on user.id= review.userId.id " +
                "left join Product product on product.id = review.productId.id " +
                "where review.userId.id = :id " ;


        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id", id);

        return query.list();
    }
}
