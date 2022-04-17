package OBJECTSANDCLASSESExercise.Articles_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); //Title,Content,Author -> ["Title","Content","Author"]
        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author = input.split(", ")[2];

        Articles article = new Articles(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            String command = scanner.nextLine();
            String typeCommand = command.split(": ")[0];
            String newData = command.split(": ")[1];

            if (typeCommand.equals("Edit")){
                article.edit(newData);
            }else if (typeCommand.equals("ChangeAuthor")){
                article.changeAuthor(newData);
            }else if (typeCommand.equals("Rename")){
                article.rename(newData);
            }
        }
        System.out.println(article);
    }
}
