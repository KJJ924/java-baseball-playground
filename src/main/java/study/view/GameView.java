package study.view;

/**
 * @author dkansk924@naver.com
 * @since 2021/05/29
 */
public class GameView {

    public static void inputPrint() {
        System.out.print(GameInfoMessage.INPUT.message);
    }

    public static void end(){
        strikeCall(3);
        System.out.println(GameInfoMessage.END.message);
        restartOrEnd();
    }

    public static void strikeBallCall(int strikeCount,int ballCount){
        System.out.printf("%d볼 %d 스트라이크 \n",ballCount,strikeCount);
    }

    public static void restartOrEnd(){
        System.out.println(GameInfoMessage.FINISH.message);
    }

    public static void ballCall(int ballCount) {
        System.out.printf("%d볼 \n",ballCount);
    }

    public static void strikeCall(int strikeCount) {
        System.out.printf("%d 스트라이크 \n",strikeCount);
    }

    public static void nothingCall() {
        System.out.println(GameInfoMessage.NOTHING.message);
    }
}
