package session11.miniProject;

public abstract class GameCharacter {
    public String name;
    public int hp;
    public int attackPower;

    public static int count = 0;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public abstract void attack(GameCharacter target);

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            hp = 0;
            System.out.println(name + " đã bị hạ gục");
        } else {
            System.out.println(name + " còn " + hp + " HP");
        }
    }
}

