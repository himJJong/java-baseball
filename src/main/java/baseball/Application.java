package baseball;

import java.util.ArrayList;
import java.util.List;

public class Application {
    static List<Integer> computer = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다.");   // 나중에 enum이나 따로 클래스를 지정해서 하는걸
        MakeRandomBall makeRandomBall = new MakeRandomBall();
        computer = makeRandomBall.outputRandomBall();
    }
}
