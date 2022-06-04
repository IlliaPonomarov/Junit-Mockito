import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.when;
import java.util.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UtilityClass.class)
@PowerMockIgnore("jdk.internal.reflect.*")
public class MockingStaticMethodTest {

    //Specific runner
    //Initialize Utility.class

//    @Rule
//    public MockitoRule mockitoRule = MockitoJUnit.rule();


    @Mock
    Dependency dependency;

    @InjectMocks
    SystemUnderTest systemUnderTest;

    @Test
    public void powerMock_test(){
        List<Integer> stats = Arrays.asList(1, 2, 3);

        when(dependency.retrieveAllStats()).thenReturn(stats);
        PowerMockito.mockStatic(UtilityClass.class);

        when(UtilityClass.staticMethod(6)).thenReturn(150);
        int result = systemUnderTest.methodCallingAStaticMethod();

        assertEquals(150, result);
        assertThat(result, is(150));

        PowerMockito.verifyStatic();
        UtilityClass.staticMethod(5);

    }

    @Test
    public void constructorMockTest(){

    }

}
