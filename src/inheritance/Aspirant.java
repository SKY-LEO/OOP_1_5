package inheritance;

public class Aspirant extends Student {
    public String scientific_work;

    public Aspirant() {

    }

    public Aspirant(String firstName, String lastName, int group, double average_mark, String scientific_work) {
        super(firstName, lastName, group, average_mark);
        this.scientific_work = scientific_work;
    }

    public void setScientific_work(String scientific_work) {
        this.scientific_work = scientific_work;
    }

    public String getScientific_work() {
        return scientific_work;
    }

    public int getScholarship() {
        if (this.average_mark == 10) {
            return 200;
        } else {
            return 180;
        }
    }
}
