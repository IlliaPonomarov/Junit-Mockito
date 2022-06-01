import org.junit.jupiter.api.Test;
import java.util.*;
import org.mockito.BDDMockito;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HamcrestMathchersTest {

    @Test
    public void test(){
        List<Integer> scores = Arrays.asList(99, 100, 101, 105);

        assertThat(scores, hasSize(4));
        assertThat(scores, hasItems(100, 99));

        //every time : > 90
        assertThat(scores, everyItem(greaterThan(90)));
        assertThat(scores, everyItem(lessThan(190)));

        //Strings
        assertThat("", isEmptyString());
        assertThat("", isEmptyOrNullString());

        //Arrays
        Integer[] marks = {1, 2, 3};
        assertThat(marks, arrayContaining(1, 2, 3));
        assertThat(marks, arrayContainingInAnyOrder(2, 1, 3));


    }
}
