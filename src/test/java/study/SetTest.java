package study;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author dkansk924@naver.com
 * @since 2021/05/28
 */
public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void size() {
        //when
        int size = numbers.size();
        //then
        assertThat(size).isEqualTo(3);
    }


    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void contains(int param) {
        //then
        assertThat(numbers.contains(param)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true","2:true","3:true","4:false","5:false"},delimiter = ':')
    void contains2(int input , boolean expect) {
        //then
        assertEquals(numbers.contains(input),expect);
    }
}
