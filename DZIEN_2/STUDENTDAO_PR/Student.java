package marcin.com;

public class Student {
    private String name;
    private int nralb;

    public Student(String name, int nralb) {
        this.name = name;
        this.nralb = nralb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNralb() {
        return nralb;
    }

    public void setNralb(int nralb) {
        this.nralb = nralb;
    }
}
