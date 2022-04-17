package FinalExamExercise.Exam15_08_2020;

import java.util.Scanner;

public class TheImitationGame_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Decode")){
            //ChangeAll|z|l
            //Insert|2|o
            //Move|3
            String command = input.split("\\|")[0];

            if (command.equals("ChangeAll")){
            String substring = input.split("\\|")[1];
            String replacement = input.split("\\|")[2];
            encryptedMessage = encryptedMessage.replace(substring.charAt(0), replacement.charAt(0));

            }else if (command.equals("Insert")){
                int index = Integer.parseInt(input.split("\\|")[1]);
                String value = input.split("\\|")[2];
                String firstPart = encryptedMessage.substring(0,index);
                String secondPart = encryptedMessage.substring(index,encryptedMessage.length());
                StringBuilder newMessage = new StringBuilder();
                newMessage.append(firstPart);
                newMessage.append(value);
                newMessage.append(secondPart);
                encryptedMessage = newMessage.toString();

            }else if (command.equals("Move")){
                int numberOfLetters = Integer.parseInt(input.split("\\|")[1]);
                String firstPart = encryptedMessage.substring(0,numberOfLetters);
                String secondPart = encryptedMessage.substring(numberOfLetters,encryptedMessage.length());
                StringBuilder newMessage = new StringBuilder();
                newMessage.append(secondPart);
                newMessage.append(firstPart);
                encryptedMessage = newMessage.toString();
            }
            input = scanner.nextLine();
        }StringBuilder newS = new StringBuilder();
        newS.append(encryptedMessage.charAt(0));
        for (int i = 1; i <=encryptedMessage.length()-1 ; i++) {
            char symbol = encryptedMessage.charAt(i);
            if (Character.isUpperCase(symbol)){
                symbol = Character.toLowerCase(symbol);
            }
            newS.append(symbol);
        }
        System.out.println("The decrypted message is: " + newS);
    }
}
