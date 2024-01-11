package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
    Job Job1 = new Job();
    Job Job2 = new Job();
        assertNotEquals (Job1.getId(), Job2.getId());
    //    assertEquals(Job1.getId(), Job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job Job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Employer Emp1 = new Employer("ACME");
        Location Loc1 = new Location("Desert");
        PositionType PT1 = new PositionType("Quality control");
        CoreCompetency CC1 = new CoreCompetency("Persistence");

        assertTrue(Job1 instanceof Job);
        assertTrue(Emp1 instanceof Employer);
        assertTrue(Loc1 instanceof Location);
        assertTrue(PT1 instanceof PositionType);
        assertTrue(CC1 instanceof CoreCompetency);
        assertEquals("Product tester", Job1.getName());
        assertEquals("ACME", Job1.getEmployer().getValue());
        assertEquals("Desert", Job1.getLocation().getValue());
        assertEquals("Quality control", Job1.getPositionType().getValue());
        assertEquals("Persistence", Job1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job Job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job Job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    //    assertEquals (Job1.getId(), Job2.getId());
        assertEquals(false, Job1.equals(Job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Web Developer", new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"),new CoreCompetency("Java"));
        String firstChar = String.valueOf(job.toString().charAt(0));
        String lastChar = String.valueOf(job.toString().charAt(job.toString().length()-1));
        assertEquals(firstChar, lineSeparator());
        assertEquals(lastChar, lineSeparator());
    }

    @Test
      public void testToStringContainsCorrectLabelsAndData() {
        Job Job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
   //     Job Job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedstring;
   //     expectedstring = lineSeparator() + "" + lineSeparator();
        expectedstring = lineSeparator() +
                "ID: " + Job1.getId() + lineSeparator() +
                "Name: Product tester" + lineSeparator() +
                "Employer: ACME" + lineSeparator() +
                "Location: Desert" + lineSeparator() +
                "Position Type: Quality control" + lineSeparator() +
                "Core Competency: Persistence" + lineSeparator();
        assertEquals(expectedstring, Job1.toString());
   //     System.out.println(Job1.toString());

    }

    @Test
    public void testToStringHandlesEmptyField() {
        Employer Emp1 = new Employer("Launchcode");
        String expectedfieldvalueEmp1 = Emp1.getValue();
        //    Employer Emp1 = new Employer("");
        //String expectedfieldvalueEmp1 = "Data not available";

       // Location Loc1 = new Location("StL");
       // String expectedfieldvalueLoc1 = Loc1.getValue();
            Location Loc1 = new Location("");
            String expectedfieldvalueLoc1 = "Data not available";

        PositionType PT1 = new PositionType("Back-end developer");
        String expectedfieldvaluePT1 = PT1.getValue();
        //    PositionType PT1 = new PositionType("");
        //    String expectedfieldvaluePT1 = "Data not available";

        //CoreCompetency CC1 = new CoreCompetency("Java");
        //String expectedfieldvalueCC1 = CC1.getValue();
            CoreCompetency CC1 = new CoreCompetency("");
            String expectedfieldvalueCC1 = "Data not available";

        Job Job1 = new Job("Web Developer", Emp1, Loc1, PT1, CC1);
        String expectedfieldvalueJob1 = Job1.getName();
        //    String expectedfieldvalue = "Data not available";
        String expectedstring;
        expectedstring = lineSeparator() +
                "ID: " + Job1.getId() + lineSeparator() +
                "Name: " + expectedfieldvalueJob1 + lineSeparator() +
                "Employer: " + expectedfieldvalueEmp1 + lineSeparator() +
                "Location: " + expectedfieldvalueLoc1 + lineSeparator() +
                "Position Type: " + expectedfieldvaluePT1 + lineSeparator() +
                "Core Competency: " + expectedfieldvalueCC1 + lineSeparator();
        assertEquals(expectedstring, Job1.toString());
    }
}
