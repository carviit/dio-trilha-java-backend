package ExerciciosCollections.Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> conjuntoDeTarefas;

    public ListaTarefas() {

        this.conjuntoDeTarefas = new HashSet<>();
    }

    void adicionarTarefa(String descricao) {

        Tarefa tarefa = new Tarefa();

        tarefa.setDescricao(descricao);
        tarefa.setStatusConclusao(false);

        this.conjuntoDeTarefas.add(tarefa);

    }

    void removerTarefa(String descricao) {

        Tarefa tarefa = new Tarefa();

        tarefa.setDescricao(descricao);

        if (this.conjuntoDeTarefas.contains(tarefa)) {

            this.conjuntoDeTarefas.remove(tarefa);

            System.out.println("A tarefa [" + tarefa.getDescricao() + "] foi removida.");

        } else {
            System.out.println("A tarefa [" + tarefa.getDescricao() + "] não está na lista de tarefas.");

        }

    }

    void exibirTarefas() {

        if (!this.conjuntoDeTarefas.isEmpty()) {

            System.out.println("=========== TAREFAS ===========\n");

            for (Tarefa tarefa : conjuntoDeTarefas) {

                System.out.println("Descrição: " + tarefa.getDescricao());
                System.out.println("Status Conclusão: " + tarefa.getStatusConclusao());
                System.out.println();
            }

        } else {

            System.out.println("\n\n>>>> O conjunto de tarefas está vazio <<<");

        }

    }

    void contarTarefas() {

        System.out.println("O número de total de tarefas é [" + this.conjuntoDeTarefas.size() + "]");
    }

    Set<Tarefa> obterTarefasConcluidas() {

        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa tarefa : this.conjuntoDeTarefas) {

            if (tarefa.getStatusConclusao()) {

                tarefasConcluidas.add(tarefa);
            }
        }

        return tarefasConcluidas;
    }

    Set<Tarefa> obterTarefasPendentes() {

        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa tarefa : this.conjuntoDeTarefas) {

            if (!tarefa.getStatusConclusao()) {

                tarefasPendentes.add(tarefa);

            }

        }

        return tarefasPendentes;

    }

    void marcarTarefaConcluida(String descricao) {

        for (Tarefa tarefa : this.conjuntoDeTarefas) {

            if (tarefa.getDescricao().equals(descricao)) {

                tarefa.setStatusConclusao(true);
            }

        }
    }

    void marcarTarefaPendente(String descricao) {

        for (Tarefa tarefa : this.conjuntoDeTarefas) {

            if (tarefa.getDescricao().equals(descricao)) {

                tarefa.setStatusConclusao(false);
            }

        }
    }

    void limparListaTarefas() {

        this.conjuntoDeTarefas.removeAll(conjuntoDeTarefas);

    }

}
