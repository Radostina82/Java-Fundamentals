package OBJECTSANDCLASSES.Songs_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Songs> songs = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            String [] input = scanner.nextLine().split("_");
            String type = input[0];
            String name = input[1];
            String time = input[2];

            Songs song = new Songs();

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }
        String typeList = scanner.nextLine();
        
        if (typeList.equals("all")){
            for (Songs song : songs) {
                System.out.println(song.getName());
            }
        }else{
            for (Songs song : songs) {
                if (song.getTypeList().equals(typeList)){
                    System.out.println(song.getName());
                }
            }
        }
    }

}
