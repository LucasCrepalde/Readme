package exsala18;

public abstract class Assento{
    protected double precoBase;

    public abstract double calcularPreco();

    protected double calcularPrecoMedio(int totalAssentos, int totalAssentosVendidos){
        double val = totalAssentosVendidos * this.precoBase ;
        return val/totalAssentos; 
    }
}
