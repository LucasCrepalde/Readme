public abstract class Jogo{
    private String nome;
    private String tipo;
    private double valor;

    public Jogo(String nome, String tipo, double valor){
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;

    }

    public String toString() {
        return " Jogo" + nome + "tipo: " + tipo + " valor : " + valor;
    }

    public abstract void cobrar();

}