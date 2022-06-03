import Mockito.TodoBusinessImpl;
import Mockito.TodoService;
import Mockito.BasicCalucalte;
import Mockito.Calculates;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;

public class TodoBusinessMockitoInjectionMocksTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    TodoService todoServiceMock;

    @InjectMocks
    TodoBusinessImpl todoBusiness;

    @Captor
    ArgumentCaptor<?> argumentCaptor;


    @Mock
    private BasicCalucalte basicCalucalte;

    @InjectMocks
    private Calculates calculates;

    @Captor
    private ArgumentCaptor<Double> argumentCaptorDouble;

    @Test
    public void deleteMockBDDTest(){
        //Given
     //   TodoService todoServiceMock = mock(TodoService.class, "Hello");
        given(todoServiceMock.retrieveTodos("Rocky")).willReturn(
                Arrays.asList("Learn Spring", "Learn Spring MVC", "Learn to Dance"));

    //    TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);

        //When
        todoBusiness.delete("Rocky");

        //Then

        then(todoServiceMock).should(atLeastOnce()).deleteTodo("Learn to Dance");
        verify(todoServiceMock, atLeastOnce()).deleteTodo("Learn to Dance");
        verify(todoServiceMock, never()).deleteTodo("Learn Spring MVC");
        todoServiceMock.deleteTodo("Learn to Dance");
    }


    @Test
    public void testArgumentCaptor(){

        given(basicCalucalte.add(1, 2)).willReturn(3.0);

        assertThat(basicCalucalte.add(1, 2), is(3.0));

        then(basicCalucalte).should(atLeastOnce()).add(argumentCaptorDouble.capture(), argumentCaptorDouble.capture());

        List<Double> list = argumentCaptorDouble.getAllValues();

        list.forEach(System.out::println);



    }

}
