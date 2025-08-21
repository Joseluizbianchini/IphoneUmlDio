package aparelho;

public class Dispositivo {
    public static void main(String[] args) {
        ReprodutorMusical caixaSom = new CaixaSom();
        caixaSom.tocar();
        caixaSom.pausar();
        caixaSom.selecionarMusica();

        AparelhoTelefonico telefone = new Telefone();
        telefone.ligar();
        telefone.desligar();
        telefone.iniciarCorreioVoz();

        NavegadorInternet safari = new Safari();
        safari.exibirPagina();
        safari.adicionarNovaAba();
        safari.atualizarPagina();
    }
}