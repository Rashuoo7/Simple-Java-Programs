public class NovoLauncher implements AppLauncher{
    private String appName;
    
    public NovoLauncher(String appName) {
        this.appName = appName; //Saving the appName taken as parameter to the local appName variable by using this keyword.
    }

    @Override
    public String launchApp() {
        return appName + " is Launched!"; //Returning Staring message of Launching the App.
    }
} 