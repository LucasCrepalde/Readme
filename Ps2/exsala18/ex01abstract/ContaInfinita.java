package ex01abstract;

public class ContaInfinita extends Conta {
    
    public ContaInfinita(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        saldo -= valor; // Permite saldo negativo
        System.out.println("Saque realizado. Novo saldo: " + saldo);
        return true;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. Novo saldo: " + saldo);
    }
}
