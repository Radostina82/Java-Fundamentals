package ASSOCIATIVEARRAYSExercises;

import java.util.*;

public class CompanyUsers_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> companiesList = new LinkedHashMap<>();

        while (!input.equals("End")){
            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];

            if (!companiesList.containsKey(companyName)){
                companiesList.put(companyName, new ArrayList<>());
                companiesList.get(companyName).add(employeeId);
            }else{
                if (!companiesList.get(companyName).contains(employeeId)){
                    companiesList.get(companyName).add(employeeId);
                }
            }

            input = scanner.nextLine();
        }

        companiesList.entrySet().stream().sorted((e1,e2) -> e1.getKey().compareTo(e2.getKey())).
                forEach(e ->{ System.out.println(e.getKey());
                e.getValue().stream().forEach(n-> System.out.println("-- " + n));});
    }
}
