package ProyectoFinalSeccion4;

public class Main {
    static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Juan Perez", 1500000);
        BankApp bankApp = new BankApp(bankAccount);
        bankApp.start();
    }
}
