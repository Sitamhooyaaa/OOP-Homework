public class Teacher {
    Name name;
    String ic;
    String address;
    String qualification;
    String dateJoined;
    int yearexp;

    public void setName(Name name) {
        this.name = name;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void getQualification() {
        System.out.println(this + " Qualification is " + qualification);
    }

    public void setDateJoined(String dateJoined) {
        this.dateJoined = dateJoined;
    }

    public void getDateJoined(Name name) {
        System.out.println(this.name + "Joined on " + dateJoined);
    }
}
