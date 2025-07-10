package BusReservation;

public class Bus {
    private int busNo;      //inside the class datas are in private only
    private boolean Ac;
    private int Capacity;   //Get and set method to access the data because all are in private

    Bus(int No,boolean Ac,int Cap){ //for each bus arraylist can inialize the values using constructor
        this.busNo=No;
        this.Ac=Ac;
        this.Capacity=Cap;
    }
    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }
    public boolean getAc() { //method in public //Acessor
        return Ac;
    }
    public void setAc(boolean Acs) { //Mutator
        Ac= Acs;
    }
    public int getCapacity() { //method in public //Acessor
        return Capacity;
    }
    public void setCapacity(int Cap) { //Mutator
        Capacity = Cap;
    }
    void displayBusInfo(){
        System.out.println("BusNo="+busNo+",Ac="+Ac+",Capacity="+Capacity);
    }
}
