package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

}
