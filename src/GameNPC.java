public class GameNPC {
    private EnemyBehavior behavior;
    private String name;
    private int health;

    public GameNPC(String name, int health) {
        this.name = name;
        this.health = health;

    }
    public void setBehavior(EnemyBehavior behavior) {
        this.behavior = behavior;
    }
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void performAction() {
        if (behavior != null) {
            behavior.performAction();
        }
    }
}
