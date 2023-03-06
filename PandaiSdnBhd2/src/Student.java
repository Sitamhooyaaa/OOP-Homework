public class Student {
    Name name;
    String ic;
    String school;
    String address;
    int year;
    int[] scores = new int[5];      //5 Subjects

    public void setName(Name name) {
        this.name = name;
    }
    public Name getName() {
        return name;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getIc() {
        return ic;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setScores(int i, int marks) {
        scores[i] = marks;
    }

    //method for Average
    public String calcAverage(){
        int sum = 0;
        double average;
        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        average = sum/ scores.length;
        return "This student average marks is : " + average;
    }
    //method for Min
    public String calcMin(){
        double min = 100;
        for (int i = 0; i < scores.length; i++){
            if (scores[i] < min){
                min = scores[i];
            }
            else{
            }
        }
        return "This student minimum marks is : "+ min;
    }
    //method for Max
    public String calcMax(){
        double max = 0;
        for (int i = 0; i < scores.length; i++){
            if (scores[i]>max){
                max = scores[i];
            }
            else{
            }
        }
        return "This student maximum marks is : " + max ;
    }

    public String toString(){
        return ("IC: " + ic + "\nSchool: " + school + "\nAddress: " + address + "\nYear "+ year + "\n");
    }
    public String toString2(){
        return "\n" + calcAverage() + "\n" + calcMax() + "\n" + calcMin();
    }
}
