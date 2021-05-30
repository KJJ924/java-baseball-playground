package study;

import java.util.List;

/**
 * @author dkansk924@naver.com
 * @since 2021/05/31
 */
public class AnswerNumber {

    private final List<Integer> selectedNumber;

    public AnswerNumber(List<Integer> selectedNumber) {
        this.selectedNumber = selectedNumber;
    }

    public boolean contains(int value) {
        return selectedNumber.contains(value);
    }


    public boolean containsExactly(int value, int index) {
        return selectedNumber.contains(value) && selectedNumber.get(index).equals(value);
    }

    public List<Integer> getSelectedNumber() {
        return selectedNumber;
    }
}
