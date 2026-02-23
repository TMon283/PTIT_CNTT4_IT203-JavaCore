package session11.miniProject;

public class Main {
    public static void main(String[] args) {
        GameCharacter[] characters = new GameCharacter[3];

        Warrior warrior = new Warrior("Yasuo", 120, 20, 5);
        Mage mage = new Mage("Veigar", 80, 30, 60);

        GameCharacter goblin = new GameCharacter("Goblin", 50, 0) {
            @Override
            public void attack(GameCharacter target) {
                System.out.println("Goblin cắn trộm " + target.getName() + " và gây 10 sát thương");
                target.takeDamage(10);
            }
        };

        characters[0] = warrior;
        characters[1] = mage;
        characters[2] = goblin;

        System.out.println("=== BẮT ĐẦU MÔ PHỎNG TRẬN ĐẤU ===");

        System.out.println("\n--- Vòng 1 ---");
        if (characters[0] != null && characters[1] != null) {
            characters[0].attack(characters[1]); // Warrior -> Mage
        }
        if (characters[1] != null && characters[2] != null) {
            characters[1].attack(characters[2]); // Mage -> Goblin
        }
        if (characters[2] != null && characters[0] != null) {
            characters[2].attack(characters[0]); // Goblin -> Warrior
        }

        System.out.println("\n--- Vòng 2: Chiêu cuối ---");
        if (characters[0] instanceof ISkill && characters[1] != null) {
            ((ISkill) characters[0]).useUltimate(characters[1]);
        }
        if (characters[1] instanceof ISkill && characters[2] != null) {
            ((ISkill) characters[1]).useUltimate(characters[2]);
        }

        System.out.println("\n=== KẾT THÚC TRẬN ĐẤU ===");
        System.out.println("Tổng số nhân vật đã tạo: " + GameCharacter.count);

        for (int i = 0; i < characters.length; i++) {
            GameCharacter ch = characters[i];
            if (ch == null) {
                continue;
            }

            System.out.println("\nNhân vật thứ " + (i + 1) + ": " + ch.getName());
            System.out.println("- HP: " + ch.getHp());

            if (ch instanceof Warrior) {
                Warrior w = (Warrior) ch;
                System.out.println("- Armor: " + w.getArmor());
            }

            if (ch instanceof Mage) {
                Mage m = (Mage) ch;
                System.out.println("- Mana: " + m.getMana());
            }
        }
    }
}

