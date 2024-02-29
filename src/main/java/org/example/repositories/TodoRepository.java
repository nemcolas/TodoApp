package org.example.repositories;

import org.example.entities.Todo;

import java.util.ArrayList;
import java.util.List;

public class TodoRepository {
    private List<Todo> listaDeTarefas = new ArrayList<>();

    public void create (Todo todo)
    {
        listaDeTarefas.add(todo);
    }

    public List<Todo> read(){
        return listaDeTarefas;
    }

    public void update(Todo todo){
        for (Todo tarefa: listaDeTarefas)
            if(tarefa.getTitle().equals(todo.getTitle())){
                tarefa.setDescription(todo.getDescription());
                tarefa.setDone(todo.isDone());
            }

    }

    public void delete(String title){
        for (Todo tarefa : listaDeTarefas){
            if (tarefa.getTitle().equals(title)){
                listaDeTarefas.remove(tarefa);
                break;

            }
        }
    }
}




