package factory;

public class carSeller implements Cars {
    public Brand brand;
    public Engine engine;
    public Color color;
    public Wheels size;


    public carSeller(Brand brand, Engine engine, Color color, Wheels size) {
        this.brand = brand;
        this.engine = engine;
        this.color = color;
        this.size = size;
    }

    public String getBrand() {
        return brand.getBrand();
    }
    public int getBrandPrice(){return brand.getBrandPrice();}

    public String getEngine() {
        return engine.getEngine();
    }
    public int getEnginePrice(){return engine.getEnginePrice();}

    public String getColor() {
        return color.getColor();
    }
    public int getColorPrice(){return color.getColorPrice();}

    public String getSize(){
        return size.getSize();
    }
    public int getPrice(){return size.getPrice();}
    public int getSum(){
        return getBrandPrice()+getColorPrice()+getEnginePrice()+getPrice();}



    public String toString(){
        return " Marka, cena w PLN: "+ getBrand()+" "+getBrandPrice() + "\n Pojemnosc i cena silnika w PLN : " + getEngine() + " "+ getEnginePrice()+
                "\n Kolor i cena w PLN: " + getColor() +" "+getColorPrice()  + "\n Rozmiar i cena w PLN  felg: " + getSize() + " " + getPrice()+ "\n Cena do zaplaty: " + getSum();
    }

}

