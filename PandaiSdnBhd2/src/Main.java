public class Main {
    public static void main(String[] args) {

        //Set student1 details
        Student student1 = new Student();       //object student1
        Name name = new Name("Muhammad","Aqil","Mohd Nor");
        student1.setIc("80");
        student1.setSchool("SESMA");
        student1.setAddress("Kuala Terengganu");
        student1.setYear(20);
        System.out.println(name.toString());
        System.out.println(student1.toString());       //Print out the details of student2
        //set up dalam toString method, tapi method ni macam buat untuk display semua terus dalam satu benda.

        //Set student2 details
        Student student2 = new Student();       //object student1
        name = new Name("Nur","Farhan","Fitri");     //reassigned value name :apeng
        student2.setIc("30");
        student2.setSchool("SAHUT");
        student2.setAddress("Kuala Terengganu");
        student2.setYear(20);
        System.out.println(name.toString());
        System.out.println(student2);       //Print out the details of student2


        //Register tutor1
        Teacher tutor1 = new Teacher();
        name = new Name("Muhammad", "Eunoss","Hawan");
        tutor1.setName(name);
        tutor1.setQualification("Degree");
        tutor1.setDateJoined("3 Mac 2023");

        //Register tutor2
        Teacher tutor2 = new Teacher();
        name = new Name("Muhammad", "Haiqal","Eezanee");
        tutor2.setName(name);
        tutor2.setQualification("Master");
        tutor2.setDateJoined("8 Mei 2025");

        //Set batch for the tutor and its max students that he/she can teach
        StudentBatch batch1 = new StudentBatch(tutor1,3);   //dekat sini, kita set tutor1 kepada batch 1
        batch1.goBatch(student1, batch1);
        StudentBatch batch2 = new StudentBatch(tutor2,4);   //sini, kita set tutor2 kepada batch 2
        batch2.goBatch(student2, batch2);

        //set headmaster for centre1 and centre2
        Centre centre1 = new Centre();
        centre1.setHeadmasterName(new Name("Mohd", "Kahar", "Abd Aziz"));   //first access the setHeadMasterName, then in that method parameter got Name name, then we need to access the name constructor/ method.
        Centre centre2 = new Centre();
        centre2.setHeadmasterName(new Name("Mohd", "Fakhri", "Abd Manap"));

        //set tutor for centre1 and centre2
        centre1.addTuto(new Name("Muhammad", "Eunoss", "Hawan"));
        centre2.addTuto(new Name("Muhammad", "Syafiq","Azmi"));

        //set address for centre1 and centre2
        centre1.setAddress(new Address("No.3", "Jalan Mawar", "Kuala Johor", "Johor","234000"));
        centre2.setAddress(new Address("No.4", "Jalan Alam", "Kuala Selangor", "Selangor","260020"));

        //Student1 scores
        student1.setScores(0,50);
        student1.setScores(1,60);
        student1.setScores(2,90);
        student1.setScores(3,40);
        student1.setScores(4,25);

        //student2 scores
        student2.setScores(0,30);
        student2.setScores(1,60);
        student2.setScores(2,80);
        student2.setScores(3,40);
        student2.setScores(4,70);

        System.out.println("\nStudent1 performance: ");     //Basically toString method is the same as normal method, also can do method overloading with it
        System.out.println(student1.toString2());
        System.out.println("\nStudent 2 performance: ");
        System.out.println(student2.toString2());

    }
}