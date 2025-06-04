class Course{
    String course;
    int sem;
    float marks;

    Course(String course, int sem, float marks){
        this.course=course;
        this.sem=sem;
        this.marks=marks;
    }
    void displayCourse(){
        System.out.println("Course:"+course+" sem:"+sem+" Marks:"+marks);
    }
}
public class student_marks {
    public static void main(String[] args) {
        Course c = new Course("Big Data ",4,35);
        Course c1 = new Course("JAVA Programming",4,38);
        Course c2 = new Course("Devops",4,39);
        c.displayCourse();
        c1.displayCourse();
        c2.displayCourse();
    }
}
