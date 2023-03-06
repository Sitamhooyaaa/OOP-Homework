import java.util.ArrayList;
public class StudentBatch {
    Student student;
    StudentBatch batch;
    private ArrayList<Student> students;
    private Teacher teacher;
    private int currentSize = 1;
    private int maxSize;

    public StudentBatch(Teacher teacher, int maxSize) {
        this.teacher = teacher;
        this.maxSize = maxSize;
        this.currentSize = 1;
        this.students = new ArrayList<Student>();
    }
    public void goBatch(Student student, StudentBatch batch){
        this.student = student;
        this.batch = batch;
        if (batch.currentSize == batch.maxSize){
            System.out.println("This batch is already full");
        }
        else {
            System.out.println(student.getName() + " is in batch: " + batch.currentSize);
            batch.currentSize += 1;
        }
    }
}