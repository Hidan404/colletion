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
        yodo.remove(0);
    }

    public int obterNumeroTarefas(){
        return yodo.size();
    }

    public void obterDescricoesTarefas(){
        for (Tarefa tarefa : yodo) {
            System.out.println("A tarefa: " + tarefa);
        }
    }
}
