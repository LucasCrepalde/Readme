package exsala18;

public class App {
    public static void main(String[] args) {
        Assento assento = new AssentoEconomica(50);

        assento.venderAssento();
        System.out.println("valor assento" + assento.calcularPreco());
        assento.venderAssento();
        System.out.println("valor assento" + assento.calcularPreco());

        Assento assentoEx = new AssentoExecutiva(10);

        assentoEx.venderAssento();
        System.out.println("valor assento" + assento.calcularPreco());
        assentoEx.venderAssento();
        System.out.println("valor assento" + assento.calcularPreco());

    }
}
