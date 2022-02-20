package inheritance;

public class Student {
    public String firstName;
    public String lastName;
    public int group;
    public double average_mark;

    public Student() {

    }

    public Student(String firstName, String lastName, int group, double average_mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.average_mark = average_mark;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setAverage_mark(double average_mark) {
        this.average_mark = average_mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroup() {
        return group;
    }

    public double getAverage_mark() {
        return average_mark;
    }

    public int getScholarship() {
        if (this.average_mark == 10) {
            return 100;
        } else {
            return 80;
        }
    }
}
