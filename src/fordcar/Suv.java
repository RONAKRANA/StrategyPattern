package fordcar;

/* Client 2 uses another algorithm (BrakeWithABS) in the constructor */
public class Suv extends Car {
    public Suv() {
        super(new BrakeWithABS());
    }
}