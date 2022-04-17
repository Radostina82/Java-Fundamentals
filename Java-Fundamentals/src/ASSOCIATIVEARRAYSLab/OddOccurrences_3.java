package ASSOCIATIVEARRAYSLab;

import java.util.*;

public class OddOccurrences_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split("\\s+");
        Map<String, Integer> words = new LinkedHashMap<>();

        for (String s : input) {
            String element = s.toLowerCase();
            if (!words.containsKey(element)){
                words.put(element, 1);
            }else{
                words.put(element, words.get(element)+1);
            }
        }
        List<String> odds = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue()%2!=0){
                odds.add(entry.getKey());
            }
        }
        for (int i = 0; i <= odds.size()-1 ; i++) {
            if (i==odds.size()-1){
                System.out.print(odds.get(i));
                break;
            }
            System.out.print(odds.get(i) + ", ");
        }


    }
}
