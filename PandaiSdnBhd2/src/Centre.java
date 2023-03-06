public class Centre {
    private Name headmasterName;
    private Address address;
    Name[] tutorList = new Name[3];

    public void setHeadmasterName(Name headmasterName) {
        this.headmasterName = headmasterName;
    }
    public void addTuto(Name tutorName){
        int i = 0;
        tutorList[i++] = tutorName;
        System.out.println("The tutor have been successfully added: " + tutorName);
    }
    public void setAddress(Address address) {
        this.address = address;
    }
}
