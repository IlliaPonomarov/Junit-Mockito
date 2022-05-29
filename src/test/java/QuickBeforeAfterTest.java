import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuickBeforeAfterTest {


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
}
