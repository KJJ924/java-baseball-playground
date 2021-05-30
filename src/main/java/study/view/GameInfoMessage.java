package study.view;


/**
 * @author dkansk924@naver.com
 * @since 2021/05/29
 */
public enum GameInfoMessage {
    INPUT("숫자를 입력해 주세요 :"),
    FINISH("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    END("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    NOTHING("낫싱");

    String message;

    GameInfoMessage(String message) {
        this.message = message;
    }
}
