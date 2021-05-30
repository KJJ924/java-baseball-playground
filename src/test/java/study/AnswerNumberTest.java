package study;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author dkansk924@naver.com
 * @since 2021/05/31
 */
class AnswerNumberTest {

    @ParameterizedTest
    @DisplayName("요소가 배열안에 있어야함")
    @ValueSource(ints = {1,2,3})
    void contains(int value) {
        //given
        AnswerNumber answerNumber = new AnswerNumber(List.of(1,2,3));
        //then
        assertThat(answerNumber.contains(value)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"1:0","2:1","3:2"} , delimiterString = ":")
    @DisplayName("요소가 배열안에 존재하며 순서도 일치 하여야한다.")
    void containsExactly(int value , int index) {
        //given
        AnswerNumber answerNumber = new AnswerNumber(List.of(1,2,3));
        //then
        assertThat(answerNumber.containsExactly(value,index)).isTrue();
    }
}