public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefas ls = new ListaTarefas();

        System.out.println("existem " + ls.contarTarefas() + " tarefas!");
        ls.adicionarTarefa("lavar pratos");
        ls.exibirTarefas();

        ls.adicionarTarefa("terminar atividades");
        ls.exibirTarefas();
        System.out.println("existem " + ls.contarTarefas() + " tarefas!");

        ls.removerTarefa("terminar atividades");
        ls.exibirTarefas();
        System.out.println("existem " + ls.contarTarefas() + " tarefas!");

        System.out.println("existem " + ls.obterTarefasConcluidas() + " tarefas concluidas!");
        System.out.println("existem " + ls.obterTarefasPendentes() + " tarefas pendentes!");

    }
}
