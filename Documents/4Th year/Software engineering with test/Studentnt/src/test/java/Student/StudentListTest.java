package Student;

import org.junit.jupiter.api.*;

public class StudentListTest {
    private StudentList myStudentList;

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter)
    {
        testReporter.publishEntry("Testing  "+testInfo.getDisplayName());
        myStudentList = new StudentList();
        try {
            Student student1 = new Student("John Doe","sdg");
            myStudentList.addStudent(student1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @DisplayName("Test Count")
    @Test
    void testGetCount()
    {
        Assertions.assertEquals(1,myStudentList.getCount());
    }

    @DisplayName("Test Add / Get student")
    @Test
    void testAddGetStudent()
    {
        try {
            Student student2 = new Student("Jacky O'Doneil","igsdk");
            myStudentList.addStudent(student2);
            Assertions.assertEquals(student2,myStudentList.getStudent("Jacky O'Doneil"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @DisplayName("Test Add / Get student if wrong")
    @Test
    void testAddGetNotWorking()
    {
        try {
            Student student2 = new Student("Jacky O'Doneil","igsdk");
            myStudentList.addStudent(student2);
            Assertions.assertEquals(null,myStudentList.getStudent("Jacky O'Dneil"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
