
public class Main {
    private static Boss boss;

    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        new Hero(500, "Shild", 200, "Fly");
        new Hero(500, 100);
        new Boss();
        int BossHealth = 1000;
        int BossDamage = 400;
        String typeDefence = "Shild";
        String superPower = "superjump";
        System.out.println("" + BossHealth + " " + BossDamage + " " + typeDefence + superPower);
    }
}
