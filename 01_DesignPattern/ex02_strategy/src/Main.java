public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        GameCharacter character = new GameCharacter();
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

    }
}

