import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class StringHelperTest {



    //AACD => CD, ACD => CD , CDEF => CDEF, CDAA => CDAA
    @Test
    void testTruncateAInFirst2Positions(){

        StringHelper helper = new StringHelper();

        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }
}
