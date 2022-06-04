import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(SystemUnderTest.class)
@PowerMockIgnore("jdk.internal.reflect.*")
public class PowerMockConstructorTest {

    //PrepareForTest => SystemUNderTEst.class
    //override the constructor
    @Mock
    ArrayList mockList;

    @InjectMocks
    SystemUnderTest systemUnderTest;

    @Test
    public void powerMock_test() throws Exception {
        List<Integer> stats = Arrays.asList(1, 2, 3);

        when(mockList.size()).thenReturn(1);
        PowerMockito.whenNew(ArrayList.class).withAnyArguments().thenReturn(mockList);

        int size = systemUnderTest.methodUsingAnArrayListConstructor();

        assertEquals(1, size);


    }



}
