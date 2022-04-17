import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheGame6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String output = scanner.nextLine();
        String output1 = scanner.nextLine();

        List<Character> characterList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i <= output.length() - 1; i++) {
            char element = output.charAt(i);
            if (Character.isUpperCase(element)) {
                for (int j = output.length() - 1; j >= i; j--) {
                    char el = output.charAt(j);
                    characterList.add(0, el);
                    count++;
                }
                break;
            }
            characterList.add(element);
        }
        StringBuilder list = new StringBuilder();
        for (Character character : characterList) {
            list.append(character);
        }
        String newName = list.toString();
        if (output1.equals(newName)) {
            System.out.printf("The minimum operations required to convert \"%s\" to \"%s\" are %d", output, output1, count);
        }else {
            System.out.println("The name cannot be transformed!");
        }
    }
}
