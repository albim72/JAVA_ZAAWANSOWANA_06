package marcin.com;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements IStudentDAO{

    List<Student> students;

    public StudentDAO() {
        students = new ArrayList<>();
        Student student1 = new Student("Olga",0);
        Student student2 = new Student("Karol",1);
        Student student3 = new Student("Jacek",2);
        Student student4 = new Student("Inga",3);
        Student student5 = new Student("Nadia",4);
        Student student6 = new Student("Leon",5);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
    }

    @Override
    public List<Student> getAllStudent() {
        return students;
    }

    @Override
    public Student getStudent(int nralb) {
        return students.get(nralb);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getNralb()).setName(student.getName());
        System.out.printf("Student %s, nr albumu: %d",student.getName(),student.getNralb());
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getNralb());
        System.out.printf("Student nr alb %d został usunięty z listy.",student.getNralb());
    }
}

