public class GameCharacter {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if(null == weapon) {
            System.out.println("맨손 공격");
        } else {
            weapon.attack();
        }
    }
}
