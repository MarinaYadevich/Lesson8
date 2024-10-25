package hw.task1.impl;

public class Dentist implements Treat {
    @Override
    public void treatPatient() {
        System.out.println("Дантист лечит по-своему.");
    }
}
