import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> goods = new ArrayList<>();

        while(true){
            System.out.println("Выберите операцию:\n" +
                    "1. Добавить\n" +
                    "2. Показать\n" +
                    "3. Удалить\n" +
                    "4. Найти");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            int operation = Integer.parseInt(input);
            switch (operation){
                case 1:
                    System.out.println("Какую покупку хотите добавить?");
                    input = scanner.nextLine();
                    goods.add(input);
                    System.out.println("Итого в списке покупок: " + goods.size());
                    break;
                case 2:
                    System.out.println("Список покупок:");
                    for (int i = 0; i < goods.size(); i++){
                        System.out.println((i+1) + " " + goods.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Какую хотите удалить? Введите номер или название");
                    input = scanner.nextLine();
                    int itemNum;
                    try {
                        itemNum = Integer.parseInt(input);
                        goods.remove(itemNum - 1);
                    }
                    catch (NumberFormatException e){
                        goods.remove(input);
                    }
                    break;
                case 4:
                    System.out.println("Введите текст для поиска:");
                    input = scanner.nextLine();
                    String itemToLower = input.toLowerCase();
                    System.out.println("Найдено:");
                    for (int i = 0; i < goods.size(); i++){
                        if (goods.get(i).toLowerCase().contains(itemToLower)){
                            System.out.println((i +1) + " " + goods.get(i));
                        }
                    }
                    break;
                default:
                    System.out.println("Неверная операция");
                    continue;
            }

        }
    }
}
