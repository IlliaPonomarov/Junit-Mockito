import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class StringHelperTest {


    private StringHelper helper;

    @BeforeEach
    public void init(){
        helper = new StringHelper();
    }

    //AACD => CD, ACD => CD , CDEF => CDEF, CDAA => CDAA
    @Test
    void testTruncateAInFirst2Positions(){

        StringHelper helper = new StringHelper();

        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
//        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
//        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
//        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }




    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario(){
       boolean actual = helper.areFirstAndLastTwoCharactersTheSame("ABAB");
       boolean excepted = false;

       assertTrue(actual);
    }
}
