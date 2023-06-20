package marcin.com;

import java.util.List;

public interface IStudentDAO {
    public List<Student> getAllStudent();
    public Student getStudent(int nralb);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
