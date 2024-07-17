import funcao.ServicosTelefone;
import multimidia.Multimidia;
import web.NavegacaoInternet;

public class Iphone implements ServicosTelefone, Multimidia, NavegacaoInternet {


    @Override
    public void ligar(String numero) {
        System.out.println("lgando para "+numero);
    }

    @Override
    public void atender() {
        System.out.println("atendendo a ligação");
    }

    @Override
    public void desligarLigacao() {
        System.out.println("desligando a ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("reproduzindo correio de voz");
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("tocando musica");
    }

    @Override
    public void pausarMusica() {
        System.out.println("ligação pausada");
    }

    @Override
    public void reproduzirVideo() {
        System.out.println("reproduzindo video");
    }

    @Override
    public void pausarVideo() {
        System.out.println("pausando video");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("musica selecionada");
    }

    @Override
    public void selecionarVideo() {
        System.out.println("selecionar video");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("pagina exibida");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("nova aba aberta");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("pagina recarregada");
    }

    @Override
    public void enviarEmail() {
        System.out.println("enviando email");
    }

    @Override
    public void abrirMapas() {
        System.out.println("abrir mapa");
    }
}
