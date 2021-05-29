package study;

import study.view.GameView;

/**
 * @author dkansk924@naver.com
 * @since 2021/05/29
 */
public class Referee {

    private final int strikeCount;
    private final int ballCount;

    public Referee(final int strikeCount,final int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public boolean call(){
        if(strikeCount ==3){
            GameView.end();
            return true;
        }
        if(strikeCount !=0 && ballCount !=0){
            GameView.strikeBallCall(strikeCount,ballCount);
            return false;
        }

        if(strikeCount == 0 && ballCount !=0){
            GameView.ballCall(ballCount);
            return false;
        }

        if(strikeCount != 0){
            GameView.strikeCall(strikeCount);
            return false;
        }

        GameView.nothingCall();
        return false;
    }
}
