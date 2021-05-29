package study;

/**
 * @author dkansk924@naver.com
 * @since 2021/05/29
 */
public class Game {

    public static void main(String[] args) {
        boolean restart;
        do {
            BaseBallGame baseBallGame = new BaseBallGame();
            restart = baseBallGame.start();
        } while (restart);
    }

}
