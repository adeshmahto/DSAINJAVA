package DataBaseINMysqlApp;

public class Student {
    private int studentId;
    private String studentName;
    private String studenPhone;
    private String studentCity;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudenPhone() {
        return studenPhone;
    }

    public void setStudenPhone(String studenPhone) {
        this.studenPhone = studenPhone;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public Student(int studentId, String studentName, String studenPhone, String studentCity) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studenPhone = studenPhone;
        this.studentCity = studentCity;
    }

    public Student(String studentName, String studenPhone, String studentCity) {
        super();
        this.studentName = studentName;
        this.studenPhone = studenPhone;
        this.studentCity = studentCity;
    }
    public Student(){
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studenPhone='" + studenPhone + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }
}
