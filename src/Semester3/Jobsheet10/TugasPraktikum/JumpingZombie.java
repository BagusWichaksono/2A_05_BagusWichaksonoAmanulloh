package Semester3.Jobsheet10.TugasPraktikum;

public class JumpingZombie extends Zombie {

   public JumpingZombie(int health, int level) {
        super(health, level);
    }

   @Override
    public void heal() {
       switch (this.level) {
           case 1:
                this.health += (this.health * 0.3); 
                break;
           case 2:
                this.health += (this.health * 0.4); 
                break;
           case 3:
                this.health += (this.health * 0.5); 
                break;
        }
    }

   @Override
    public void destroyed() {
       this.health = (int) Math.ceil(this.health * 0.90);
    }

   @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data =\n" + super.getZombieInfo();
    }
    
}
