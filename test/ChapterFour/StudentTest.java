package ChapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    private Student student;
    @BeforeEach
    public  void setUp(){
        student = new Student("",0.00);
    }
    @Test
    public void studentCanBeCreated(){
        assertNotNull(student);
    }
    @Test
    public void studentCanHaveANameTest(){
        student.setName("Mary");
        assertEquals("Mary",student.getName());
    }
    @Test
    public void averageCanBeCalculatedTest(){
        student.setAverage(50.00);
        assertEquals(50.00,student.getAverage());
    }
    @Test
    public  void getLetterGradeTest(){
        student.setAverage(80.9);
        assertEquals("B",student.getLetterGrade());
    }
    @Test
    public void showMessageTest(){
        student.setAverage(80.9);
        assertEquals("B",student.getLetterGrade());
        assertEquals("You have done excellently well,keep it up!",student.showMessage());

    }
    @Test
    public void anotherStudentReportTest(){
        student.setName("Alice");
        student.setAverage(50.9);
        assertEquals("F",student.getLetterGrade());
        assertEquals(" Ooops!,you are not a failure,i believe in you abilities",student.showMessage());

    }

}