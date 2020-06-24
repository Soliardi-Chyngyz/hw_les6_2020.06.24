public class GameEntity {
    protected String name;
    protected int life;
    protected int damage;
    protected String superPower;

    public GameEntity(String name, int life, int damage, String superPower) {
        this.name = name;
        this.life = life;
        this.damage = damage;
        this.superPower = superPower;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperPower() {
        return superPower;
    }
    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }
    public String gameEntiteInfo(){
        return name + " Life is: " + life + " Damage is: " + damage + " SuperPower is: " + superPower;
    }
}
