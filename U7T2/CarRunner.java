package U7T2;

import java.util.ArrayList;
import java.util.Arrays;

public class CarRunner
{
    public static int passedTests = 0;
    public static int failedTests = 0;

    public static void main(String[] args)
    {
        Car[] cars = new Car[3];

        cars[0] = new Car("Volkswagon Beatle", 1000);
        cars[1] = new Car("Toyota Corola", 50000);
        cars[2] = new Car("Toyoya Prius", 105000);

        ArrayList<Car> carList = new ArrayList<>(Arrays.asList(cars));

        System.out.println(carList);

    }
}
