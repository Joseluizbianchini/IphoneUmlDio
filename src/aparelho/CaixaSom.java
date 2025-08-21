package aparelho;

public class CaixaSom implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Caixa de som tocando a música.");
    }

    @Override
    public void pausar() {
        System.out.println("Caixa de som pausou a música.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Caixa de som selecionou a música.");
    }
}