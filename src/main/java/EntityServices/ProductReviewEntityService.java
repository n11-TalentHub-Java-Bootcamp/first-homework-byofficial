package EntityServices;

import DAOs.ProductReviewDao;
import DTOs.ProductReviewCountDto;
import DTOs.ProductReviewDto;

import java.util.List;

public class ProductReviewEntityService {
    private ProductReviewDao productReviewDao;

    public ProductReviewEntityService() {
        productReviewDao = new ProductReviewDao();
    }

    public List<ProductReviewDto> findAllProductReviewList(Long id){
        return productReviewDao.findAllProductReviewList(id);
    }

    public List<ProductReviewCountDto> findProductReviewCount(Long id){
        return productReviewDao.findProductReviewCount(id);
    }
}
