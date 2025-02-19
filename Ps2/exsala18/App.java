public class App{
    public static void main(String[] args) throws Exception {
        System.out.print(" hello, world !!");
        Jogo j1 = new OneTimeBuy(" Candy Crush ", "Mobile", 10);
        j1.cobrar();
        Jogo j2 = new Assinatura(" Playstation plus ", " PC ", 32, "Intermediário");
        j2.cobrar();
    } 
}