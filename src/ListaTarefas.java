import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
  private Set<Tarefa> listaTarefasSet;

  public ListaTarefas() {
    this.listaTarefasSet = new HashSet<>();
  }

  public void adicionarTarefa(String descricao) {
    listaTarefasSet.add(new Tarefa(descricao, false));
  }

  public void removerTarefa(String descricao) {
    Tarefa tarefasParaRemover = null;
    if (!listaTarefasSet.isEmpty()) {
      for (Tarefa t : listaTarefasSet) {
        tarefasParaRemover = t;
        break;
      }
    }
    listaTarefasSet.remove(tarefasParaRemover);
  }

  public void exibirTarefas() {
    System.out.println(listaTarefasSet);
  }

  public int contarTarefas() {
    return listaTarefasSet.size();
  }

  public Set<Tarefa> obterTarefasConcluidas() {
    Set<Tarefa> tarefasConcluidas = new HashSet<>();
    for (Tarefa t : listaTarefasSet) {
      if (t.isTarefaConcluida()) {
        tarefasConcluidas.add(t);
      }
    }
    return tarefasConcluidas;
  }

  public Set<Tarefa> obterTarefasPendentes() {
    Set<Tarefa> tarefasPendentes = new HashSet<>();
    for ( Tarefa t : listaTarefasSet ) {
      if (!t.isTarefaConcluida()) {
        tarefasPendentes.add(t);
      }
    }
    return tarefasPendentes;
  }

  public void marcarTarefaConcluida(String descricao) {
    for (Tarefa t : listaTarefasSet) {
      if (!t.isTarefaConcluida() && t.getDescricao().equalsIgnoreCase(descricao)) {
        t.setTarefaConcluida(true);
      }
    }
  }
}
