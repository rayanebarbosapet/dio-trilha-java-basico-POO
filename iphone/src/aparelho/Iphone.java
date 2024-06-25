package aparelho;

import sistema.Ios;

public class Iphone {
    public static void main(String[] args) throws Exception {
        Ios ios = new Ios();

        ios.adicionarNovaPagina();
        ios.exibirPagina("www.ios.com.br");
        ios.atualizarPagina();
    }
}
