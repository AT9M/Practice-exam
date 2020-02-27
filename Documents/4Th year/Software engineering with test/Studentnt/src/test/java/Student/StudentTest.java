package Student;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    private Student myStudent;

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter)
    {
        testReporter.publishEntry("Testing  "+testInfo.getDisplayName());
        try {
            myStudent = new Student("John doe","fdhgfdhg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @DisplayName("Test Name")
    @Test
    void testNameConstructor()
    {
        Assertions.assertEquals("John doe",myStudent.getName());
    }

    @DisplayName("Test Email")
    @Test
    void testEmailConstructor()
    {
        Assertions.assertEquals("fdhgfdhg",myStudent.getEmail());
    }

    @DisplayName("Test Set Name")
    @Test
    void testSetName()
    {
        myStudent.setName("jacky");
        Assertions.assertEquals("jacky",myStudent.getName());
    }

    @DisplayName("Test Set Email")
    @Test
    void testSetEmail()
    {
        myStudent.setEmail("holla@gmail.comn");
        Assertions.assertEquals("holla@gmail.comn",myStudent.getEmail());
    }

    @DisplayName("Test Bad Name constructor")
    @Test
    void testbadNameConstructor()
    {
        assertThrows(Exception.class, new Executable() {
            public void execute() throws Throwable {
                Student student = new Student("","sdf");

            }
        });
    }

    @DisplayName("Test Bad Email constructor")
    @Test
    void testbadEmailConstructor()
    {
        assertThrows(Exception.class, new Executable() {
            public void execute() throws Throwable {
                Student student = new Student("jkfhdg","");

            }
        });
    }
}
