package Applications;


import Entities.Product;
import EntityServices.ProductEntityService;

import java.util.List;

public class TestApp {
    public static void main(String[] args) {
        ProductEntityService service = new ProductEntityService();
        List<Product> productList = service.findAll();

        for(Product product: productList){
            System.out.println(product);
        }
    }
}
