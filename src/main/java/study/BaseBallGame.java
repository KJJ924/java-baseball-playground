package study;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import study.view.GameView;

/**
 * @author dkansk924@naver.com
 * @since 2021/05/29
 */
public class BaseBallGame {

    private final RandomNumbersCreator numbersCreator = new RandomNumbersCreator();
    private final Scanner scanner = new Scanner(System.in);
    private boolean status = false;

    public boolean start() {
        StrikeAndBallCheckService service = new StrikeAndBallCheckService(numbersCreator.create());

        while (!status) {
            status = service.checking(userInput());
        }
        return restarted();
    }

    private boolean restarted(){
        return scanner.nextInt() == 1;
    }
    private List<Integer> userInput() {
        GameView.inputPrint();
        return inputDataRefining(scanner.next());
    }

    private List<Integer> inputDataRefining(String inputData) {
        String[] spaceRemove = inputData.trim().split("");
        return Arrays.stream(spaceRemove).map(Integer::valueOf).collect(Collectors.toList());
    }
}
