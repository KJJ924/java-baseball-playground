package study;

import java.util.List;

/**
 * @author dkansk924@naver.com
 * @since 2021/05/29
 */
public class StrikeAndBallCheckService {

    private final List<Integer> numbers;
    private int strikeCount;
    private int ballCount;


    public StrikeAndBallCheckService(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public boolean checking(List<Integer> target) {
        for (int index = 0; index < target.size(); index++) {
            Integer value = target.get(index);
            contains(value, index);
        }
        Referee referee = new Referee(strikeCount, ballCount);
        clearCount();
        return referee.call();
    }

    private void contains(int value, int index) {
        if (numbers.contains(value) && numbers.get(index).equals(value)) {
            strikeCount += 1;
            return;
        }
        if (numbers.contains(value)) {
            ballCount += 1;
        }
    }

    private void clearCount() {
        this.strikeCount = 0;
        this.ballCount = 0;
    }
}
