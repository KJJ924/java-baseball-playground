package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dkansk924@naver.com
 * @since 2021/05/29
 */
public class RandomNumbersCreator {

    private static final List<Integer> RANDOM_NUMBERS = new ArrayList<>(
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));

    public List<Integer> create() {
        Collections.shuffle(RANDOM_NUMBERS);
        return RANDOM_NUMBERS.stream().limit(3).collect(Collectors.toList());
    }
}
