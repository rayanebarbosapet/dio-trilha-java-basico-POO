package sistema;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Ios implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void atender() {
      System.out.println("Atendendo a ligação");
    }

    @Override
    public void ligar(String numero) {
      System.out.println("ligando para o número " + numero);
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
     
    }

    @Override
    public void tocar() {
      System.out.println("Tocando música escolhida");
        
    }

    @Override
    public void pausar() {
      System.out.println("pausando música");
       
    }

    @Override
    public void selecionarMusica(String musica) {
      System.out.println("selecionando música " + musica);
       
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
      
    }

    @Override
    public void exibirPagina(String url) {
      System.out.println("Exibindo página " + url);
        
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Adicionando nova página");
      
    }

}
