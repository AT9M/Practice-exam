package Student;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentList {

    private ArrayList<Student> studentArrayList = new ArrayList<Student>();
    public int Count;

    public void addStudent(Student student)
    {
        studentArrayList.add(student);
        Count++;
    }
    public Student getStudent(String name)
    {
        for (int i = 0 ; i<studentArrayList.size();i++){
            Student S =studentArrayList.get(i);
            if(S.getName()==name)
            {
                return S;
            }
        }
        return null;
    }

    public int getCount() {
        return Count;
    }
}
