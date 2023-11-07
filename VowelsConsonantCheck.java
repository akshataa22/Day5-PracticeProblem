package Day5;

import java.util.Scanner;

public class VowelsConsonantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char user = sc.next().charAt(0);

    if(user >='a' && user <= 'z') {
        if (user == 'a' || user == 'e' || user == 'i' || user == 'o' || user == 'u') {
            System.out.println("User input is a vowel.");
        } else {
            System.out.println("User input is a consonant.");
        }
    }else {
        System.out.println("enter an alphabet.");
    }
    }
}
