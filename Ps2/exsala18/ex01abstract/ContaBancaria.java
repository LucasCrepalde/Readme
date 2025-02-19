package ex01abstract;

public class ContaBancaria extends Conta {
    
    public ContaBancaria(int numero, double saldo) {
        super(numero, saldo); 
    }

    

    @Override
    public boolean sacar(double v4) {
        if (v4 > 0 && v4 <= saldo) { 
            saldo -= v4;
            System.out.println("Saque realizado. Novo saldo: " + saldo);
            return true;
        } else {
            System.out.println("Sem saldo suficiente ou valor inválido.");
            return false;
        }
    }
}
