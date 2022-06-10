import java.util.ArrayList;
import java.util.Scanner;

public class Car {

    public static int numOfCars = 0;
    public int numOfCurrentCar;
    Car()
    {
        numOfCars++;
    }
    public int yearOfProduction;
    public double engineCapacity;

    static Car []arr = new Car[4];
    public void input(){

        numOfCurrentCar = numOfCars;

        System.out.print("Car #"+numOfCars+"\nYear of production: ");

        Scanner in = new Scanner(System.in);
        yearOfProduction = in.nextInt();

        System.out.print("Engine capacity (cb): ");
        engineCapacity = in.nextDouble();
    }


    public static void showCars(Car []arr)
    {
        System.out.println();
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Car #"+arr[i].numOfCurrentCar+"\nYear of production: "+arr[i].yearOfProduction);
            System.out.println("Engine capacity (cb): "+arr[i].engineCapacity+"\n");

        }
    }

    public static void bubbleSort(Car[] arr){

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

            if( arr[j].yearOfProduction > arr[j+1].yearOfProduction ){
                Car tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;

            }
        }
    }
}

    public static void main(String [] args)
    {

        Car car1 = new Car();
        car1.input();

        Car car2 = new Car();
        car2.input();

        Car car3 = new Car();
        car3.input();

        Car car4 = new Car();
        car4.input();

        arr[0] = car1;
        arr[1] = car2;
        arr[2] = car3;
        arr[3] = car4;

        bubbleSort(arr);
        showCars(arr);

    }

}
