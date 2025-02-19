package exsala18;

public class AssentoExecutiva extends Assento{

    private int totalAssentos;
    private int totalAssentosVendidos;

    public AssentoExecutiva(){
        this.precoBase = 50.0; 

    }

    public abstract calcularPreco(){
        this.calcularPrecoMedio(totalAssentos, totalAssentosVendidos);
    }
    
    public void venderAssento(){
        this.totalAssentosVendidos+=2;
    }
}
