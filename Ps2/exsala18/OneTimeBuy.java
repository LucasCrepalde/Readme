public class OneTimeBuy extends Jogo{
    public OneTimeBuy(String nome, String tipo , double valor){
        super (nome,tipo,valor);
    }

    @Override
    public void cobrar(){
        System.out.print(" Enviando cobrança de R$30,00 ");
        System.out.print(" Dados do jogo adquiridos:  ");
        System.out.print(super.toString());

    }
}