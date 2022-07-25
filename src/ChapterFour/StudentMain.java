package ChapterFour;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Mary James",96.90);
        Student student2 = new Student("Alice Lucy",58.0);

        System.out.printf("%s's letter grade is: %s%n",student1.getName(), student1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n",student2.getName(), student2.getLetterGrade());

    }
}
