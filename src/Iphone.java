import celular.funcionalidades.AparelhoTelefonico;
import celular.funcionalidades.NavegadorInternet;
import celular.funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical,AparelhoTelefonico,NavegadorInternet {
    private String modelo;
    private String numeroSerie;
    
    public Iphone(String modelo, String numeroSerie) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    /* implementando os metodos de reprodutor musical*/
    public void tocar(){
        System.out.println("Tocando musica......");
    }

    public void pausar(){
        System.out.println("Musica pausada");
    }

    public void selecionarMusica(String musica){
        System.out.printf("Selecionando  a musica \"%s\" \n",musica);
    }
    /* implementando os metodos de aparelho telefonico*/

    public void ligar(String numero){
        System.out.printf("Ligando para %s\n",numero);
    }

    public void atender(){
        System.out.println("Atendendo a chamada....");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz inciado...fale a mensagem");
    }

    /* implementando os metodos de reprodutor navegador de internet*/
    public void exibirPagina(){
        System.out.println("Exibindo pagina web");
    }

    public void adicionarNovaAba(){
        System.out.println("Adcionando nova aba");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando pagina");
    }

}