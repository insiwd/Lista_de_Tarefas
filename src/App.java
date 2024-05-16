public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefas ls = new ListaTarefas();

        ls.adicionarTarefa("lavar pratos");
        ls.exibirTarefas();
        
        ls.adicionarTarefa("terminar atividades");
        ls.removerTarefa("terminar atividades");
        ls.exibirTarefas();
    }
}
