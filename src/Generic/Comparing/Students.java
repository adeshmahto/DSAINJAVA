package Generic.Comparing;

public class Students implements Comparable<Students> {
    int rollno;
    float marks;

    public Students(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        int diff= (int)(this.marks-o.marks);
        return diff;
        //if diff==0 means both are equal
        // if diff<0; means o is bigger
        //else this is bigger
    }
}
