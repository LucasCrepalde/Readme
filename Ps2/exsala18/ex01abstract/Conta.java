package ex01abstract;

import javax.sound.sampled.SourceDataLine;

public abstract class Conta {
    
    protected double saldo;
    private int numero; 

    public Conta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public double consultar(){
        return saldo;
    }

    public void depositar(double v1){
        saldo += v1;
        System.out.println(saldo);
    }

    public abstract boolean sacar(double valor);

    @Override
    public String toString() {
        return "saldo: " + saldo + ", numero: " + numero;
}



}
