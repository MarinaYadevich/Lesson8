package hw.task1.impl;

public class Surgeon implements Treat {    // хирург

    @Override
    public void treatPatient() {
        System.out.println("Хирург лечит по-своему.");
    }
}
