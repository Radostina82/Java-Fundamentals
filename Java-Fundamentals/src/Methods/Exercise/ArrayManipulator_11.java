package Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String command = input.split("\\s+")[0];

            if (command.equals("exchange")) {
                int index = Integer.parseInt(input.split("\\s+")[1]);
                if (index < 0 || index > numbers.length - 1) {
                    System.out.println("Invalid index");
                } else {
                    for (int i = 0; i <= index; i++) {
                        int element = numbers[0];
                        for (int j = 0; j < numbers.length - 1; j++) {
                            numbers[j] = numbers[j + 1];
                        }
                        numbers[numbers.length - 1] = element;
                    }
                }


            } else if (command.equals("max")) {
                String token = input.split("\\s+")[1];//четно

                if (token.equals("even")) {
                    int maxEvenIndex = -1;
                    int maxEvenNumber = Integer.MIN_VALUE;

                    for (int i = 0; i <= numbers.length - 1; i++) {
                        int element = numbers[i];

                        if (element % 2 == 0) {
                            if (element > maxEvenNumber) {

                                maxEvenNumber = element;
                                maxEvenIndex = i;
                            }
                        }
                    }
                    if (maxEvenIndex != -1) {
                        System.out.println(maxEvenIndex);
                    } else {
                        System.out.println("No matches");
                    }
                } else if (token.equals("odd")) {
                    int maxOddIndex = -1;
                    int maxOddNumber = Integer.MIN_VALUE;

                    for (int i = 0; i <= numbers.length - 1; i++) {
                        int element = numbers[i];

                        if (element % 2 != 0) {

                            if (element > maxOddNumber) {
                                maxOddNumber = element;
                                maxOddIndex = i;
                            }
                        }

                    }
                    if (maxOddIndex != -1) {
                        System.out.println(maxOddIndex);
                    } else {
                        System.out.println("No matches");
                    }
                }
            } else if (command.equals("min")) {
                String token = input.split("\\s+")[1];//четно

                if (token.equals("even")) {
                    int minEvenIndex = -1;
                    int minEvenNumber = Integer.MAX_VALUE;

                    for (int i = 0; i <= numbers.length - 1; i++) {
                        int element = numbers[i];

                        if (element % 2 == 0) {
                            if (element < minEvenNumber) {

                                minEvenNumber = element;
                                minEvenIndex = i;
                            }
                        }
                    }
                    if (minEvenIndex != -1) {
                        System.out.println(minEvenIndex);
                    } else {
                        System.out.println("No matches");
                    }
                } else if (token.equals("odd")) {
                    int minOddIndex = -1;
                    int minOddNumber = Integer.MAX_VALUE;

                    for (int i = 0; i <= numbers.length - 1; i++) {
                        int element = numbers[i];

                        if (element % 2 != 0) {

                            if (element < minOddNumber) {
                                minOddNumber = element;
                                minOddIndex = i;
                            }
                        }
                    }
                    if (minOddIndex != -1) {
                        System.out.println(minOddIndex);
                    } else {
                        System.out.println("No matches");
                    }
                }
            } else if (command.equals("first")) {
                int count = Integer.parseInt(input.split("\\s+")[1]);
                String token = input.split("\\s+")[2];//четно

                if (count > numbers.length) {
                    System.out.println("Invalid count");
                } else {
                    if (token.equals("even")) {
                        String firstEven = "";
                        int counter = 0;
                        for (int i = 0; i <= numbers.length - 1; i++) {
                            int element = numbers[i];
                            if (element % 2 == 0) {
                                if (counter < count) {
                                    counter++;
                                   firstEven += element + " ";
                                }
                            }
                        }
                        if (counter == 0) {
                            System.out.println("[]");
                        } else  {
                            int []evenNumber = Arrays.stream(firstEven.split("\\s+")).mapToInt(e->Integer.parseInt(e)).toArray();

                            System.out.print("[");
                            for (int i = 0; i <= evenNumber.length-1; i++) {
                                int element = evenNumber[i];

                                if (i == evenNumber.length - 1) {
                                    System.out.print(element);

                                } else {

                                    System.out.print(element + "," + " ");
                                }
                            }
                            System.out.println("]");

                        }

                    } else if (token.equals("odd")) {

                        String firstOdd = "";
                        int counter = 0;
                        for (int i = 0; i <= numbers.length - 1; i++) {
                            int element = numbers[i];
                            if (element % 2 != 0) {
                                if (counter < count) {
                                    counter++;
                                    firstOdd += element + " ";
                                }
                            }
                        }
                        if (counter == 0) {
                            System.out.println("[]");
                        } else {
                            int []oddNumber = Arrays.stream(firstOdd.split("\\s+")).mapToInt(e-> Integer.parseInt(e)).toArray();

                            System.out.print("[");
                            for (int i = 0; i <= oddNumber.length-1; i++) {
                                int element = oddNumber[i];

                                if (i == oddNumber.length - 1) {
                                    System.out.print(element);
                                } else {
                                    System.out.print(element + "," + " ");
                                }
                            }
                            System.out.println("]");
                        }
                    }
                }
            } else if (command.equals("last")) {
                int count = Integer.parseInt(input.split("\\s+")[1]);
                String token = input.split("\\s+")[2];//четно


                if (count > numbers.length) {
                    System.out.println("Invalid count");
                } else {
                    if (token.equals("even")) {
                        String lastEven = "";
                        int counter = 0;
                        for (int i = numbers.length - 1; i >= 0; i--) {
                            int element = numbers[i];
                            if (element % 2 == 0) {
                                if (counter < count) {
                                    counter++;
                                    lastEven += element + " ";
                                }
                            }
                        }
                        if (counter == 0) {
                            System.out.println("[]");
                        } else  {
                            int []evenNumber = Arrays.stream(lastEven.split("\\s+")).mapToInt(e-> Integer.parseInt(e)).toArray();
                            System.out.print("[");
                            for (int i = 0; i <= evenNumber.length-1; i++) {
                                int element = evenNumber[i];

                                if (i == evenNumber.length - 1) {
                                    System.out.print(element);
                                    System.out.print("]");

                                } else {
                                    System.out.print(element + "," + " ");
                                }
                            }
                            System.out.print("]");
                        }
                    } else if (token.equals("odd")) {
                        String lastOdd = "";
                        int counter = 0;
                        for (int i = numbers.length - 1; i >= 0; i--) {
                            int element = numbers[i];
                            if (element % 2 != 0) {
                                if (counter <= count) {
                                    counter++;
                                    lastOdd += element + " ";
                                }
                            }
                        }
                        if (counter == 0) {
                            System.out.println("[]");
                        } else {
                            int[] oddNumber = Arrays.stream(lastOdd.split("\\s+")).mapToInt(e-> Integer.parseInt(e)).toArray();
                            System.out.print("[");
                            for (int i = 0; i <= oddNumber.length-1; i++) {
                                int element = oddNumber[i];

                                if (i == oddNumber.length - 1) {
                                    System.out.print(element);

                                } else {
                                    System.out.print(element + "," + " ");
                                }
                            }
                            System.out.println("]");
                        }
                    }
                }
            }

            input = scanner.nextLine();
        }
        System.out.print("[");
        for (int i = 0; i <= numbers.length - 1; i++) {
            int element = numbers[i];
            if (i == numbers.length - 1) {
                System.out.print(element);
                System.out.print("]");
                break;
            } else {
                System.out.print(element + "," + " ");
            }
        }
    }
}
