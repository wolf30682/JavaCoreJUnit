public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] { new Gun(), new Automat(), new Bazzoka(), new Slingshot(), new WaterGun()

        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public String shotWithWeapon(int slot) {
        Weapon weapon = new Weapon();
        // Проверка на выход за границы,
        if (slot < 0 || slot > getSlotsCount() - 1) {
            System.out.println("Увы, оружие отсутствует в списке, выберете другое");

        } else {
            // Если всё в порядке, то получаем оружие из выбранного слота
            weapon = weaponSlots[slot];
            // Огонь!
            weapon.shot();
        }

        return weapon.shot();

    }
}
