package OBJECTSANDCLASSESExercise.Articles2_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Articles2> articles = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String title = input.split(", ")[0];
            String content = input.split(", ")[1];
            String author = input.split(", ")[2];

            Articles2 article = new Articles2(title, content, author);
           /* article.setTitle(title);
            article.setContent(content);
            article.setAuthor(author);*/
            articles.add(article);
        }

        String command = scanner.nextLine();
        if (command.equals("title")) {
            articles.sort(Comparator.comparing(Articles2::getTitle));


        } else if (command.equals("content")) {
            articles.sort(Comparator.comparing(Articles2::getContent));

        } else if (command.equals("author")) {
            articles.sort(Comparator.comparing(Articles2::getAuthor));

        }
        for (Articles2 article : articles) {
            System.out.println(article);
        }

    }
}
