import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuickBeforeAfterTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }

    @BeforeEach
    public void setup(){
        System.out.println("Before Test");
    }

    @Test
    public void test1(){
        System.out.println("Test1 executed");
    }

    @Test
    public void test2(){
        System.out.println("Test2 executed");
    }


    @AfterEach
    public void teardown(){
        System.out.println("After");
    }
}
