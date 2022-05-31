import Mockito.TodoBusinessImpl;
import Mockito.TodoService;
import Mockito.TodoServiceStub;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.hamcrest.CoreMatchers;


import java.util.*;

public class ToDoBusinessImplStubTest {

    @Test
    public void test(){

        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceStub);

        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");

        assertEquals(2, filteredTodos.size());
    }

    @Test
    public void test2(){
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceStub);

        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy1");

        assertEquals(0, filteredTodos.size());
    }
}
