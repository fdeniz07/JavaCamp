package oop;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Delongi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.jpg");


        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.jpg");


        //get
        Product[] products = {product1,product2,product3};
        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>"+product.getName()+"</li>");

        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer =new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("12345412121");
        individualCustomer.setCustomerNumber("111");
        individualCustomer.setFirstName("Fatih");
        individualCustomer.setLastName("Deniz");

        CorporateCutomer corporateCutomer = new CorporateCutomer();
        corporateCutomer.setId(2);
        corporateCutomer.setCompanyName("Kodlama.io");
        corporateCutomer.setPhone("123456789");
        corporateCutomer.setTaxNumber("111111111111");
        corporateCutomer.setCustomerNumber("989898");

        Customer[] customers= {individualCustomer,corporateCutomer};

    }
}
