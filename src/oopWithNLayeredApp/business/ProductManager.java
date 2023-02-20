package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {

    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception { //response request pattern
        //business rules - is kurallari
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyati 10 dan kücük olamaz");
        }

        ProductDao productDao = new JdbcProductDao();
        productDao.add(product);

//        JdbcProductDao  jdbcProductDao = new JdbcProductDao();
//        jdbcProductDao.add(product);
//
//        HibernateProductDao hibernateProductDao = new HibernateProductDao();
//        hibernateProductDao.add(product);

        for (Logger logger : loggers) { //{db,mail}
            logger.log(product.getName());
        }
    }
}
