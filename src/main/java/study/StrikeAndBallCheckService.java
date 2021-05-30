package study;

import java.util.List;

/**
 * @author dkansk924@naver.com
 * @since 2021/05/29
 */
public class StrikeAndBallCheckService {

    private final AnswerNumber answerNumber;
    private int strikeCount;
    private int ballCount;


    public StrikeAndBallCheckService(AnswerNumber answerNumber) {
        this.answerNumber = answerNumber;
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
        if (answerNumber.containsExactly(value,index)) {
            strikeCount += 1;
            return;
        }
        if (answerNumber.contains(value)) {
            ballCount += 1;
        }
    }

    private void clearCount() {
        this.strikeCount = 0;
        this.ballCount = 0;
    }
}
