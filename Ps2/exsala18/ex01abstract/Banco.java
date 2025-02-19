package ex01abstract;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private String nome;
    private List<Conta> contas; 

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>(); 
    }

    public void adicionar(Conta conta) {
        contas.add(conta); 
    }

    public void mostrar() {
        for (Conta conta : contas) {
            System.out.println(conta); 
        }
    }

    public void premiaInfinitas() {
        for (Conta c : contas) {
            if (c instanceof ContaInfinita) {
                c.depositar(1000); 
            }
        }
    }
}
