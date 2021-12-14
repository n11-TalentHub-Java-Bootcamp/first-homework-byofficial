package DAOs;

import Base.BaseDao;
import Entities.Product;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.List;

public class ProductDao extends BaseDao implements IDaoBaseEntity {

    @Override
    public List<Product> findAll() {
        Query query = getCurrentSession().createQuery("select product from Product product");

        return query.list();
    }

    @Override
    public Product findById(Long id) {
        String sql="select product from Product product where product.id = :id";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id",id);

        return (Product) query.uniqueResult();
    }

    public List<Product> findAllProductListByPriceGeAndPriceLe(BigDecimal priceGe, BigDecimal priceLe){

        String sql="select product from Product product where 1=1";

        if(priceGe != null){
            sql = sql + " and product.price >= :priceGe ";
        }

        if(priceLe != null){
            sql = sql + " and product.price <= :priceLe ";
        }
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("priceGe", priceGe);
        query.setParameter("priceLe", priceLe);
        return query.list();

    }


    public List<Product> findAllProductListByProductBetween(BigDecimal priceGe, BigDecimal priceLe){

        String sql="select product from Product product where 1=1";

        if(priceGe != null && priceLe != null){
            sql = sql + " and product.price between :priceGe and :priceLe ";
        }

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("priceGe", priceGe);
        query.setParameter("priceLe", priceLe);
        return query.list();

    }


}
