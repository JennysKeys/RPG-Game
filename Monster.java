import java.lang.Math;

class Monster{
  String name; 
  int hp;
  int attack;
  int monsterLevel;
  int expGain;

  public Monster(int level, int random){
      if (random == 55) {
          this.monsterLevel = 100;
          this.hp = 1000;
          this.name = "Medusa";
          this.attack = 1000;
          this.expGain = 1000000;
      } else if (random == -1) {
        this.monsterLevel = 5;
        this.hp = 120;
        this.attack = 30;
        this.name = "Terra";
        this.expGain = 140;
      }
      else if (random > 70) {
        this.monsterLevel = (int)((random/400.0) + 1) * level;
        this.name = "Basilisk";
        this.hp = 40 + (monsterLevel * 10);
        this.attack = 10 + (level*4);
        this.expGain = 60;
      } else {
          this.monsterLevel = level * (random / 60);
          this.name = "Dungeon Thief";
          this.hp = 40 + (monsterLevel *5);
          this.attack = 6 + (monsterLevel*4);
          this.expGain = 20;
      }
  }
  public void setHp(int hp) {
      this.hp = hp;
  }
  public String getName() {
      return name;
  }

  public int getAttack() {
      return attack;
  }

  public int getHp() {
      return hp;
  }

  public int getExpGain() {
      return expGain;
  }

  public int getMonsterLevel() {
      return monsterLevel;
  }

  public static int rng() {
    return (int)(Math.random()*100);
  }
}