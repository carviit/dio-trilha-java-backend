package DiagramacaoClassesIphone.src;

import java.util.ArrayList;
import java.util.List;

public interface AparelhoTelefonico {

    List<Contato> listaDeContatos = new ArrayList<>();

    public void iniciarCorreioVoz();
    public void ligar();
    public void atender();

}
