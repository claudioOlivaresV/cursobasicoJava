package classroom;

public class MainClassroom {
    static void main(String[] args) {
        Classroom studen1 = new Classroom("Juan");
        Classroom studen2 = new Classroom("Maria");
        studen1.showInfo();
        studen2.showInfo();
        Classroom.setSchoolName("Escuela 2");

        studen1.showInfo();
        studen2.showInfo();
    }
}
