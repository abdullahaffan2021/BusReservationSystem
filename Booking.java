package BusReservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*; //already define the date class
public class Booking {
    String passengerName;
    int busNo;
    Date date;
    Booking(){
        //constructor getting all the date from user and initialize it
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Name-");
        passengerName=scanner.next();
        System.out.println("Enter Your BusNumber-");
        busNo=scanner.nextInt();
        System.out.println("Enter Your Booking Date(dd-mm-yyyy)-");
        String dateInput=scanner.next();        //Covert String to Date using simpledateformat class ku object create pannanum
        SimpleDateFormat obj=new SimpleDateFormat("dd-MM-yyyy"); //set a pattern for date
        try {
            date=obj.parse(dateInput); //invoke the parse method inbuilt format
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus>Buses){ //Pasing The Array List To Check The Availability
        int Capacitys=0;
        for(Bus bus:Buses){
            if (bus.getBusNo() == busNo) { //This method invoke this class object as bookings so we directly mention the busNo to check it.
                    Capacitys = bus.getCapacity();
            }
        }
        int booked=0; //To write the below code for checking the date and busno is already book or not by using for and if loop
        for(Booking b:bookings){ //Taking The Completelist of Each Booking Arraylist
            if(b.busNo == busNo && b.date.equals(date)){ //same class variable as busno,date
                booked++;
            }
        }
        return booked < Capacitys; //Method as booking is available can return the true or false using this operator
    }
}
