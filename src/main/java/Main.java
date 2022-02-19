import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием," + " введите номер, чтобы выстрелить," + " -1 чтобы выйти%n",
                player.getSlotsCount());
        int slot;

        // Ввод данных пользователя
        while (true) {
            slot = scanner.nextInt();
            // Проверяем, не захотел ли пользователь закончить игру
            if (slot == -1) {
                break;
            }
            // В противном случае вызываем метод выстрела
            // player.shotWithWeapon(slot);
            System.out.println(player.shotWithWeapon(slot));

        }
        System.out.println("Game over!");
        scanner.close();

    }

}
