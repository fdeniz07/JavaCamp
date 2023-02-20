package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {

        public void add(Product product){

                //sadece ve sadece db erisim kodlari buraya yazilir...SQL
                System.out.println("JDBC ile veritabanina eklendi");
        }
}

//Hibernate




