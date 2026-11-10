package condiciones;

public class Condicionales {
    static void main() {
        int age = 17;
        if (age > 18) {
            System.out.println("mayor");
        } else if (age <= 0) {
            System.out.println("No es valido");
        } else {
            System.out.println("menor a 18");
        }

        int day = 20;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("ninguna");
        }
    }
}
