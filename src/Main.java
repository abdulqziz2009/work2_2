// Создаем интерфейс HavingSuperAbility
interface HavingSuperAbility {
    void applySuperAbility();
}

// Создаем абстрактный класс Hero с полями и реализацией интерфейса
abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String superAbilityType;

    public Hero(int health, int damage, String superAbilityType) {
        this.health = health;
        this.damage = damage;
        this.superAbilityType = superAbilityType;
    }

    @Override
    public void applySuperAbility() {
        System.out.println(getClass().getSimpleName() + " применил суперспособность " + superAbilityType);
    }
}

// Создаем классы героев Magic, Medic, Warrior и реализуем метод applySuperAbility()
class Magic extends Hero {
    public Magic() {
        super(100, 30, "MAGIC SPELL");
    }
}

class Medic extends Hero {
    public Medic() {
        super(80, 20, "HEALING");
    }
}

class Warrior extends Hero {
    public Warrior() {
        super(120, 40, "CRITICAL DAMAGE");
    }
}

public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {new Magic(), new Medic(), new Warrior()};

        for (Hero hero : heroes) {
            hero.applySuperAbility();
        }
    }
}
