package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() throws ClassNotFoundException {
        Job job1=new Job();
        Job job2=new Job();
        //assertNotEquals(job1.getId(),job2.getId());
        assertTrue(job1.getId()!=job2.getId() );
    }

    @Test
    public void  testJobConstructorSetsAllFields() throws ClassNotFoundException{
       Job j= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));




        //assertTrue(j.getName()=="Product tester");
        assertEquals(j.getName(),"Product tester");
       // assertTrue( j.getName().getClass().getSimpleName().equals("String"));
        assertTrue( j.getName() instanceof String);
       // System.out.println(j.getName().getClass().getSimpleName());


        assertTrue( j.getEmployer().getValue()=="ACME");
        assertTrue( j.getEmployer().getClass().getSimpleName().equals("Employer"));
        assertTrue( j.getEmployer() instanceof Employer );

        assertTrue( j.getLocation().getValue()=="Desert");
        assertTrue( j.getLocation().getClass().getSimpleName().equals("Location"));

        assertTrue( j.getPositionType().getValue()=="Quality control");
        assertTrue( j.getPositionType().getClass().getSimpleName().equals("PositionType"));

        assertTrue( j.getCoreCompetency().getValue()=="Persistence");
        assertTrue( j.getCoreCompetency().getClass().getSimpleName().equals("CoreCompetency"));


    }

    @Test
    public void testJobsForEquality(){
        Job j1= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job j2= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //assertNotEquals(j1.equals(j2),true);
        assertEquals(j1.equals(j2),false);



    }

    @Test
    public void   testToStringStartsAndEndsWithNewLine(){
        String lineSeparator=System.lineSeparator();
        Job j= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String ss=j.toString();

        assertEquals(ss.substring(0,lineSeparator.length()), lineSeparator);//start by lineSeparator
        assertEquals(ss.substring( ss.length()-lineSeparator.length(),ss.length()), lineSeparator); // ending by lineSeparator

    }

    @Test public void     testToStringContainsCorrectLabelsAndData(){
        String lineSeparator=System.lineSeparator();
        Job j= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String[] lines=j.toString().split(lineSeparator);
        //System.out.println(j.toString());

        assertEquals(lines[1].indexOf("ID: "),0);
        assertEquals(lines[2].indexOf("Name: "),0);
        assertEquals(lines[3].indexOf("Employer: "),0);
        assertEquals(lines[4].indexOf("Location: "),0);
        assertEquals(lines[5].indexOf("Position Type: "),0);
        assertEquals(lines[6].indexOf("Core Competency: "),0);

    }
    @Test
    public void testToStringHandlesEmptyField(){

        String lineSeparator=System.lineSeparator();
        String dna="Data not available";
        Job j= new Job();

        String[] lines=j.toString().split(lineSeparator);
       // System.out.println(j.toString());


        assertTrue(lines[2].indexOf(dna)>0);//name empty
        assertTrue(lines[3].indexOf(dna)>0);//Employer empty
        assertTrue(lines[4].indexOf(dna)>0);//Location empty
        assertTrue(lines[5].indexOf(dna)>0);//Position Type empty
        assertTrue(lines[6].indexOf(dna)>0);//Core Competency empty


        j= new Job(" ", new Employer(" "), new Location(" "), new PositionType(" "), new CoreCompetency(" "));
        lines=j.toString().split(lineSeparator);
        assertTrue(lines[2].indexOf(dna)>0);//name empty
        assertTrue(lines[3].indexOf(dna)>0);//Employer empty
        assertTrue(lines[4].indexOf(dna)>0);//Location empty
        assertTrue(lines[5].indexOf(dna)>0);//Position Type empty
        assertTrue(lines[6].indexOf(dna)>0);//Core Competency empty


    }

}
