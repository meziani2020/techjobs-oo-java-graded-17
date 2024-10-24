package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    public Job(){
        this.id=nextId;
        nextId++;

    }
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(String name, Employer employer, Location location, PositionType positionType,CoreCompetency coreCompetency ){
        this();
        this.name=name;
        this.employer=employer;
        this.location=location;
        this.positionType=positionType;
        this.coreCompetency=coreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String dna="Data not available"; // use if null or empty or blanc
        //String mylineSeparator="\r\n";//System.lineSeparator() on windows
        String mylineSeparator="\n";//System.lineSeparator() on linux
        //System.setProperty("line.separator", "\n");
        String stringForm=mylineSeparator
        //String stringForm=System.lineSeparator()
                +"ID: "+id        +mylineSeparator
                +"Name: "+((name!=null && name.trim() !="")? name :dna )           +mylineSeparator
                +"Employer: "+((employer!=null &&  employer.getValue().trim()!="" )? employer.getValue() :dna )         +mylineSeparator
                +"Location: "+((location!=null && location.getValue().trim()!="")? location.getValue()  :dna  )         +mylineSeparator
                +"Position Type: "+((positionType!=null && positionType.getValue().trim()!="" )? positionType.getValue() :dna)       +mylineSeparator
                +"Core Competency: "+((coreCompetency!=null && coreCompetency.getValue().trim()!="")? coreCompetency.getValue() : dna )    +mylineSeparator;

        //System.out.println(stringForm);
        return  stringForm;

    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
