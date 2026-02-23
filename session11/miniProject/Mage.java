package session11.miniProject;

public class Mage extends GameCharacter implements ISkill {
    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public void attack(GameCharacter target) {
        int damage;
        if (mana >= 5) {
            damage = attackPower;
            mana -= 5;
            System.out.println(name + " dùng phép tấn công " + target.getName() + " với sát thương " + damage + " (trừ 5 mana, còn " + mana + ")");
        } else {
            damage = attackPower / 2;
            System.out.println(name + " thiếu mana, chỉ gây " + damage + " sát thương vật lý lên " + target.getName());
        }
        target.takeDamage(damage);
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println(name + " sử dụng R: Vụ nổ vũ trụ");
        if (mana >= 50) {
            mana -= 50;
            int damage = attackPower * 3;
            System.out.println("Vụ nổ vũ trụ được tung ra, gây " + damage + " sát thương lên " + target.getName() + " (mana còn " + mana + ")");
            target.takeDamage(damage);
        } else {
            System.out.println("Không đủ mana để dùng Vụ nổ vũ trụ (cần >= 50, hiện có " + mana + ")");
        }
    }
}

