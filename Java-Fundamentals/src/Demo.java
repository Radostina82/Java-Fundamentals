import javax.swing.plaf.IconUIResource;
import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            String [] command = input.split("\\s+");



            if (command[0].equals("Collect")){
               String item =  command[2];
                if (!list.contains(item)){
                    list.add(item);
                }
            }else if (command[0].equals("Drop")){
                String item =  command[2];
                if (list.contains(item)){
                    list.remove(item);
                }
            }else if (command[0].equals("Combine")){
                String item = command[3].split(":")[0];
                String item1 = command[3].split(":")[1];
               if (list.contains(item)){
                   list.add(list.indexOf(item)+1, item1);
               }

            }else if (command[0].equals("Renew")){
                String item =  command[2];
                if (list.contains(item)){
                    list.remove(item);
                    list.add(item);
                }
            }

            input = scanner.nextLine();
        }
        for (int i = 0; i <= list.size()-1 ; i++) {
            if (i== list.size()-1){
                System.out.print(list.get(i));
                break;
            }else {
                System.out.print(list.get(i) + "," + " ");
            }
        }
    }
}


