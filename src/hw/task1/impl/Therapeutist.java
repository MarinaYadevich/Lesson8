package hw.task1.impl;

import hw.task1.Patient;

public class Therapeutist implements Treat {

    @Override
    public void treatPatient() {
        System.out.println("Терапевт лечит по-своему.");
    }

    public void appointmentDoctors(Patient patient, int numberPlanTreatment){
        switch (numberPlanTreatment){
            case 1:
                System.out.println("Назначение хирурга.");
                Surgeon surgeon = new Surgeon();
                        surgeon.treatPatient();
                        break;
            case 2:
                System.out.println("Назначение дантиста.");
                Dentist dentist = new Dentist();
                dentist.treatPatient();
                break;
            default:
                System.out.println("Назначить терапевта.");
                Therapeutist therapeutist = new Therapeutist();
                therapeutist.treatPatient();
        }
    }
}
