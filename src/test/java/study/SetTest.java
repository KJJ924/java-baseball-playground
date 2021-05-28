package study;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;

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

}
