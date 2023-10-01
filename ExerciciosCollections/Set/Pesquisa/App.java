package ExerciciosCollections.Set.Pesquisa;

import java.util.Set;

public class App {

    public static void main(String[] args) {

        ListaTarefas listaDeTarefas = new ListaTarefas();

        listaDeTarefas.adicionarTarefa("Caminhar com o cachorro");
        listaDeTarefas.adicionarTarefa("Fazer compras");
        listaDeTarefas.adicionarTarefa("Ir ao dentista");

        listaDeTarefas.exibirTarefas();

        listaDeTarefas.marcarTarefaConcluida("Caminhar com o cachorro");

        listaDeTarefas.exibirTarefas();

        listaDeTarefas.marcarTarefaPendente("Caminhar com o cachorro");

        Set<Tarefa> tarefasPendentes;

        tarefasPendentes = listaDeTarefas.obterTarefasPendentes();

        System.out.println("== Tarefas Pendentes ==");
        for (Tarefa tarefa : tarefasPendentes) {

            System.out.print("[" + tarefa.getDescricao() + "] ");
        }

        listaDeTarefas.limparListaTarefas();

        listaDeTarefas.exibirTarefas();

    }

}
