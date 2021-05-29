package study;


import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author dkansk924@naver.com
 * @since 2021/05/28
 */
public class StringCalculator {

    CalculatorMemory calculatorMemory = new CalculatorMemory();

    //main
    public int process(String[] values) {
        for (String value : values) {
            calculatorMemory.add(value);
        }
        return calculatorMemory.getResult();
    }

    @Test
    void process() {
        StringCalculator stringCalculator = new StringCalculator();
        String[] s = {"2", "+", "3", "*", "4", "/", "2"};
        int result = stringCalculator.process(s);
        assertThat(result).isEqualTo(10);
    }


}
