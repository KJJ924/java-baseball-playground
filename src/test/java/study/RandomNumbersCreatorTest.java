package study;

import static org.assertj.core.api.Assertions.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author dkansk924@naver.com
 * @since 2021/05/29
 */
public class RandomNumbersCreatorTest {

    @Test
    @DisplayName("3자리 숫자 생성")
    void createNumber () {
        //given
        RandomNumbersCreator numbersCreator = new RandomNumbersCreator();
        //when
        AnswerNumber answerNumber = numbersCreator.create();
        //then
        assertThat(answerNumber.getSelectedNumber().size()).isEqualTo(3);
    }

    @Test
    @DisplayName("3자리 숫자 생성후 중복 숫자가 없어야함")
    void duplicateNumber() {
        //given
        RandomNumbersCreator numbersCreator = new RandomNumbersCreator();
        //when
        AnswerNumber answerNumber = numbersCreator.create();
        //then
        Set<Integer> set = new HashSet<>(answerNumber.getSelectedNumber());
        assertThat(set.size()).isEqualTo(3);
    }
}
