package marcin.com;

public class Main {
    public static void main(String[] args) {
        StudentDAO stud= new StudentDAO();
        for(Student st:stud.getAllStudent()){
            System.out.printf("Student: [nr alb: %d, imię: %s]\n",st.getNralb(),st.getName());
        }

        Student student = stud.getAllStudent().get(0);
        student.setName("Michał");
        stud.updateStudent(student);
        System.out.println();
        System.out.println("____________________________");
        for(Student st:stud.getAllStudent()){
            System.out.printf("Student: [nr alb: %d, imię: %s]\n",st.getNralb(),st.getName());
        }

        Student stdU = stud.getAllStudent().get(3);
        stud.deleteStudent(stdU);
        System.out.println();
        for(Student st:stud.getAllStudent()){

            System.out.printf("Student: [nr alb: %d, imię: %s]\n",st.getNralb(),st.getName());
        }
    }
}
