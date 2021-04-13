import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean redo = true;
    int choice = 0;
    String name = "";
    System.out.println("???: Hey...you seem new around here, whats your name?");
    System.out.println();
    System.out.print("Please input your name: ");

    name = scanner.nextLine();
    System.out.println();

    System.out.println("???: " + name + " was it? Well welcome to our town, we usually dont get newcomers...especially after the incident....");
    System.out.println(" [1] what incident? \n [2] who are you? \n [3] how did I get here?");
    
    while(redo) {
        try{
            choice = scanner.nextInt();
            scanner.nextLine();
        } catch(Exception e) {
            System.out.print("Please input a valid choice: ");
            scanner.nextLine();
        }        
        switch(choice) {
            case 1:
                System.out.println(name + ": What incident?");
                scanner.nextLine();
                System.out.println("???: About a year ago, black clouds filled the sky and purple rays of light shot down, creating dungeons filled with Gehelias wherever it landed. I'm Serah, the head director of this town, and I created a team of adventurers who will go in and take on those Gehelia. If not, the Gehelias will come out during the night and feed on our town. Thats why many towns around the world have become ruins...");
                scanner.nextLine();
                redo = false;
                break;
            case 2:
                System.out.println(name + ": Who are you?");
                scanner.nextLine();
                System.out.println("???: Oh! My bad, I completely forgot to introduce myself, how silly of me hehe. My name is Serah and I am the head director of this town. I'm in charge of keeping this town safe and driving the Gehelia away.");
                scanner.nextLine();
                System.out.println(name + ": Gehelia?");
                scanner.nextLine();
                System.out.println("Serah: Yes! You see that building just over the hill? Thats a dungeon where Gehelias come from. About a year ago, black clouds filled the sky and purple rays of light shot down, creating one of those dungeons wherever it landed. I created a team of adventurers who will go in and take on those Gehelia. If not, the Gehelias will come out during the night and feed on our town. Thats why many towns around the world have become ruins...");
                scanner.nextLine();
                redo = false;
                break;
            case 3:
                System.out.println(name + ": How did I get here?");
                scanner.nextLine();
                System.out.println("???: Well, shouldn't you be asking yourself that? Anyways, I just saw someone who didn't look like they were from here and wanted to recruit them onto my adventurer's team.");
                scanner.nextLine();
                System.out.println(name + ": Adventurer's team?");
                scanner.nextLine();
                System.out.println("???: Yea, I'm Serah, the head director of this town, and I go around looking for people like you to join my team of adventurers who will go to dungeons and take on the Gehelia. If not, the Gehelias will come out during the night and feed on our town. Thats why many towns around the world have become ruins...");
                scanner.nextLine();
                redo = false;
                break;
            default:
                System.out.println("Please choose a number between 1-3");
        }
    }
    
    System.out.println("Serah: Enough with the bitter talk, would you like to join my team and protect this town?");              
    scanner.nextLine();
    System.out.println(name + ": I suppose I have nothing better to do.");
    scanner.nextLine();
    System.out.println("Serah: Great! Just go straight down this road and make a right, third building down. My assistant should be there to help you.");
    
    System.out.println("_______________________________________");
    System.out.println();

    System.out.println("Terra: Hello, my name is Terra, the director told me to get you suited to go into the dungeons");
    scanner.nextLine();
    System.out.println("ע૦υ ɱคע ც૯૭ɿՈ ωɿ੮Һ ८Һ૦૦ςɿՈ૭ ค ८Նคςς");
    System.out.println();
    System.out.println("Terra: Would you like to be an [warrior], [mage], or [priest]");
    System.out.println();
    System.out.println("Warriors are formidible heroes, capable of fending of enemies with their high hp and hitting multiple times with their impressive combos");
    scanner.nextLine();
    System.out.println("Mages are highly intelligent heroes, capable of getting rid of multiple enemies with their high splash damage magic spells");
    scanner.nextLine();
    System.out.println("Priests are the save and grace, capable of healing yourself and allies. Priests also have high magic power (mp) and certain purification spells for certain monsters");
    scanner.nextLine();

    Character character = new Character();
    String charClass = "";
    redo = true;

    while(redo) {
        System.out.print("Choose your class: ");
        charClass = scanner.nextLine();
        
        if (charClass.equalsIgnoreCase("warrior")){
            System.out.println();   
            System.out.println("You have chosen the warrior class, the warrior class has increased health points (hp), attack damage, and access to chain attacks");
            character.setAttack(15);
            character.setMaxHp(50);
            character.setMaxMagic(25);
            character.addXp(0);
            character.setFira(8, 10);
            character.setBarrier(20, 10);
            character.setHeal(20, 10);
            character.setLevel(1);
            character.setChain(2);

            redo = false;
        } 
        else if (charClass.equalsIgnoreCase("mage")){
            System.out.println();  
            System.out.println("You have chosen the mage class, the mage class has increased mana points (mp), magic damage, and access to splash damage");
            character.setAttack(8);
            character.setMaxHp(35);
            character.setMaxMagic(80);
            character.addXp(0);
            character.setFira(25, 5);
            character.setBarrier(40, 8);
            character.setHeal(20, 9);
            character.setLevel(1);
            character.setChain(1);

            redo = false;
        }
        else if (charClass.equalsIgnoreCase("priest")){
            System.out.println();  
            System.out.println("You have chosen the priest class, the priest class has access to healing and light magic capable of healing large groups and purifying monsters with a chance");
            character.setAttack(8);
            character.setMaxHp(45);
            character.setMaxMagic(65);
            character.addXp(0);
            character.setFira(20, 5);
            character.setBarrier(30, 7);
            character.setHeal(25, 8);
            character.setLevel(1);
            character.setPurify(100, 6);
            character.setChain(1);
            character.setPriest(true);

            redo = false;
        } else {
            System.out.println("Please try again.");
        }
    }

    System.out.println();
    System.out.println("Terra: Alright let's get started, make sure you keep an eye on your health points, mana points, and items, you don't want to run out of health potions or mana potions, find one of our camps in the dungeons and you'll be able to rest and restock");
    scanner.nextLine();
    System.out.println("???: Ah Ah Ah, move out the way!");
    scanner.nextLine();
    System.out.println("เภ ค Ŧɭครђ, ץ๏ย ๒ɭคςк ๏ยՇ... ץ๏ย ςคภ ђєคг гยรՇɭєร คг๏ยภ๔ ץ๏ย...");
    scanner.nextLine();
    System.out.println(name + ": ugh, where am I? What happened? Terra!?");
    scanner.nextLine();
    System.out.println(name + ": hm, no response, it seems I'll need to find my way out of here");
    scanner.nextLine();
     
     boolean fight = true;
     while(fight) {
        Monster monster1 = new Monster(character.level, Monster.rng());
        System.out.println("You have encountered an: " + monster1.name);
        while (monster1.getHp() > 0 && character.getHp() > 0 ){
            System.out.println(name + "\n HP: " + character.getHp() + "\n MP: " + character.getMagic());
            System.out.println(monster1.getName() + "\n" + "Hp: " + monster1.getHp());
            System.out.println("Your turn: [Attack]     [Magic]     [Flee]");
            String turn = scanner.nextLine();

            if (turn.equalsIgnoreCase("Attack")){
                character.hp = character.getHp() - monster1.getAttack();
                System.out.println("You attack "+ character.getChain() + " times!");
                for (int i=0; i<character.getChain(); i++)
                monster1.setHp(monster1.getHp() - character.getAttack());   
            }
            else if (turn.equalsIgnoreCase("Magic")){
                System.out.println("Fira: " + character.getFCost());
                System.out.println("Barria: " + character.getBCost());
                System.out.println("Heal: " + character.getHCost());
                if (charClass.equalsIgnoreCase("priest")){
                    System.out.println("Purify: " + character.getPCost());
                }
                String spell = scanner.nextLine();
                if (spell.equalsIgnoreCase("fira")){
                    if(character.getMagic() >= character.getFCost()) {
                        monster1.setHp(monster1.getHp() - character.getFira());
                        character.setMagic(character.getMagic() - character.getFCost());
                        character.setHealth(character.getHp() - monster1.getAttack());
                        System.out.println("You hit " + monster1.getName() + " for: " + character.getFira()); //working here copy paste rest, just notes for myself
                        System.out.println("You've been hit for: " + monster1.getAttack());
                    } else {
                        System.out.println("Not enough mana");
                    }
                }
                else if (spell.equalsIgnoreCase("barria")){
                    if(character.getMagic() >= character.getBCost()) {
                        character.setMagic(character.getMagic() - character.getBCost());
                        System.out.println("You blocked all incoming damage");
                    } else {
                        System.out.println("Not enough mana");
                    }
                }
                else if (spell.equalsIgnoreCase("heal")){
                    if(character.getMagic() >= character.getHCost()) {
                        character.setMagic(character.getMagic() - character.getHCost());
                        character.setHealth(character.getHp() + character.getHeal() - monster1.getAttack());
                        System.out.println("You healed for: " + character.getHeal());
                        System.out.println("You've been hit for: " + monster1.getAttack());
                    } else {
                        System.out.println("Not enough mana");
                    }
                }
                else if (spell.equalsIgnoreCase("purify")){
                    if(character.isPriest()) {
                        character.setMagic(character.getMagic() - character.getPCost());
                        character.setHealth(character.getHp() - monster1.getAttack());
                        System.out.println("You've been hit for: " + monster1.getAttack());
                        int randomPurify = (int)(Math.random()*100);
                        if (randomPurify >= 60){
                            monster1.setHp(0);
                            System.out.println("The purification worked");
                        }
                        else{
                            System.out.println("The purification failed");
                        }
                    } else {
                        System.out.println("You're not a Priest!");
                    }
                }
            }
            else if (turn.equalsIgnoreCase("flee")){
                int fled = (int)(Math.random()*100);
                if (fled >= 20){
                    System.out.println("You tried to run but couldn't");
                    character.setHealth(character.getHp() - monster1.getAttack());
                    System.out.println("You've been hit for: " + monster1.getAttack());
                }
                else {
                    monster1.setHp(0);
                    System.out.println("You barely escaped");
                }
            }
            System.out.println(name + "\n HP: " + character.getHp() + "\n MP: " + character.getMagic());            
            System.out.println(); 
        }
        if(character.getHp() > 0) {
            System.out.println("You have gained: "+ monster1.getExpGain() + "exp");
            character.addXp(monster1.getExpGain());
            System.out.println("Cₒₙₜᵢₙᵤₑ ₒₙₜₒ ₜₕₑ ₙₑₓₜ ₛₜₐgₑ? [yₑₛ]    [ₙₒ]");
            String nextStage = scanner.nextLine();

            if(nextStage.equalsIgnoreCase("no")) {
                System.out.println("Thank you for protecting the town!");
                fight = false;

                System.out.println("𝙊𝙣 𝙮𝙤𝙪𝙧 𝙬𝙖𝙮 𝙝𝙤𝙢𝙚, 𝙮𝙤𝙪 𝙝𝙚𝙖𝙧 𝙫𝙤𝙞𝙘𝙚𝙨 𝙘𝙤𝙢𝙞𝙣𝙜 𝙛𝙧𝙤𝙢 𝙩𝙝𝙚 𝙛𝙤𝙧𝙚𝙨𝙩, 𝙤𝙣𝙚 𝙤𝙛 𝙩𝙝𝙚𝙢 𝙨𝙤𝙪𝙣𝙙𝙨 𝙖𝙬𝙛𝙪𝙡𝙡𝙮 𝙛𝙖𝙢𝙞𝙡𝙞𝙖𝙧...");
                scanner.nextLine();
                System.out.println("𝙔𝙤𝙪 𝙝𝙞𝙙𝙚 𝙗𝙚𝙝𝙞𝙣𝙙 𝙖 𝙩𝙧𝙚𝙚 𝙗𝙚𝙛𝙤𝙧𝙚 𝙮𝙤𝙪 𝙨𝙩𝙞𝙘𝙠 𝙮𝙤𝙪𝙧 𝙝𝙚𝙖𝙙 𝙤𝙪𝙩 𝙖𝙣𝙙 𝙚𝙖𝙫𝙚𝙨𝙙𝙧𝙤𝙥 𝙤𝙣 𝙩𝙝𝙚 𝙘𝙤𝙣𝙫𝙚𝙧𝙨𝙖𝙩𝙞𝙤𝙣.");
                scanner.nextLine();
                System.out.println("???: so...did you do it?");
                scanner.nextLine();
                System.out.println("?????: everythings going according to plan sir, they won't suspect a thing hehe");
                scanner.nextLine();
                System.out.println("???: hahaha how could Serah be so dumb, entrusting an assistant like you.");
                scanner.nextLine();
                System.out.println("𝙔𝙤𝙪'𝙧𝙚 𝙞𝙣 𝙨𝙝𝙤𝙘𝙠 𝙖𝙨 𝙮𝙤𝙪 𝙙𝙞𝙨𝙘𝙤𝙫𝙚𝙧 𝙏𝙚𝙧𝙧𝙖 𝙝𝙖𝙨 𝙗𝙚𝙚𝙣 𝙬𝙤𝙧𝙠𝙞𝙣𝙜 𝙗𝙚𝙝𝙞𝙣𝙙 𝙎𝙚𝙧𝙖𝙝'𝙨 𝙗𝙖𝙘𝙠 𝙩𝙝𝙚 𝙚𝙣𝙩𝙞𝙧𝙚 𝙩𝙞𝙢𝙚!"); 
                scanner.nextLine();
                System.out.println("Terra: Oh don't blame the poor girl, she's just trying to save her town from dying out like the others. Little did she know, every recruit that went missing were turning into the Gehelia. Shes basically just digging her own grave at this point, not that I'm complaining though.");  
                scanner.nextLine();
                System.out.println("𝙔𝙤𝙪 𝙩𝙧𝙮 𝙩𝙤 𝙧𝙪𝙣 𝙗𝙖𝙘𝙠 𝙩𝙤 𝙩𝙤𝙬𝙣 𝙩𝙤 𝙞𝙣𝙛𝙤𝙧𝙢 𝙎𝙚𝙧𝙖𝙝 𝙤𝙛 𝙮𝙤𝙪𝙧 𝙙𝙞𝙨𝙘𝙤𝙫𝙚𝙧𝙞𝙚𝙨, 𝙗𝙪𝙩 𝙖𝙨 𝙮𝙤𝙪 𝙙𝙤 𝙨𝙤, 𝙮𝙤𝙪 𝙨𝙩𝙚𝙥 𝙤𝙣 𝙖 𝙩𝙬𝙞𝙜..."); 
                scanner.nextLine();
                System.out.println("???: Who's there!?!");
                scanner.nextLine();
                System.out.println("Terra: " + name + "!? How much did you hear?"); 
                scanner.nextLine();
                System.out.println(name + ": n-n-nothing");
                scanner.nextLine();
                System.out.println("???: You handle this, I'll take my leave now.");  
                scanner.nextLine();
                System.out.println("Terra: Yes sir! I'll handle this as quickly as possible...."); 
                scanner.nextLine();
                System.out.println("Terra: " + name + "... you started to grow on me too. It's a shame it had to come down to this. Don't worry, I'll try to make it as painless as possible hehe.");
                
                boolean bossFight = true;
                
                Monster terra = new Monster(5, -1); 
                System.out.println("You have encountered: " + terra.getName());
                System.out.println("Its too bad, really, but you'll have to disappear now.");

                while (terra.getHp() > 0 && character.getHp() > 0 ){
                    System.out.println(name + "\n HP: " + character.getHp() + "\n MP: " + character.getMagic());
                    System.out.println(terra.getName() + "\n" + "Hp: " + terra.getHp());
                    System.out.println("Your turn: [Attack]     [Magic]     [Flee]");
                    String turn = scanner.nextLine();

                    if (turn.equalsIgnoreCase("Attack")){
                        character.hp = character.getHp() - terra.getAttack();
                        System.out.println("You attack "+ character.getChain() + " times!");

                        for (int i=0; i<character.getChain(); i++) {
                            terra.setHp(terra.getHp() - character.getAttack()); 
                        }
                    }
                    else if (turn.equalsIgnoreCase("Magic")) {
                        System.out.println("Fira: " + character.getFCost());
                        System.out.println("Barria: " + character.getBCost());
                        System.out.println("Heal: " + character.getHCost());

                        if (charClass.equalsIgnoreCase("priest")) {
                                System.out.println("Purify: " + character.getPCost());
                        }
                        String spell = scanner.nextLine();
                        if (spell.equalsIgnoreCase("fira")){
                            if(character.getMagic() >= character.getFCost()) {
                                terra.setHp(terra.getHp() - character.getFira());
                                character.setMagic(character.getMagic() - character.getFCost());
                                character.setHealth(character.getHp() - terra.getAttack());
                                System.out.println("You hit " + terra.getName() + " for: " + character.getFira()); 
                                System.out.println("You've been hit for: " + terra.getAttack());
                            } else {
                                System.out.println("Not enough mana");
                            }
                        }
                        else if (spell.equalsIgnoreCase("barria")){
                            if(character.getMagic() >= character.getBCost()) {
                                character.setMagic(character.getMagic() - character.getBCost());
                                System.out.println("You blocked all incoming damage");
                            } else {
                                System.out.println("Not enough mana");
                            }
                        }
                        else if (spell.equalsIgnoreCase("heal")){
                            if(character.getMagic() >= character.getHCost()) {
                                character.setMagic(character.getMagic() - character.getHCost());
                                character.setHealth(character.getHp() + character.getHeal() - terra.getAttack());
                                System.out.println("You healed for: " + character.getHeal());
                                System.out.println("You've been hit for: " + terra.getAttack());
                            } else {
                                System.out.println("Not enough mana");
                            }
                        }
                        else if (spell.equalsIgnoreCase("purify")){
                            if(character.isPriest()) {
                                character.setMagic(character.getMagic() - character.getPCost());
                                character.setHealth(character.getHp() - terra.getAttack());
                                System.out.println("You've been hit for: " + monster1.getAttack());
                                System.out.println("The purification doesn't work on humans!");
                            } else {
                                System.out.println("You're not a Priest!");
                            }
                        }
                    }
                    else if (turn.equalsIgnoreCase("flee")){
                        System.out.println("You tried to run but couldn't");
                        character.setHealth(character.getHp() - terra.getAttack());
                        System.out.println("You've been hit for: " + terra.getAttack());
                    }    
                }
                if(character.getHp() > 0) {
                    System.out.println("Terra: NO PLEASE, SPARE ME!! I-I'LL DO ANYTHING!"); 
                    System.out.println(" [1] Save Terra \n [2] Finish Terra");
                    redo = true; 
                    while(redo) {
                        try{
                            choice = scanner.nextInt();
                            scanner.nextLine();
                        } catch(Exception e) {
                            System.out.print("Please input a valid choice: ");
                            scanner.nextLine();
                        }        
                        switch(choice) {
                            case 1:
                                System.out.println("𝙔𝙤𝙪 𝙝𝙤𝙡𝙙 𝙮𝙤𝙪𝙧 𝙝𝙖𝙣𝙙 𝙤𝙪𝙩 𝙛𝙤𝙧 𝙝𝙞𝙢."); 
                                System.out.println("Terra: OMG Thank you so so much! I'll do whatever you say!!"); 
                                System.out.println("𝙏𝙚𝙧𝙧𝙖 𝙟𝙪𝙢𝙥𝙨 𝙪𝙥 𝙩𝙤 𝙝𝙪𝙜 𝙮𝙤𝙪."); 
                                System.out.println("𝘽𝙚𝙛𝙤𝙧𝙚 𝙮𝙤𝙪 𝙘𝙖𝙣 𝙚𝙫𝙚𝙣 𝙧𝙚𝙖𝙘𝙩, 𝙮𝙤𝙪 𝙛𝙚𝙚𝙡 𝙖 𝙠𝙣𝙞𝙛𝙚 𝙨𝙩𝙖𝙗 𝙮𝙤𝙪 𝙛𝙧𝙤𝙢 𝙗𝙚𝙝𝙞𝙣𝙙."); 
                                System.out.println(name +": Terra?? HOW COULD YOU?!?!?"); 
                                System.out.println("Terra: Hahaha, you really thought I'd listen to a puny peasent like you? Think again."); 
                                System.out.println("𝙔𝙤𝙪𝙧 𝙚𝙮𝙚𝙨 𝙙𝙞𝙢 𝙖𝙨 𝙮𝙤𝙪 𝙛𝙚𝙚𝙡 𝙮𝙤𝙪𝙧 𝙨𝙤𝙪𝙡 𝙡𝙚𝙖𝙫𝙚 𝙮𝙤𝙪𝙧 𝙗𝙤𝙙𝙮..."); 
                                character.setHealth(0);
                                redo = false;
                                break;
                            case 2:
                                System.out.println(name + ": Anything? Then tell me why you are doing this"); 
                                scanner.nextLine();
                                System.out.println("Terra: I... I can't say that"); 
                                scanner.nextLine();
                                System.out.println(name + ": Hiding more secrets are we? I bet they'll be of use when you're dead!");
                                scanner.nextLine();
                                System.out.println("As you swing your weapon,  you feel it get caught on something");
                                scanner.nextLine();
                                System.out.println("You look around and see nothing wrong but your weapon feels heavier");
                                scanner.nextLine();
                                System.out.println("Terra: Hah, looks like fate has decided to give me it's grace. Imagine losing a battle because of a newbie thing such as dungeon exhaustion...");
                                scanner.nextLine();
                                System.out.println("Terra: Let me tell you this... being in the dungeon causes a different type of exhaustion, not that a newbie like you would know.");
                                scanner.nextLine();
                                System.out.println("Terra: Heh, I'll call this battle a draw");
                                scanner.nextLine();
                                System.out.println("Terra: Next time, you won't be able to live to tell the tale newbie");
                                scanner.nextLine();
                                System.out.println("𝙔𝙤𝙪𝙧 𝙚𝙮𝙚𝙨 𝙨𝙩𝙖𝙧𝙩 𝙩𝙤 𝙛𝙚𝙚𝙡 𝙝𝙚𝙖𝙫𝙮 𝙖𝙣𝙙 𝙩𝙝𝙚 𝙬𝙤𝙧𝙡𝙙 𝙨𝙚𝙚𝙢𝙨 𝙩𝙤 𝙨𝙥𝙞𝙣 𝙖𝙨 𝙏𝙚𝙧𝙧𝙖 𝙬𝙖𝙡𝙠𝙨 𝙖𝙬𝙖𝙮 𝙨𝙡𝙤𝙬𝙡𝙮 𝙝𝙤𝙡𝙙𝙞𝙣𝙜 𝙝𝙞𝙨 𝙬𝙤𝙪𝙣𝙙𝙨.");
                                scanner.nextLine();
                                System.out.println("𝙔𝙤𝙪 𝙩𝙧𝙮 𝙩𝙤 𝙛𝙤𝙡𝙡𝙤𝙬 𝙝𝙞𝙢 𝙗𝙪𝙩 𝙗𝙡𝙖𝙘𝙠𝙚𝙙 𝙤𝙪𝙩 𝙨𝙤𝙢𝙚 𝙬𝙖𝙮 𝙩𝙝𝙧𝙤𝙪𝙜𝙝");
                                scanner.nextLine();
                                System.out.println("𝑰𝒔 𝒕𝒉𝒊𝒔 𝒕𝒉𝒆 𝒆𝒏𝒅 𝒇𝒐𝒓 𝒎𝒆? 𝑨𝒎 𝑰 𝒓𝒆𝒂𝒍𝒍𝒚 𝒈𝒐𝒊𝒏𝒈 𝒕𝒐 𝒑𝒆𝒓𝒊𝒔𝒉 𝒅𝒐𝒘𝒏 𝒉𝒆𝒓𝒆...");
                                scanner.nextLine();
                                System.out.println("𝙷𝚘𝚞𝚛𝚜 𝚕𝚊𝚝𝚎𝚛...");
                                scanner.nextLine();
                                System.out.println("???: Heyyyyy kid");
                                scanner.nextLine();
                                System.out.println(name +": ...");
                                scanner.nextLine();
                                System.out.println("???: Wake uppp, this isn't the place to take a nap");
                                scanner.nextLine();
                                System.out.println("𝙉𝙖𝙥? 𝙒𝙝𝙖𝙩 𝙬𝙖𝙨 𝙄 𝙙𝙤𝙞𝙣𝙜... 𝙈𝙮 𝙝𝙚𝙖𝙙 𝙛𝙚𝙚𝙡𝙨 𝙛𝙤𝙜𝙜𝙮 𝙖𝙣𝙙 𝙄 𝙘𝙖𝙣 𝙗𝙖𝙧𝙚𝙡𝙮 𝙨𝙥𝙚𝙖𝙠.");
                                scanner.nextLine();
                                System.out.println(name + ": Te-rr-a..");
                                scanner.nextLine();
                                System.out.println("Freya: Terra? No silly, my name's Freya, you don't seem to well, I'll bring you somewhere safe! But then you'll owe me! Hehe");
                                scanner.nextLine();
                                System.out.println("𝙔𝙤𝙪 𝙬𝙖𝙠𝙚 𝙪𝙥 𝙩𝙤 𝙛𝙞𝙣𝙙 𝙮𝙤𝙪𝙧𝙨𝙚𝙡𝙛 𝙗𝙖𝙣𝙙𝙖𝙜𝙚𝙙 𝙪𝙥, 𝙮𝙤𝙪 𝙜𝙚𝙩 𝙪𝙥 𝙩𝙤 𝙛𝙞𝙣𝙙 𝙬𝙖𝙩𝙚𝙧.");
                                scanner.nextLine();
                                System.out.println("Freya: Oh? Seems like someones finally awake, welcome to my hideout");
                                scanner.nextLine();
                                System.out.println("Freya: You've been out for a whole day, so in return for my genrous self and my hospitality...");
                                scanner.nextLine();
                                System.out.println("Freya: Let's form a party, I have... something I need to do in the dungeons");
                                scanner.nextLine();
                                System.out.println("Freya: Don't you? Don't worry, I won't kill you, if I had those intentions, I woulnd't have brought you back");
                                scanner.nextLine();
                                System.out.println(name + ": What are you trying to do getting to the lower levels?");
                                scanner.nextLine();
                                System.out.println("Freya: Revenge...");
                                scanner.nextLine();
                                System.out.println("Freya: Well anyways, lets go, times ticking!");
                                scanner.nextLine();
                               System.out.println("𝕱𝖗𝖊𝖞𝖆 𝖍𝖆𝖘 𝖏𝖔𝖎𝖓𝖊𝖉 𝖙𝖍𝖊 𝖕𝖆𝖗𝖙𝖞!");
                                Character freya = new Character();
                                freya.setAttack(25);
                                freya.setMaxHp(60);
                                freya.setMaxMagic(50);
                                freya.addXp(0);
                                freya.setFira(8, 10);
                                freya.setBarrier(20, 10);
                                freya.setHeal(20, 10);
                                freya.setLevel(character.getLevel());
                                freya.setChain(2); 
                                redo = false;
                                break;
                            default:
                                System.out.println("Please choose a number between 1-2");
                        }
    }
                } else {
                    System.out.println("Terra: you should've just minded your own business and went on your way. If you did, you wouldn't have died so early...");
                    scanner.nextLine();
                    System.out.println("𝙔𝙤𝙪𝙧 𝙚𝙮𝙚𝙨 𝙙𝙞𝙢 𝙖𝙨 𝙮𝙤𝙪 𝙬𝙖𝙩𝙘𝙝 𝙏𝙚𝙧𝙧𝙖 𝙬𝙖𝙡𝙠 𝙩𝙤𝙬𝙖𝙧𝙙𝙨 𝙩𝙝𝙚 𝙩𝙤𝙬𝙣..."); 
                    scanner.nextLine();
                    System.out.println("𝘼𝙛𝙩𝙚𝙧 𝙖 𝙬𝙝𝙞𝙡𝙚, 𝙮𝙤𝙪 𝙨𝙩𝙖𝙧𝙩 𝙩𝙤 𝙛𝙚𝙚𝙡 𝙩𝙝𝙚 𝙡𝙖𝙨𝙩 𝙤𝙛 𝙮𝙤𝙪𝙧 𝙨𝙤𝙪𝙡 𝙡𝙚𝙖𝙫𝙚 𝙮𝙤𝙪. 𝙔𝙤𝙪 𝙝𝙚𝙖𝙧 𝙨𝙤𝙢𝙚𝙤𝙣𝙚 𝙧𝙪𝙣𝙣𝙞𝙣𝙜...."); 
                    scanner.nextLine();
                    System.out.println("Serah: " + name.toUpperCase() + "!?!? WHAT HAPPENED TO YOU?? STAY WITH ME!!!"); 
                    scanner.nextLine();
                    System.out.println("Terra: I-I-I DON'T KNOW!! ON THE WAY BACK TO TOWN, I SAW " + name.toUpperCase() + " LAYING HERE. I RUSHED TO YOU AS SOON AS I COULD!!"); 
                    scanner.nextLine();
                    System.out.println("𝙔𝙤𝙪 𝙩𝙧𝙮 𝙩𝙤 𝙬𝙖𝙧𝙣 𝙎𝙚𝙧𝙖𝙝, 𝙗𝙪𝙩 𝙮𝙤𝙪𝙧 𝙢𝙤𝙪𝙩𝙝 𝙬𝙤𝙪𝙡𝙙𝙣'𝙩 𝙢𝙤𝙫𝙚. 𝙄𝙣 𝙛𝙖𝙘𝙩, 𝙮𝙤𝙪 𝙘𝙖𝙣'𝙩 𝙢𝙤𝙫𝙚 𝙖𝙣𝙮 𝙥𝙖𝙧𝙩 𝙤𝙛 𝙮𝙤𝙪𝙧 𝙗𝙤𝙙𝙮 𝙖𝙩 𝙖𝙡𝙡."); 
                    scanner.nextLine();
                    System.out.println("𝘼𝙨 𝙮𝙤𝙪 𝙡𝙚𝙖𝙫𝙚 𝙩𝙝𝙚 𝙬𝙤𝙧𝙡𝙙, 𝙩𝙝𝙚 𝙡𝙖𝙨𝙩 𝙩𝙝𝙞𝙣𝙜 𝙮𝙤𝙪 𝙨𝙚𝙚 𝙞𝙨 𝙏𝙚𝙧𝙧𝙖 𝙨𝙢𝙞𝙧𝙠𝙞𝙣𝙜 𝙗𝙚𝙝𝙞𝙣𝙙 𝙎𝙚𝙧𝙖𝙝'𝙨 𝙗𝙖𝙘𝙠...."); 
                }                           
            }
        }
        else if(character.getHp() < 0) {
            System.out.println("You have perished...");
            fight = false;
        }
    }
  }
}