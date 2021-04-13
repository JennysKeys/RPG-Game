class Character{
    int attack;
    int level;
    int experience;
    int hp;
    int maxHp;
    int maxMagic;
    int magic;
    int fira;
    int barrier;
    int heal;
    int chain;
    int purify;
    int fcost;
    int bcost;
    int hcost;
    int pcost;
    boolean priest = false;

    public Character() {
        
    }
    public void setLevel (int level){
      this.level = level;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setHealth(int health) {
        if(health > maxHp) {
            this.hp = maxHp;
        } else if(health < 0) {
            this.hp = 0;
        } else {
            this.hp = health;
        }
    }
    public void setMaxHp(int hp) {
        this.maxHp = hp;
        this.hp = hp;
    }
    public void setMagic(int magic) {
        this.magic = magic;
    }
    public void setMaxMagic(int magic) {
        this.maxMagic = magic;
        this.magic = magic;
    }
    public void addXp(int experience) {
        this.experience += experience;
        while(this.experience >= 100) {
            this.level++;
            setMaxHp(maxHp + 10);
            setMaxMagic(maxMagic + 10);
            setFira(fira + 5, fcost + 1);
            setHeal(heal + 10, hcost + 1);
            this.experience -= 100;
            System.out.println("You leveled up to level " + level + "!");
        }
    }
    public void setFira(int fira, int fcost) {
        this.fira = fira;
        this.fcost = fcost;
    }
    public void setBarrier(int barrier, int bcost) {
        this.barrier = barrier;
        this.bcost = bcost;
    }
    public void setHeal(int heal, int hcost) {
        this.heal = heal;
        this.hcost = hcost;
    }
    public void setPurify(int purify, int pcost) {
        this.purify = purify;
        this.pcost = pcost;
    }
    public void setChain(int chains){
      this.chain = chains;
    }
    public void setPriest(boolean isPriest) {
        priest = isPriest;
    }
    public int getAttack() {
        return attack;
    }
    public int getLevel() {
        return level;
    }
    public int getExperience() {
        return experience;
    }
    public int getHp() {
        return hp;
    }
    public int getMagic() {
        return magic;
    }
    public int getFira() {
        return fira;
    }
    public int getBarrier() {
        return barrier;
    }
    public int getHeal() {
        return heal;
    }
    public int getChain() {
        return chain;
    }
    public int getFCost() {
      return fcost;
    }
    public int getBCost(){
      return bcost;
    }
    public int getHCost(){
      return hcost;
    }
    public int getPCost() {
        return pcost;
    }
    public boolean isPriest() {
        return priest;
    }
    
}