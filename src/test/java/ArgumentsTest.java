import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.*;
import java.util.stream.Stream;

public class ArgumentsTest {



    @ParameterizedTest
    @MethodSource("streamString")
    void test(String name, Integer age, List<String> myWomans){
        System.out.println(name + " " + age);
        for (String woman: myWomans)
            System.out.println(woman);
    }

    static Stream<Arguments> streamString(){
        return Stream.of(
                Arguments.arguments("Illia", 19, Arrays.asList("Yula", "Alona"))
        );
    }

}
