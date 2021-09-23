package COMP3111.Lab2.ex1;

public class MobileComputer extends Computer {
    private int battery;

    public MobileComputer() {
        super();
        secret = "MobileComputer secret";
        battery = 5;
    }

    @Override
    public void work() {
        if (battery > 0) {
            System.out.println("It is working on my lap.");
            battery--;
        } else {
            System.out.println("Running out of battery");
        }
    }

    public void charge() {
        if (battery < 10)
            battery++;
    }
}
