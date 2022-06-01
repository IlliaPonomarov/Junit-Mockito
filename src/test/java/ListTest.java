
import Mockito.Calculates;
import Mockito.TodoBusinessImpl;
import Mockito.TodoService;
import Mockito.TodoServiceStub;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ListTest {



    @Test
    public void testMockListSizeMethod_ReturnMultiplyValues() {
        List list = mock(List.class);
        when(list.get(anyInt())).thenReturn("Hello").thenReturn(3).thenReturn("MAREK").thenReturn(0);

        Random random = new Random();


        assertEquals("Hello", list.get(879));
        assertEquals(3, list.get(90000));
        assertEquals("MAREK", list.get(87979));


      //  assertEquals(0, list.get(-12));
    }


    @Test
    public void letsMockListSizeMethod(){
        //Given
        List listMock = mock(List.class);

        when(listMock.size()).thenReturn(2);

        assertEquals(2, listMock.size());

        //When - actual method call.

        //Then - asserts



    }
}