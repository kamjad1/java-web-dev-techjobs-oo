package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.launchcode.techjobs_oo.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class JobTest {
        private Job testJob1;
        private Job testJob2;
        private Job testJob3;


 @Before
 public void JobObject(){
     testJob1 = new Job();
     testJob2 = new Job();
     testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
 }


    //Test empty constructor
    @Test
    public void testSettingJobId(){

        assertFalse(testJob2 == testJob1);
        assertTrue(testJob2.getId() - testJob1.getId() == 1);
    }


  //Test the Full Constructor
    @Test
    public void testJobConstructorSetsAllFields(){
     String name = testJob3.getName();
     Employer employer = testJob3.getEmployer();
     Location location = testJob3.getLocation();
     PositionType positionType = testJob3.getPositionType();
     CoreCompetency coreCompetency = testJob3.getCoreCompetency();


        assertEquals("Product tester", name);

        assertTrue(employer instanceof Employer);
        assertEquals("ACME", employer.getValue());

        assertTrue(location instanceof Location);
        assertEquals("Desert", location.getValue());

        assertTrue(positionType instanceof PositionType);
        assertEquals("Quality control", positionType.getValue());

        assertTrue(coreCompetency instanceof CoreCompetency);
        assertEquals("Persistence", coreCompetency.getValue());

    }

    @Test
    public void testJobsForEquality(){
        assertNotEquals(testJob1, testJob2);

    }

    @Test
    public void testToStringForBlankLinesAtBeginningAndEnd(){
      String text= testJob3.toString();
      assertTrue(text.contains("\n"));
    }

}
