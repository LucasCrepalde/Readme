package exsala18;

public class AssentoEconomica extends Assento{

    private int totalAssentos;
    private int totalAssentosVendidos;

    public AssentoEconomica(){
        this.precoBase = 50.0; 
    }

    @Override
    public abstract calcularPreco(){
        this.calcularPrecoMedio(totalAssentos, totalAssentosVendidos);
    }
    
    public void venderAssento(){
        this.totalAssentosVendidos++;
    }
}
