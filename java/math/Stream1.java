import java.util.*;
import java.util.stream.Stream;

public  class Stream1{
    record Car(String type, String make){}
    public static void main(String[] args) {
        
        List<Car> cars=List.of(
            new Car("sedan", "BMW"),
            new Car("sedan", "BMW"),
            new Car("SUV", "Audi"),
            new Car("XUV", "BMW"),
            new Car("hatchback", "Mercedes"),
            new Car("SUV", "Toyota"),
            new Car("SUV", "BMW")

        );

        // creating the stream
        List<Car> sedanCars=cars.stream().filter(c->c.type.equals("sedan")).toList();

        List<String> carMkaeList=cars.stream().map(car->car.make).toList();

        List<String> carMkaeLists=cars.stream().flatMap(car-> Stream.of(car.make,car.type)).toList();


        // for(Car c:carMkaeList){
        //     System.out.println(c);
        // }

        System.out.println(carMkaeLists);
    }
}