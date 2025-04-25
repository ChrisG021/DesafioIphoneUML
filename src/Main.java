public class Main {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone("2025563321-5", "43433ACSDF333");

        //aparelho telefonico
        System.out.println("\n==========Funcionalidades de aparelho telefonico==========");
        iphone.ligar("8699548832");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //rep.musical
        System.out.println("\n==========Funcionalidades de reprodutor musical==========");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("popular-The weeknd");

        //navegador internet
        System.out.println("\n==========Funcionalidades de navegador internet==========");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
