package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        //given
        String data ="1,2";
        //when
        String[] split = data.split(",");
        //then
        assertThat(split).contains("2","1"); // 순서를 상관하지않음
        assertThat(split).containsExactly("1","2"); // 순서도 확인함
    }

    @Test
    void subString() {
        //given
        String data = "(1,2)";
        //when
        String substring = data.substring(1, data.length() - 1);
        //then
        assertThat(substring).isEqualTo("1,2");
    }

    @Test
    @DisplayName("String 의 특정 위치의 문자를 가져올 때 범위가 벗어나면 오류")
    void charAt() {
        //given
        String data = "abc";
        //when
        assertThatThrownBy(()->{
            data.charAt(data.length());
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
            .hasMessageContaining("String index out of range: 3");
    }

}
