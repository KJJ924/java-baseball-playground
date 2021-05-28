package study;
import static org.assertj.core.api.Assertions.*;

import java.util.Stack;
import org.junit.jupiter.api.Test;

/**
 * @author dkansk924@naver.com
 * @since 2021/05/28
 */
public class CalculatorMemory {

    private final Stack<String> stack = new Stack<>();

    public void add(String s) {
        if (stack.size() == 3) calculation();
        stack.add(s);
        if (stack.size() == 3) calculation();
    }

    public int getResult(){
        return Integer.parseInt(stack.pop());
    }

    private void calculation() {
        String postValue = stack.pop();
        String op = stack.pop();
        String preValue = stack.pop();
        switch (op) {
            case "+":
                stack.add(plus(preValue, postValue));
                break;
            case "-":
                stack.add(minus(preValue, postValue));
                break;
            case "/":
                stack.add(division(preValue, postValue));
                break;
            case "*":
                stack.add(multiplication(preValue, postValue));
                break;
            default:
                throw new IllegalArgumentException("not supported Operation");
        }
    }

    //plus
    private String plus(String a, String b) {
        int result = Integer.parseInt(a) + Integer.parseInt(b);
        return String.valueOf(result);
    }

    //minus
    private String multiplication(String a, String b) {
        int result = Integer.parseInt(a) * Integer.parseInt(b);
        return String.valueOf(result);
    }

    //division
    private String division(String a, String b) {
        int result = Integer.parseInt(a) / Integer.parseInt(b);
        return String.valueOf(result);
    }

    //multiplication
    private String minus(String a, String b) {
        int result = Integer.parseInt(a) - Integer.parseInt(b);
        return String.valueOf(result);
    }

    @Test
    void plus() {
        //when
        String result = plus("1", "2");
        //then
        assertThat(result).isEqualTo("3");
    }

    @Test
    void minus() {
        //when
        String result = minus("3", "2");
        //then
        assertThat(result).isEqualTo("1");
    }
    @Test
    void division() {
        //when
        String result = division("4", "2");
        //then
        assertThat(result).isEqualTo("2");
    }

    @Test
    void multiplication() {
        //when
        String result = multiplication("2", "2");
        //then
        assertThat(result).isEqualTo("4");
    }
}
