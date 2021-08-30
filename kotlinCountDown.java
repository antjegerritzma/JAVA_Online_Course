import static java.util.concurrent.TimeUnit.SECONDS;
//import static java.util.*;
import java.util.concurrent.*;

public class kotlinCountDown {
    public static void main(String[] args) {
        new kotlinCountDown();{

                final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

                final Runnable runnable = new Runnable() {
                    int countdownStarter = 20;

                    public void run() {

                        System.out.println(countdownStarter);
                        countdownStarter--;

                        if (countdownStarter < 0) {
                            System.out.println("Timer Over!");
                            scheduler.shutdown();
                        }
                    }
                };
                scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
            }
    }
}

