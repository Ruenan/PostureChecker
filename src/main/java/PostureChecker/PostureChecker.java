package PostureChecker;

import java.util.Timer;
import java.util.TimerTask;

public class PostureChecker {

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Posture Check!");
            }
        }, 0, 30 * 60 * 1000); // 30 minutes in milliseconds
    }
}
