package hw.task1;

import hw.task1.impl.Therapeutist;

public class Clinica {
    public static void main(String[] args) {

        Patient patient1 = new Patient();
        Therapeutist therapeutist = new Therapeutist();
        therapeutist.appointmentDoctors(patient1,3);
    }
}
