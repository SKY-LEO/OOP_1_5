package inheritance;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFirstName("Дмитрий");
        student1.setLastName("Дубовский");
        student1.setGroup(78236512);
        student1.setAverage_mark(10);
        Student student2 = new Student("Александр", "Жирнов", 8322375, 8.9);
        Aspirant aspirant1 = new Aspirant();
        aspirant1.setFirstName("Анна");
        aspirant1.setLastName("Васельчук");
        aspirant1.setGroup(38732690);
        aspirant1.setAverage_mark(9.9);
        aspirant1.setScientific_work("Телескоп Вебера");
        Aspirant aspirant2 = new Aspirant("Алексей", "Романов", 98362019, 10, "Телескоп Хаббл");
        Student[] students = {student1, student2, aspirant1, aspirant2};
        getSalary(students);
    }

    private static void getSalary(Student[] students){
        for(int i = 0; i< students.length; i++){
            System.out.println(students[i].getFirstName()+ " "+students[i].getLastName()+" получит "+students[i].getScholarship()+ " рублей");
        }
    }
}
