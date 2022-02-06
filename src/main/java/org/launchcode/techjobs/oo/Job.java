package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private final int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
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


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        if(name.isEmpty()){
            setName("No data available");
        }
        return name;
    }

    public Employer getEmployer() {
        if(employer.getValue().isEmpty()){
            employer.setValue("No data available");
        }
        return employer;
    }

    public Location getLocation() {
        if(location.getValue().isEmpty()){
            location.setValue("No data available");
        }
        return location;
    }

    public PositionType getPositionType() {
        if(positionType.getValue().isEmpty()){
            positionType.setValue("No data available");
        }
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        if(coreCompetency.getValue().isEmpty()){
            coreCompetency.setValue("No data available");
        }
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        return "\nID: " + this.getId() +
                "\nName: " + this.getName() +
                "\nEmployer: " + this.getEmployer() +
                "\nLocation: " + this.getLocation() +
                "\nPosition Type: " + this.getPositionType() +
                "\nCore Competency: " + this.getCoreCompetency()+"\n";
    }
}
