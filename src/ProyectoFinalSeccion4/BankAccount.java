package ProyectoFinalSeccion4;

public class BankAccount {
    private String accountHolder;
    private Double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public  void  deposit(Double amount) {
        if(amount > 0) {
            balance+= amount;
            System.out.println("Depposito exitoso");
        } else {
            System.out.println("no se pudo depositar");
        }
    }

    public  void withdraw(Double amount) {
        if(amount > 0 && amount <= balance) {
            balance-= amount;
            System.out.println("returi existoso");
        } else {
            System.out.println("no se pudo retirar");
        }
    }

    public  void displayBalance () {
        System.out.println("Saldo: "+ balance);
    }
}
