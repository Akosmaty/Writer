package factory;

import factory.brands.Alfa_Romeo;
import factory.brands.SKoda;
import factory.colors.Black;
import factory.colors.Red;
import factory.engines.E1L;
import factory.engines.E3L;
import factory.wheels.W15;
import factory.wheels.W19;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException  {


       // Cars car = new carSeller(new Alfa_Romeo().getBrand(), new E3L().getEngine(), new Red().getColor(), new W19().getWheel());
        Cars car = new CarSeller(new Alfa_Romeo(), new E3L(),  new Red(),  new W19());
        System.out.println(car);

        Cars car2 = new CarSeller(new SKoda(), new E1L(),  new Black(),  new W15());
        System.out.println(car2);
        ArrayList<Cars> carsToWrite  = new ArrayList<Cars>();
        carsToWrite.add(car);
        carsToWrite.add(car2);


        File file = new File("Car.txt");
        FileWriter writer = new FileWriter("Car.txt");
        for(int i = 0; i<carsToWrite.size();i++){
            writer.write(carsToWrite.get(i).toString()+ "\n");
        }
        writer.close();


    }
}


