import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.BDDMockito;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.*;

public class SpyTest {


    @Test
    public void test(){
        List arrayListSpy = spy(ArrayList.class);

        stub(arrayListSpy.size()).toReturn(5);
        assertEquals(5, arrayListSpy.size());


    }
}
