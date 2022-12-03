import java.util.ArrayList;
import java.util.List;

public class ElvesSolution {
    public static List<Elf> elves = new ArrayList<>();
    public static void main(String[] args) {

        String l = "";
        String[] strings = Input.INPUT.split("\n");
        int elfNumber = 0;
        int calories = 0;

        for (int i = 0; i < strings.length;i++) {
            if (strings[i].equals(l)) {
                elfNumber++;
                elves.add(new Elf(calories, elfNumber));
                calories = 0;
                continue;
            }
            calories += Integer.parseInt(strings[i]);
        }
        int max = elves.get(0).getCaloriesCarried();

        for (Elf each : elves) {
            if (each.getCaloriesCarried() > max){
                max = each.getCaloriesCarried();
                elfNumber = each.getElfNumber();
            }
        }

        System.out.print("Elf number: " + elfNumber + " carries the most calories: " + max);
    }
}