import funcao.ServicosTelefone;
import multimidia.Multimidia;
import web.NavegacaoInternet;

public class Dispositivo extends Iphone{

    public static void main(String[] args) {


        NavegacaoInternet iphone = new Iphone();
        iphone.atualizarPagina();

        Multimidia multimidia = new Iphone();
        multimidia.reproduzirMusica();

        ServicosTelefone funcoes = new Iphone();
        funcoes.atender();
    }

}
