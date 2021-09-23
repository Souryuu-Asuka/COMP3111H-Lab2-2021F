package COMP3111.Lab2.ex2;

interface Chargeable {
    public void charge();
}

public class Charger {
    public void charge(Chargeable c) {
        c.charge();
    }
}
