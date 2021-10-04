//This Main Class has switch case statement to select the questions user wants to run.
//User can select and run the respective programs by entering 1,2,3.

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException, InterruptedException {
        Scanner choice = new Scanner(System.in);
        System.out.println("");
        System.out.println("1. Character Type Checker | 2. Links Calculator | 3. Interface Implementation of Phone.");
        System.out.println("Enter a number to run respective program: ");
        int inChoice = choice.nextInt();
        switch(inChoice){
            case 1: CharacterChecker.checkCharacter();
            break;
            case 2: LinksCalculator.printTotalLinks();
            break;
            case 3: 
            System.out.println("Enter App name to open one: ");
            Scanner sc = new Scanner(System.in); //Making Scanner object
            String appName;
            appName = sc.next(); //Taking Standard input of next string and saving it in appName String type variable. 
            var userApp = new NovoLauncher(appName); //making Novo Launcher object userApp and passing appName. 
            var myPhone = new Phone(); //Making Phone object myPhone
            myPhone.launchAnApp(userApp);  //Launching the app using launchAnApp method.
            break;
            default:System.out.println("Serial number not found!"); //this runs if user enters any value other than our cases.
            System.out.println("Run again and please enter the correct choice.");
            choice.close(); //closing the scanner.
        }
    }
}
