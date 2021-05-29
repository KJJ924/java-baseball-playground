package study;

/**
 * @author dkansk924@naver.com
 * @since 2021/05/29
 */
public enum GameInfoMessage {
    INPUT("숫자를 입력해 주세요 :") , FINISH("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    String message;

    GameInfoMessage(String message) {
        this.message = message;
    }
}
