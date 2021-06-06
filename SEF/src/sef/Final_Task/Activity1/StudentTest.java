package sef.Final_Task.Activity1;
import junit.framework.TestCase;
import org.junit.Test;



public class StudentTest extends TestCase {
    private Student student;

    protected void setUp() throws Exception {
        student = new Student();
    }


    public void testSetAndGetSchoolName() {
        String testSchoolName = "School name";
        assertNull(student.getSchoolname());
        student.setSchoolName(testSchoolName);
        assertEquals(testSchoolName, student.getSchoolname());

    }
    public void testIntroduce(){
        student.setSchoolName("City");
        assertEquals(student.Introduce(), "I am study in University City");
    }

}



