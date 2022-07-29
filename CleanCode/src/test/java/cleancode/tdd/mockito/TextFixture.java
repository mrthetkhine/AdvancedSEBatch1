package cleancode.tdd.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.params.provider.Arguments.arguments;
public class TextFixture {

	@ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testIntArray(int arg) {
        assertTrue(arg > 0);
    }
	
    @ParameterizedTest(name = "#{index} - Test with String : {0}")
    @MethodSource("stringProvider")
    void test_method_string(String arg) {
        assertNotNull(arg);
    }

    // this need static
    static Stream<String> stringProvider() {
        return Stream.of("java", "rust");
    }
    
    @ParameterizedTest
    @MethodSource("stringIntAndListProvider")
    void testWithMultiArgMethodSource(String str, int length, List<String> list) {
        assertTrue(str.length() > 0);
        assertEquals(length, list.size());
    }

    static Stream<Arguments> stringIntAndListProvider() {
        return Stream.of(
                arguments("abc", 3, Arrays.asList("a", "b", "c")),
                arguments("lemon", 2, Arrays.asList("x", "y"))
        );
    }
    
    @ParameterizedTest
    @CsvSource({
            "java,      4",
            "clojure,   7",
            "python,    6"
    })
    void test_csv(String str, int length) {
        assertEquals(length, str.length());
    }
}
