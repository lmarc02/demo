public class Human implements Character {

    int health = 100;
    int ammo = 200;
    boolean isDead = false;


    public Human(){
        this.health = health;
        this.ammo = ammo;
        isDead();

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isDead() {

        if (health <= 0)
            return true;
        else
            return false;
    }
    public void shotAlien(Alien alien){

            if (alien.getHealth() <= 200 && alien.getHealth() > 0 && ammo > 15) {
                alien.setHealth(alien.getHealth() - 15);
                ammo = ammo - 15;
            }

        }



    public void print(){
        System.out.println("human health: " + health + " ammo: " + ammo + " is dead: " + isDead());
    }

}
