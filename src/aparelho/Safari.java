package aparelho;

public class Safari implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Safari exibindo página web.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Safari abriu uma nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Safari atualizando a página.");
    }
}