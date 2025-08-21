package aparelho;

public class Telefone implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Telefone ligando...");
    }

    @Override
    public void desligar() {
        System.out.println("Telefone desligando...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Telefone iniciou o correio de voz.");
    }
}