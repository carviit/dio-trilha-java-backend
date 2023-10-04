package DiagramacaoClassesIphone.src;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void ligar() {
        System.out.println("Ligando.....");
        
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação....");
        
    }

    @Override
    public void iniciarCorreioVoz() {

        System.out.println("Iniciando correio de voz....");
        
        
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música....");
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba....");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando aba....");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo aba....");
        
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música....");
        
    }

    @Override
    public void selecionarMusica(Musica nomeMusica) {
        System.out.println("Selecionando música " + nomeMusica + "com duração de " + nomeMusica.getTempoDuracao() + " minutos");
        
    }

}
