import java.util.concurrent.TimeUnit;

public class Phone  {

    public void launchAnApp(AppLauncher launcher) throws InterruptedException{
        String result = launcher.launchApp(); //Calling launchApp method with launcher object of type AppLauncher.
        System.out.println("Launching Settings App ...");
        TimeUnit.SECONDS.sleep(2); //Simulating time taken to open an App
        System.out.println(result); //Printing our that App is Launched!
    }

}
