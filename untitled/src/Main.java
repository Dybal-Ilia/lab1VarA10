
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Human iluha = new Human("Илюха", "мужик", 18);
        Human Andrew = new Human(iluha);
        Andrew.getHumanInfo();
        Andrew.walk();
    }
}