import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.*;

import java.util.Arrays;
import static org.junit.Assert.*;

public class ArraysCompareTest {

    //Arrays.sort


    @Test
    @Disabled
    public void testArraySort_RandomArray(){
        int[] numbers = {12, 3, 4, 1};
        int[] excepted = {1, 3, 4, 12};
        Arrays.sort(numbers);

        assertArrayEquals(excepted, numbers);
        // => => => => => => => => =>

    }


    @Test
    @Disabled
    public void testException(){
        int[] numbers = null;

        try{

            Arrays.sort(numbers);
        }catch(NullPointerException exception){
            exception.printStackTrace();
        }
    }

    @Test
    public void testPerformance(){

        int[] array = {12, 23, 4};
        for (int i = 1; i <= 1_000_000 ; i++) {
            array[0] = i;
            Arrays.sort(array);
        }
    }






}
