package Applications;

import DTOs.ProductReviewDto;
import EntityServices.ProductReviewEntityService;

import java.util.List;

public class FindAllProductReviewListApp {
    public static void main(String[] args) {
        //Problem 2 solved
        ProductReviewEntityService service = new ProductReviewEntityService();
        List<ProductReviewDto> productList = service.findAllProductReviewList(1L);

        for (ProductReviewDto productReviewDto : productList){
            System.out.println(productReviewDto);
        }
    }
}
