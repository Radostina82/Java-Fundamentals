package RegularExpressionsMoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicket_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        String regex = "([@$#^]{6,})";
        Pattern pattern = Pattern.compile(regex);
        for (String ticket : input) {
            ticket = ticket.replaceAll(" ", "");

            if (ticket.length()==20){
                Matcher matcher = pattern.matcher(ticket);
                int count = 0;
                String mach = "";
                while (matcher.find()) {
                    mach = matcher.group();
                    count++;
                }
                if (count==1){
                    int length = mach.length();
                    String symbol = mach.substring(0,1);
                    if (length==20){
                        length=10;
                        System.out.println("ticket " + "\"" + ticket + "\"" + " - " + length + symbol + " Jackpot!");
                    }else{
                        System.out.println("ticket " + "\"" + ticket + "\"" + " - no match");
                    }
                }else if (count == 2) {
                    int length = mach.length();
                    String symbol = mach.substring(0,1);
                    if (length >= 6 && length <= 9) {
                        System.out.println("ticket " + "\"" + ticket + "\"" + " - " + length + symbol );
                    } else if (length == 10) {
                        System.out.println("ticket " + "\"" + ticket + "\"" + " - " + length + symbol + " Jackpot!");
                    }
                } else {
                    System.out.println("ticket " + "\"" + ticket + "\"" + " - no match");
                }

            }else{
                System.out.println("invalid ticket");
            }
        }
    }}

