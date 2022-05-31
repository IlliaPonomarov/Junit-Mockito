import Mockito.TodoBusinessImpl;
import Mockito.TodoService;
import Mockito.TodoServiceStub;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;

public class ToDoBusinessImplMockTest {



    @Test
    public void test(){

        //Given
        TodoService todoServiceMock = mock(TodoService.class, "Hello");
        given(todoServiceMock.retrieveTodos(anyString())).willReturn(
                Arrays.asList("Learn Spring", "Learn Spring MVC", "Learn to Dance"));

        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);

        //When
        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Rocky");

        //Then
        assertEquals(2, filteredTodos.size());
    }

    @Test
    public void test_usingBDD(){
        TodoService todoServiceStub = mock(TodoService.class);

        given(todoServiceStub.retrieveTodos(anyString())).willReturn(Arrays.asList("Learn Spring", "Learn Spring MVC", "Learn to Dance"));


        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceStub);

        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy1");

        assertEquals(2, filteredTodos.size());
        assertThat(filteredTodos.size(), is(2));
    }


    @Test
    public void deleteMockBDDTest(){
        //Given
        TodoService todoServiceMock = mock(TodoService.class, "Hello");
        given(todoServiceMock.retrieveTodos(anyString())).willReturn(
                Arrays.asList("Learn Spring", "Learn Spring MVC", "Learn to Dance"));

        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);

        //When
        todoBusiness.delete("Rocky");

        //Then
        verify(todoServiceMock, atLeastOnce()).deleteTodo("Learn to Dance");
        verify(todoServiceMock, never()).deleteTodo("Learn Spring MVC");
        todoServiceMock.deleteTodo("Learn to Dance");
    }
}
