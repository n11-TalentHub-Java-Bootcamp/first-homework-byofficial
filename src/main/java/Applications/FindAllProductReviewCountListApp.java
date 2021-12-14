package Applications;

import DTOs.ProductReviewCountDto;
import EntityServices.ProductReviewEntityService;

import java.util.List;

public class FindAllProductReviewCountListApp {

        public static void main(String[] args) {
            //Problem 3 Solved
            ProductReviewEntityService service = new ProductReviewEntityService();
            List<ProductReviewCountDto> productReviewCountList = service.findProductReviewCount(1L);

            for (ProductReviewCountDto productReviewCountDto : productReviewCountList){
                System.out.println(productReviewCountDto);
            }

    }
}
