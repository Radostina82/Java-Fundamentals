package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class DataTypeFinder_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•   Integer
        //•   Floating point -> съдържа символа .
        //•   Characters -> дължина 1 и код < 48 || код > 57
        //•   Boolean -> true или false
        //•   Strings -> ако имаме последователност само от символи (код < 45 || код > 57)
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String type = "";
            //проверка за типовете
            //boolean
            //equalsIgnoreCase - сравнява дали текста е същия, но игнорира малките и големи букви, т.е.
            //дали true е написано с малки букви или големи то ще го сравни
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                type = "boolean";
            }
            //character proverka
            else if (input.length() == 1) {
                //ако дължината е едно има два варианта
                //или има въведен символ
                //или едноцифрено цяло число
                char symbol = input.charAt(0);
                if (symbol < 48 || symbol > 57) {
                    type = "character";
                } else {
                    type = "integer";
                }
            } else {
                //string, floating point, integer
                boolean isString = false;
                boolean isFloat = false;
                for (int i = 0; i < input.length(); i++) {
                    char currentSymbol = input.charAt(i);//вземаме всеки един символ от стринга и проверяваме какво е
                    //проверка дали е символ char
                    if (currentSymbol < 45 || currentSymbol > 57) {
                        isString = true;
                    }
                    if (currentSymbol == 46) {//46 код от аскет таблицата е .
                        isFloat = true;
                    }
                }
                if (isString) {
                    type = "string";
                } else {
                    //число дробно или цяло
                    if (isFloat) {
                        type = "floating point";
                    } else {
                        type = "integer";
                    }
                }
            }
            System.out.printf("%s is %s type%n", input, type);
            input = scanner.nextLine();
        }
    }
}
