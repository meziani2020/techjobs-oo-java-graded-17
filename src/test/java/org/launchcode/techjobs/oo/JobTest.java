package org.launchcode.techjobs.oo;

import org.junit.Test;

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

}
