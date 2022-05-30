import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

    StringHelper helper = new StringHelper();

    private String input;
    private String expectedOutput;

    public StringHelperParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions() {
        String expectedOutputs[][] = {
                { "AACD", "CD" },
                { "ACD", "CD" },
                {"AACD", "CD"}
        };
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTruncateAInFirst2Positions() {
        assertEquals(expectedOutput,
                helper.truncateAInFirst2Positions(input));
    }

//
//
//
//    //AACD => CD, ACD => CD , CDEF => CDEF, CDAA => CDAA
//    @ParameterizedTest
//    void testTruncateAInFirst2Positions(){
//
//        StringHelper helper = new StringHelper();
//
//        assertEquals(excepted, helper.truncateAInFirst2Positions(actual));
////        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
////        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
////        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
//    }
//
//
//
//
////    @Test
////    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario(){
////        boolean actual = helper.areFirstAndLastTwoCharactersTheSame("ABAB");
////        boolean excepted = false;
////
////        assertTrue(actual);
////    }
}
