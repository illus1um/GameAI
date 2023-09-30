public class Main {
    public static void main(String[] args) {

        GameNPC npc = new GameNPC("Geralt", 100);
        GameNPC npc1 = new GameNPC("Lutik", 50);

        npc.setBehavior(new AgressiveBehavior());
        npc.performAction();
        System.out.println(npc.getName() + " " + npc.getHealth() + "hp");

        npc1.setBehavior(new DefensiveBehavior());
        npc1.performAction();
        System.out.println(npc1.getName() + " " + npc1.getHealth() + "hp");
    }
}