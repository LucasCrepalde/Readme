public class Assinatura extends Jogo{
    private String plano;

    public Assinatura(String nome, String tipo , double valor, String plano){
        super (nome,tipo,valor);
        this.plano = plano;
    }

    @Override
    public void cobrar(){
        System.out.print(" Programando cobrança mensal do seu cartão. ");
        System.out.print(" plano : " + plano);
        System.out.print(super.toString());
    }

    public String getPlano(){
        return plano;
    }
}
