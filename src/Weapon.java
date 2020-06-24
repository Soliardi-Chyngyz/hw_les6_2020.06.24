public class Weapon {
    private String typeOfWeapon;
    private String namePfWeapon;

    public Weapon(String typeOfWeapon, String namePfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
        this.namePfWeapon = namePfWeapon;
    }
    public String weaponInfo(){
        return typeOfWeapon + namePfWeapon;
    }
    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }
    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public String getNamePfWeapon() {
        return namePfWeapon;
    }
    public void setNamePfWeapon(String namePfWeapon) {
        this.namePfWeapon = namePfWeapon;
    }
}
