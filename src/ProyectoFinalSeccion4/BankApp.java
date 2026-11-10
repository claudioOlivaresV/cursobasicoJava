package ProyectoFinalSeccion4;

import java.util.Scanner;

public class BankApp {
    private BankAccount account;
    private Scanner scanner;

    public BankApp(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }
    public void start() {
        Integer option;

        do {
            displayMenu();
            option = scanner.nextInt();
            processOption(option);

        } while (option !=4);
    }

    private void displayMenu() {
        System.out.println("Selecciona opciones");
        System.out.println("1 Depositar");
        System.out.println("2 Retirar");
        System.out.println("3 Mostrar Saldo");
        System.out.println("4 Salir");
    }

    private Integer getUserOption() {
        return scanner.nextInt();
    }

    private void handleDeposit() {
        System.out.println("Ingrese el monto a depositar");
        Double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    private void handleWithdrawal() {
        System.out.println("Ingrese el monto a retirar");
        Double amount = scanner.nextDouble();
        account.withdraw(amount);
    }
    private  void processOption(Integer option) {
        switch (option) {
            case 1: {
                handleDeposit();
                break;
            }
            case 2: {
                handleWithdrawal();
                break;
            }
            case 3: {
                account.displayBalance();
                break;
            }
            case 4: {
                System.out.println("gracias");
            }
            default:{
                System.out.println("opcion incorrecta");
            }
        }
    }
}
