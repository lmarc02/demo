public class Alien implements Character {
    int health = 200;
    int alienEnergy = 100;


    public Alien(){
        this.health = health;
        this.alienEnergy = alienEnergy;
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
    public void biteHuman(Human human) {

            if (human.getHealth() <= 100 && human.getHealth() > 80) {
                human.setHealth(human.getHealth() - 1);
                alienEnergy = alienEnergy - 15;
            }
            if (human.getHealth() <= 60 && human.getHealth() > 60) {
                human.setHealth(human.getHealth() - 2);
                alienEnergy = alienEnergy - 15;
            }
            if (human.getHealth() <= 50 && human.getHealth() > 0) {
                human.setHealth(human.getHealth() - 10);
                alienEnergy = alienEnergy - 15;
            }
        }





    public void print(){
        System.out.println("alien health: " + health + " energy: " + alienEnergy + " is dead: " + isDead());
    }
}
