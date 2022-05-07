package Hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoctorTest {

    Doctor underTest = new Doctor("1", "name", "speciality");
    Patient sickPatient = new Patient();


    @Test
    public void shouldIncreaseHealthLevelOfPatientFrom10To20WhenProvidedCare() {
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(20, patientHealthLevel);
    }

    @Test
    public void decreaseBloodLevelFrom20To15WhenBloodIsDrawn() {
        underTest.drawBlood(sickPatient);
        int bloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, bloodLevel);
    }

    @Test
    public void shouldExpectASalaryOf90K() {
        int salary = underTest.calculatePay();
        assertEquals(90000, salary);
    }
}