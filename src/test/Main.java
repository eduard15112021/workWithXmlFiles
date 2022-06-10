package test;

import com.sun.xml.internal.ws.util.Pool;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try{

            Car car1 = new Car();
            Car car2 = new Car();
            Car car3 = new Car();

            car1.setMark("Audi");
            car1.setModel("A4");
            car1.setPower(320);
            car1.setMaxSpeed(250);
            car1.setPrice(23000);
            car1.setNumber("5544-AS7");

            car2.setMark("Audi");
            car2.setModel("TT");
            car2.setMaxSpeed(280);
            car2.setPower(365);
            car2.setPrice(29000);
            car2.setNumber("1234-AX7");

            car3.setModel("Porshe");
            car3.setMark("Macan");
            car3.setPower(378);
            car3.setMaxSpeed(290);
            car3.setPrice(35786);
            car3.setNumber("8877-7AE");

            ArrayList<Car> cars = new ArrayList<>();
            cars.add(car1);
            cars.add(car2);
            cars.add(car3);

            CarsList list = new CarsList();
            list.setList(cars);



            JAXBContext jaxbContext = JAXBContext.newInstance(CarsList.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            File file = new File("src/cars.xml");
            marshaller.marshal(list,file);

        }
        catch (Exception e){
            System.out.println("Error");
        }
/*
        try
        {
            File file = new File("src/cars.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(CarsList.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            CarsList list = (CarsList) unmarshaller.unmarshal(file);
            for(CarsList car1: list.getCar()){
                System.out.println(car1.);
            }
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }*/
    }
}
