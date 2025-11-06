package Semester3.Jobsheet10.TugasPraktikum;

public class WalkingZombie extends Zombie {

   public WalkingZombie(int health, int level) {
        super(health, level);
    }

   @Override
    public void heal() {
       switch (this.level) {
           case 1:
                this.health += (this.health * 0.1); 
                break;
           case 2:
                this.health += (this.health * 0.3); 
                break;
           case 3:
                this.health += (this.health * 0.4); 
                break;
        }
    }

   @Override
    public void destroyed() {
       this.health = (int) Math.ceil(this.health * 0.80);
    }

   @Override
    public String getZombieInfo() {
        return "Walking Zombie Data =\n" + super.getZombieInfo();
    }
}
