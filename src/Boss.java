public class Boss extends GameEntity{

    public Boss(String name, int life, int damage, String superPower) {
        super(name, life, damage, superPower);
    }
    Weapon weapons = new Weapon("Шпага", "Экскалибур");

    public String bossInfo(){
        return super.gameEntiteInfo() + " NamePfWeapon: " + weapons.getNamePfWeapon() + " TypeOfWeapon: " + weapons.getTypeOfWeapon();
    }
}
