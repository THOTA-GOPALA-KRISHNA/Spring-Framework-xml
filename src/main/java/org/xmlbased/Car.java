package org.xmlbased;

public class Car {

    private int Cc;
    private TATA tata;

    public Car()
    {
        System.out.println("Car object is created");
    }

    public Car(int Cc, TATA tata)
    {
        System.out.println("Parameterized constructor is called");
        this.Cc = Cc;
        this.tata = tata;
    }





    public void drive()
    {
        System.out.println("Car is driving");
        tata.driver();
    }

    public int getCc() {
        return Cc;
    }

    public void setCc(int Cc) {
        System.out.println("Setter method is called");
        this.Cc = Cc;
    }

    public TATA getTata() {
        return tata;
    }

    public void setTata(TATA tata) {
        this.tata = tata;
    }
}
