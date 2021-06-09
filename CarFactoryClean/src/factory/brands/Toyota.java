package factory.brands;

import factory.Brand;

public class Toyota implements Brand {


    public String getBrand() {
        return "Toyota";
    }

    public int getBrandPrice(){return 100_000;}
}
