import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
  
    List<Tarefa> yodo = new ArrayList<>();

    

    public ListaTarefas() {
        this.yodo = new ArrayList<>();
    }



    public void adicionarTarefa(String descricao){
        yodo.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
       for (Tarefa tarefa : yodo) {
            if(tarefa.getDescricao().trim().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
            }
       }
       yodo.removeAll(tarefasParaRemover);
    }


    public int obterNumeroTarefas(){
        return yodo.size();
    }

    public void obterDescricoesTarefas(){
       if(!yodo.isEmpty()){
            System.out.println(yodo);
       }
       else{
            System.out.println("A lista esta vazia");
       }
    }



    @Override
    public String toString() {
        return "ListaTarefas: " + yodo;
    }



   

    
}
