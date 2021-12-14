package DAOs;

import Base.BaseDao;
import DTOs.ProductReviewCountDto;
import DTOs.ProductReviewDto;
import org.hibernate.query.Query;

import java.util.List;

public class ProductReviewDao extends BaseDao implements IDao{

    public List<ProductReviewDto> findAllProductReviewList(Long id){

        String sql=
                "select " +
                "new DTOs.ProductReviewDto(product.productName, product.category.categoryName, product.price, user.firstName, user.lastName, user.phoneNumber, review.review,review.reviewDate) " +
                "from ProductReview review " +
                "left join User user on user.id= review.userId.id " +
                "left join Product product on product.id = review.productId.id " +
                "where review.productId.id = :id " ;

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id", id);

        return query.list();
    }

    public List<ProductReviewCountDto> findProductReviewCount(){

        String sql=
                "select " +
                "new DTOs.ProductReviewCountDto(product.id, product.productName, product.price, count(review.id)) " +
                "from ProductReview review " +
                "left join Product product on product.id = review.productId.id " +
                "group by  product.id" ;

        Query query = getCurrentSession().createQuery(sql);


        return query.list();
    }
}
