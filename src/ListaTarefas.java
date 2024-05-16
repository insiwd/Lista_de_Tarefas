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

  public void exibirTarefas() {
    System.out.println(listaTarefasSet);
  }
}
