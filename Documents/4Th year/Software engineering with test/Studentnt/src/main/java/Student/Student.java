package Student;

public class Student {
    public String name;
    public  String Email;

    public Student(String name, String email) throws Exception {
        if(name.isEmpty())
        {
            throw new Exception("String cannot be empty");
        }
        if(email.isEmpty())
        {
            throw new Exception("String cannot be empty");
        }
        this.name = name;
        Email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
