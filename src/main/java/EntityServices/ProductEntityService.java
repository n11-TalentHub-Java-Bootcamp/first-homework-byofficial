package EntityServices;

import DAOs.ProductDao;
import Entities.Product;

import java.math.BigDecimal;
import java.util.List;

public class ProductEntityService {

    private ProductDao productDao;

    public ProductEntityService(){
        productDao = new ProductDao();
    }

    public List<Product> findAll() {
        return productDao.findAll();
    }

    public Product findById(Long id) {
        return productDao.findById(id);
    }

    public List<Product> findAllProductListByPriceGeAndPriceLe(BigDecimal priceGe, BigDecimal priceLe){
        return productDao.findAllProductListByPriceGeAndPriceLe(priceGe,priceLe);
    }

    public List<Product> findAllProductListByProductBetween(BigDecimal priceGe, BigDecimal priceLe){
        return productDao.findAllProductListByProductBetween(priceGe, priceLe);

    }
}
