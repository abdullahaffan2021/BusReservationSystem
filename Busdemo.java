package BusReservation;
import java.util.ArrayList;
import java.util.Scanner;
public class Busdemo {
    public static void main(String[] args) {
        //Bus[] buses=new Bus[50]; instead of using array weusing the collection concept as list
        ArrayList<Bus> Buses=new ArrayList<Bus>(); //Arraylist is inbuild class for Bus Info Store Process
        ArrayList<Booking> bookings=new ArrayList<Booking>(); //Create a array List To Store the booking info
        Buses.add(new Bus(1,true,2));//By using the Buses object we can add the values using constructor
        Buses.add(new Bus(2,true,52));
        Buses.add(new Bus(3,false,50));
        int useropt=1;
        Scanner scanner=new Scanner(System.in);
        for(Bus b:Buses){
            b.displayBusInfo(); //Bus class are store in Array List So we Use the Buses object an display the each buses which present in the array list
        }
        while(useropt==1) {
            System.out.println("Enter 1 to Book and 2 to Exit");
            useropt=scanner.nextInt();
            if(useropt==1){
                Booking booking =new Booking();
                if(booking.isAvailable(bookings,Buses)) //To send the two list to check the availability of seats capacity
                {
                    bookings.add(booking);
                    System.out.println("Your  Booking is Confirmed");
                }
                else{
                    System.out.println("Sorry!Alread Bus is Filled Try Another Bus(or) Date");
                }
            }
        }

    }
}
