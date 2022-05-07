package Hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurgeonTest {

    Surgeon underTest = new Surgeon("1", "name", "speciality", true);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevelOfPatientFrom10To20WhenProvidedCare() {
        underTest.careForPatient(sickPatient);
        int healthLevel = sickPatient.getHealthLevel();
        assertEquals(20, healthLevel);
    }

    @Test
    public void decreaseBloodLevelFrom20To15WhenBloodIsDrawn() {
        underTest.drawBlood(sickPatient);
        int bloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, bloodLevel);
    }

    @Test
    public void shouldExpectASalaryOf100K() {
        int salary = underTest.calculatePay();
        assertEquals(100000, salary);
    }
}
