import java.util.Scanner;

public class CharacterChecker {
    
    public static void checkCharacter() {
        System.out.println("Enter a character: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        sc.close();
        if(ch >= 65 && ch <= 90 ){
        System.out.println( ch + " is an Upper Case character.");
        }else if(ch >= 97 && ch <= 122){
        System.out.println( ch + " is a Lower Case character.");
        }else if(ch >= 48 && ch <= 57){
        System.out.println( ch + " is an Integer.");
        }else if(ch >= 33 && ch <= 47){
        System.out.println(ch + " is an Special Character.");
        }else{
            System.out.println("This is beyond my brain, or may be an Special Character.");
        }
    }
}