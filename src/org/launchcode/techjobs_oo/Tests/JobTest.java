package org.launchcode.techjobs_oo.Tests;
import org.junit.*;

import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {

        private Job testJob1;
        private Job testJob2;
        private Job testJob3;
        private Job testJob4;



 @Before
 public void JobObject(){
     testJob1 = new Job();
     testJob2 = new Job();
     testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
     testJob4 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
 }


    //Test empty constructor
    @Test
    public void testSettingJobId(){
        assertTrue(testJob1.getId() >0);
        assertNotSame(testJob1, testJob2);

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

        assertNotNull(employer);
        assertEquals("ACME", employer.getValue());

        assertNotNull(location);
        assertEquals("Desert", location.getValue());

        assertNotNull(positionType);
        assertEquals("Quality control", positionType.getValue());

        assertNotNull(coreCompetency);
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
    @Test
    public void testLabelForEachField() {
     String text = testJob3.toString();
        assertTrue(text.contains("\n"+"ID: "+testJob3.getId()+"\nName: "+testJob3.getName()+"\nEmployer: "+testJob3.getEmployer()+"\nLocation: "+testJob3.getLocation()+"\nPosition Type: "+testJob3.getPositionType()+"\nCore Competency: "+testJob3.getCoreCompetency()+"\n"));

    }

    @Test
    public void testEmptyFields(){
     assertFalse(testJob3.toString().contains("Name: Data not available"));
        assertFalse(testJob3.toString().contains("Employer: Data not available"));
        assertFalse(testJob3.toString().contains("Location: Data not available"));
        assertFalse(testJob3.toString().contains("Position Type: Data not available"));
        assertFalse(testJob3.toString().contains("Core Competency: Data not available"));

    }
    @Test
    public void testAllFieldsEmptyMessage(){
        assertFalse(testJob4.toString().contains("OOPS! This job does not seem to exist"));
    }

}
