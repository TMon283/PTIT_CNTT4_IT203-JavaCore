package session11.miniProject;

public class Warrior extends GameCharacter implements ISkill {
    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(name + " tấn công " + target.getName() + " với sát thương " + attackPower);
        target.takeDamage(attackPower);
    }

    @Override
    public void takeDamage(int damage) {
        int realDamage = damage - armor;
        if (realDamage < 0) {
            realDamage = 0;
        }
        System.out.println(name + " có giáp " + armor + ", sát thương thực nhận: " + realDamage);
        super.takeDamage(realDamage);
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println(name + " sử dụng R: Trăng trối");
        int damage = attackPower * 2;
        System.out.println("Chiêu cuối gây " + damage + " sát thương lên " + target.getName());
        target.takeDamage(damage);

        int lostHp = (int) (hp * 0.1);
        if (lostHp <= 0 && hp > 0) {
            lostHp = 1;
        }
        hp -= lostHp;
        if (hp < 0) {
            hp = 0;
        }
        System.out.println(name + " chịu tác dụng phụ, mất " + lostHp + " HP, còn lại " + hp + " HP");
        if (hp == 0) {
            System.out.println(name + " đã bị hạ gục bởi tác dụng phụ của chiêu cuối");
        }
    }
}

