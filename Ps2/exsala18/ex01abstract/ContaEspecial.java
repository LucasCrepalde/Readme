package ex01abstract;

public class ContaEspecial extends Conta {
    
    private double limite;

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && (saldo + limite) >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: " + saldo);
            return true;
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente.");
            return false;
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. Novo saldo: " + saldo);
    }

    public void aumentar(double valor) {
        if (valor > 0) {
            limite += valor;
            System.out.println("Limite aumentado. Novo limite: " + limite);
        } else {
            System.out.println("Valor inválido para aumento de limite.");
        }
    }
}
