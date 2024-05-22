package sm;

import static sm.State.*;

public class SM {

    private static State currentState = GREEN;

    public static void StateMachine() throws InterruptedException {
        while (true) {
            switch (currentState) {
                case GREEN -> {
                    System.out.println("Горит Зелёный");
                    Thread.sleep(5000);
                    currentState = YELLOW;
                }
                case YELLOW -> {
                    System.out.println("Горит Жёлтый");
                    Thread.sleep(1000);
                    currentState = RED;
                }
                case RED -> {
                    System.out.println("Горит Красный");
                    Thread.sleep(5500);
                    currentState = GREEN;
                }
            }
        }
    }
}
