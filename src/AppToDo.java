public class AppToDo {
    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Comer pao");
        tarefas.adicionarTarefa("Comer pao");
        tarefas.adicionarTarefa("Sexo");
        System.out.println(tarefas.obterNumeroTarefas());


        tarefas.removerTarefa("sexo");
        System.out.println("numero de tarefas " + tarefas.obterNumeroTarefas());

        tarefas.obterDescricoesTarefas();
        
    }
}
