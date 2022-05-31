package Mockito;

import java.util.*;

public interface TodoService {

    List<String> retrieveTodos(String user);
    void deleteTodo(String todo);
}
