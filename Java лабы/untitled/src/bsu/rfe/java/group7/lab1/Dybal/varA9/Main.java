package bsu.rfe.java.group7.lab1.Dybal.varA9;


import java.util.Scanner;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        /*String foodElement = "";
        String foodElementParameter ="";*/
        int itemsSoFar = 0;
            for(String arg : args ) {
                String[] parts = arg.split("/");
                if (parts[0].equals("Cheese")) {
                    breakfast[itemsSoFar] = new Cheese();
                } else if (parts[0].equals("Apple")) {
                    breakfast[itemsSoFar] = new Apple(parts[1]);
                } else if (parts[0].equals("Lemonade")) {
                    breakfast[itemsSoFar] = new Lemonade(parts[1]);
                }
                itemsSoFar++;
            }
        /*for (int i = 0; i < 3; i++) {
        System.out.print("Введите количество продуктов в завтраке -> ");
        int foodNumber = new Scanner(System.in).nextInt();
        for(int i = 0; i < foodNumber; i++){
            System.out.println("Выберите продукт который хотите добавить в завтрак :\n" +
                    "1.Сыр\n" +
                    "2.Яблоко\n" +
                    "3.Лемонад");
            int product = new Scanner(System.in).nextInt();
            switch(product){
                case 1:
                    breakfast[i] = new Cheese();
                    System.out.println("Сыр был добавлен в ваш завтрак");
                    break;
                case 2:
                    System.out.println("Выберите размер яблока которое вы хотите добавить в завтрак :\n" +
                            "1.Большое\n" +
                            "2.Маленькое");
                    int appleSize = new Scanner(System.in).nextInt();
                    switch(appleSize){
                        case 1:
                            breakfast[i] = new Apple("Большое");
                            System.out.println("Большое яблоко было добавлено в ваш завтрак");
                            break;
                        case 2:
                            breakfast[i] = new Apple("Маленькое");
                            System.out.println("Маленькое яблоко было добавлено в ваш завтрак");
                            break;
                        default:
                            System.out.println("Извините такого варианта не существует");break;
                    }
                    break;
                case 3:
                    System.out.println("Выберите вкус лимонада который хотите добавить в ваш завтрак :\n" +
                            "1.Апельсин\n" +
                            "2.Лимон\n" +
                            "3.Клубника");
                    int lemonadeTaste = new Scanner(System.in).nextInt();
                    switch(lemonadeTaste){
                        case 1:
                            breakfast[i] = new Lemonade("Апельсин");
                            System.out.println("Апельсиновый лимонад был добавлен в ваш завтрак");
                            break;
                        case 2:
                            breakfast[i] = new Lemonade("Лимон");
                            System.out.println("Лимоновый лимонад был добавлен в ваш завтрак");
                            break;
                        case 3:
                            breakfast[i] = new Lemonade("Клубника");
                            System.out.println("Клубничный лимонад был добавлен в ваш завтрак");
                            break;
                        default:
                            System.out.println("Извините такого варианта не существует");
                            break;
                    }
                    break;
                default:
                    System.out.println("Извините такого варианта не существует");

            }
            }
        }*/
        countFood(breakfast, breakfast[0]);
        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
            } else {
                break;
            }
        }
        System.out.println("Всего хорошего!");
    }

    public static void countFood(Food[] foods, Food food) {
        int count = 0;
        for (Food f : foods) {
            if (f != null && f.equals(food)) {
                count++;
            }
        }
        System.out.println("There are " + count + " products of type " + food.getClass().getSimpleName() + " in the breakfast");
    }
}