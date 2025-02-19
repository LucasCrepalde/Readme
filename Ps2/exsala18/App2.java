public class App2{
    public static void main(String[] args) throws Exception {
        System.out.print(" hello, world !!");

        Jogo[] jogos = new Jogo[]{
            new OneTimeBuy(" Candy Crush ", "Mobile", 10),
            new Assinatura(" Playstation plus ", " PC ", 32, "Intermediário"),
        };

        for (Jogo j: jogos){
            System.out.println(" --------------------------------- ");
            j.cobrar();
            if (j instanceof Assinatura){
                String p = ((Assinatura)j).getPlano();
                System.out.println(" plano da assinatura é : " + p );
            }
            System.out.println(" -------------------------------------- ");
        }
    } 
}