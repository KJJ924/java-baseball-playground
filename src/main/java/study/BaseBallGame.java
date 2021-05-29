package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author dkansk924@naver.com
 * @since 2021/05/29
 */
public class BaseBallGame {

    private final RandomNumbersCreator numbersCreator = new RandomNumbersCreator();
    private final Scanner scanner = new Scanner(System.in);
    public void start() {
        numbersCreator.create();
        String userInput = userInput();

        scanner.close();
    }


    private String userInput(){
        System.out.print(GameInfoMessage.INPUT.message);
        List<String> stringList = InputDataRefining(scanner.next());
        System.out.println(stringList);
        return null;
    }

    public List<String>  InputDataRefining(String inputData){
        String[] spaceRemove = inputData.trim().split("");
        if(spaceRemove.length !=3){
            throw new IllegalArgumentException("입력값 오류 다시 입력하세요");
        }
        return Arrays.stream(spaceRemove).collect(Collectors.toList());

    }

}
