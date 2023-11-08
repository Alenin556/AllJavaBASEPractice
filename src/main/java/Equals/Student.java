package Equals;

public class Student {

    private String name, group, specialty;

    public Student(String name, String group, String specialty) {
        this.name = name;
        this.group = group;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

//    @Override
//    public boolean equals(Object o) {
//    }


}
