/*
 * Shawn White
 * CPSC 1060 
 * Coding Assignment: RPG
 * MATH WARRIOR
 * 4/25/2023
 */



import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;


public class MathWarrior {
    public static void main (String[] args) throws IOException{
        Scanner scnr = new Scanner(System.in);
        
    // Intialize Variables    
        int count = 0;
        int deathCount = 0;
        ArrayList<String> deathList = new ArrayList<String>();


    // Welcome Print Sceen
    System.out.println("Shawn's Math Games Presents:");
    System.out.println("       Math Warriors!");
    System.out.println("Battle to the Death via Math");
    System.out.println("    Type Start to play!");
    System.out.println();
    String start = scnr.nextLine();

    // HashMap of all the areans in the map 
    HashMap<String, String> arenaMap = new HashMap<String, String>();
    arenaMap.put("Mountain", "small platform at the peak of the Lonely Mountain");
    arenaMap.put("Beach", "caged arena on the island of Nath");
    arenaMap.put("Lava", "huge rock platform pointing out of the valcano in Mordor" );
    arenaMap.put("Hill" , "massive arena in the hills of the Shire ");
    arenaMap.put("Tower" , "arena at the top of the tower of Isengard ");
    

    if (start.equalsIgnoreCase("Start")) { 
    
    // Set names of each character 
        VillianCharacters evilCharacter = new VillianCharacters();
        // Goblin
        evilCharacter.setGoblinName("GogBog");
        evilCharacter.setGoblinLevel(10);
        // Orc
        evilCharacter.setOrcName("Azog the Defiler");
        evilCharacter.setOrcLevel(20);
        // Spider
        evilCharacter.setSpiderName("Shelob");
        evilCharacter.setSpiderLevel(30);
        // Wizard
        evilCharacter.setWizardName("Saruman");
        evilCharacter.setWizardLevel(40);
    
    // Set Discriptions for each weapon 
        WeaponsDiscription weaponsLore = new WeaponsDiscription();
        // Sword
        weaponsLore.setSwordDiscription("You have chosen the sword called Andúril, meaning the Sword that was Broken, which was the sword that was reforged from the shards of Narsil in Rivendell.");
        // Axe
        weaponsLore.setAxeDiscription("You have chosen the axe called cannon which Gimli used to fight Warg-Riders in defense of the Rohirrim villagers");
        // Bow 
        weaponsLore.setBowDiscription("You have chosen the Bow of the Galadhrim, which was gifted to Legolas by the high elf Galadriel");
    
    // Set Dialogue for each character 
        CharacterDialogue villianDialogue = new CharacterDialogue();
        // Goblin 
        villianDialogue.setGoblinDialogue("GogBog: Ha! You have fallen into my trap! Now we battle to the death!");
        // Orc
        villianDialogue.setOrcDialogue("Azog the Defiler: MooooHaHaaa! Now you have a real threat! I have ended the line of Dorein! Now for you!");
        // Spider
        villianDialogue.setSpiderDialogue("Shelob: PsPstttttsssPtsss");
        // Wizard
        villianDialogue.setwizardDialogue("Saruman: Finally you have come to challenge me! I will destroy you with my immense power! ");
        
    // Choose Your Weapon from ArrayList from Class Weapons 
        
        ArrayList<String> weaponList = new ArrayList<String>();

        // Weapons
        weaponList.add("Aragorn's Sword") ; 
        weaponList.add("Gimli's Axe") ;
        weaponList.add("Legolas' Bow") ;
        
        // Print Statement asking for what weapon 
        System.out.println("Choose your weapon: ");
        System.out.println(weaponList.get(0));
        System.out.println(weaponList.get(1));
        System.out.println(weaponList.get(2));
        System.out.println();
        String weaponAns = scnr.nextLine();

        // Validation of Weapon Choice
        while(!(weaponAns.equalsIgnoreCase("Sword")) && !(weaponAns.equalsIgnoreCase("Axe")) && !(weaponAns.equalsIgnoreCase("Bow"))) {
            System.out.println("That is not a weapon! choose again!");
            weaponAns = scnr.nextLine();
        }
        // Descriptions which is pulled for weapon discribtion class
        
        if (weaponAns.equalsIgnoreCase("Sword")) {
            System.out.println(weaponsLore.getSwordDiscription());
            System.out.println();
        }
        else if (weaponAns.equalsIgnoreCase("Axe")) {
            System.out.println(weaponsLore.getAxeDiscription());
            System.out.println();
        }
        else if (weaponAns.equalsIgnoreCase("Bow")) {
            System.out.println(weaponsLore.getBowDiscription());
            System.out.println();
        }
     
    // While loop untill you beat the game    
    while (count < 4)   {  
        if (count > 0 || deathCount > 0)  {  // clear scanner 
            scnr.nextLine();
        }
        
        
        System.out.println("Where would you like to fight: ");
        System.out.println("Mountain");
        System.out.println("Beach");
        System.out.println("Lava");
        System.out.println("Hill");
        System.out.println("Tower");
        System.out.println();
        String arenaAns = scnr.nextLine();
        while (!arenaAns.equalsIgnoreCase("Mountain") && !arenaAns.equalsIgnoreCase("Beach") && !arenaAns.equalsIgnoreCase("Lava") && !arenaAns.equalsIgnoreCase("Hill") && !arenaAns.equalsIgnoreCase("Tower")) {
            System.out.println("That is not an arena. Choose again.");
            arenaAns = scnr.nextLine();
        }
        
        if (arenaAns.equalsIgnoreCase("Mountain")) {
            System.out.println("You are figting in the " + arenaAns + " arena which is a " + arenaMap.get("Mountain"));
            System.out.println();
        }
        else if (arenaAns.equalsIgnoreCase("Beach")) {
            System.out.println("You are figting in the " + arenaAns + " arena which is a " + arenaMap.get("Beach"));
            System.out.println();
        }
        else if (arenaAns.equalsIgnoreCase("Lava")) {
            System.out.println("You are figting in the " + arenaAns + " arena which is a " + arenaMap.get("Lava"));
            System.out.println();
        }
        else if (arenaAns.equalsIgnoreCase("Hill")){
            System.out.println("You are figting in the " + arenaAns + " arena which is a " + arenaMap.get("Hill"));
            System.out.println();
        }
        else if (arenaAns.equalsIgnoreCase("Tower")){
            System.out.println("You are figting in the " + arenaAns + " arena which is a " + arenaMap.get("Tower"));
            System.out.println();
        }
        
        
        // Who will you fight print statement
        System.out.println("Who will you fight? Goblin , Orc, Spider, or a Wizard!");
        System.out.println();
        String fightAns = scnr.nextLine();
    
        // Validation of Villian to Fight 
        while(!(fightAns.equalsIgnoreCase("Goblin")) && !(fightAns.equalsIgnoreCase("Orc")) && !(fightAns.equalsIgnoreCase("Spider")) && !(fightAns.equalsIgnoreCase("Wizard"))){
            System.out.println("That is not a character! Choose again!");
            System.out.println();
            fightAns = scnr.nextLine();
        }
        
        

        


    // Goblin    
        if (fightAns.equalsIgnoreCase("Goblin")) {
            System.out.println("You are fighting " + evilCharacter.getGoblinName() + " the evil goblin which is a level " + evilCharacter.getGoblinLevel() + " character! So you must anwser one math question correct!" );
            System.out.println();

            System.out.println(villianDialogue.getGoblinDialogue());
            
          
            System.out.println();
            System.out.println("To use your weapon answer the following question");
            System.out.println("Enter a even number: ");
            System.out.println();
            int goblinMath = scnr.nextInt();
            
            if (goblinMath % 2 == 0) {
                System.out.println("AHHHHHHH, I'm dying you win!");
                System.out.println("Congrats you beat the GogBog! ");
                System.out.println();
                count = count + 1 ;
            }
            else {
                System.out.println("Ha, I win you lose! Now Die!");
                System.out.println("Game Over");
                deathList.add("GogBog the Goblin"); 
                deathCount = deathCount + 1;        
            }
        }
        
    // Orc
        else if (fightAns.equalsIgnoreCase("Orc")) {
            System.out.println("You are fighting " + evilCharacter.getOrcName() + " who is a level " + evilCharacter.getOrcLevel() + " character!" );
            System.out.println();

            System.out.println(villianDialogue.getOrcDialogue());
            System.out.println();

            System.out.println("To use your weapon answer the following 2 questions");
            System.out.println("What is the square root of 49?");
            System.out.println();
            int orcMath1  = scnr.nextInt();
                
                if (orcMath1 == 7) {
                    System.out.println("Azog the Defiler: ");
                    System.out.println("Arrrhhhhhh! My arm, you got my arm!");
                    System.out.println("You must anwser one more to defeat me though!");
                    System.out.println("Enter a prime number: ");
                    System.out.println();
                    int orcMath2 = scnr.nextInt();
                        // Check is number is Prime
                        boolean prime = false;
                        for (int i = 2; i <= orcMath2 / 2; i++) {
                            if (orcMath2 % i == 0) {
                                prime = true;
                            }
                        }
                        if (!prime) {
                            orcMath2 = 1;
                        }
                        else {
                            orcMath2 = 0;
                        }             
                        
                        if (orcMath2 == 1) {
                            count = count + 1;
                            System.out.println("Arhhhhh, my head you killed me!");
                            System.out.println("Congrats, you defeated Azog the Defiler!");
                            System.out.println();
                        }
                        else {
                            System.out.println("HA! you missed now you die!");
                            System.out.println("Game Over");
                            deathList.add("Azog the Defiler");
                            deathCount = deathCount + 1;  
                        }    
                }
                else {
                    System.out.println("HA! you missed now you die!");
                    System.out.println("Game Over");
                    deathList.add("Azog the Defiler");
                    deathCount = deathCount + 1;  
                }
        }
    
    // Spider 
        else if (fightAns.equalsIgnoreCase("Spider")) {
            System.out.println("You are fighting " + evilCharacter.getSpiderName() + " who is a level " + evilCharacter.getSpiderLevel() + " character!" );
            System.out.println();

            System.out.println(villianDialogue.getSpiderDialogue());
            System.out.println();
            
            System.out.println("To use your weapon answer the following 3 questions:");
            System.out.println("what is 12 to the power of 2?");
            System.out.println();
            int spiderMath1 = scnr.nextInt();
            
            if (spiderMath1 == 144) {
                System.out.println("Shelob: spspspspsssss");
                System.out.println("Direct hit! You have damaged its health! Keep Going!");
                System.out.println("Solve for x:  2x = 64 + 4x ");
                System.out.println();
                int spiderMath2 = scnr.nextInt();
                    if (spiderMath2 == -32) {
                        System.out.println("Shelob: pershtttspsssss");
                        System.out.println("Another hit! You have damaged its health! Keep Going!");
                        System.out.println("What is the det(A) if A is a matrix:");
                        System.out.println("4   2");
                        System.out.println("2   2");
                        System.out.println();
                        int spiderMath3 = scnr.nextInt();
                            if (spiderMath3 == 4) {
                                System.out.println("Shelob: *death spider nosie* ");
                                System.out.println("Congrats! You defeated Shelob!");
                                System.out.println();
                                count = count + 1;
                            }
                            else {
                                System.out.println("You missed and the spider has eaten you!");
                                System.out.println("Game Over");
                                deathList.add("Shelob");
                                deathCount = deathCount + 1;  
                            }
                    }
                    else {
                        System.out.println("You missed and the spider has eaten you!");
                        System.out.println("Game Over");
                        deathList.add("Shelob");
                        deathCount = deathCount + 1;  
                    }     
            }
            else {
                System.out.println("You missed and the spider has eaten you!");
                System.out.println("Game Over");
                deathList.add("Shelob");
                deathCount = deathCount + 1;  
            }

        }

    // Wizard 
        else if (fightAns.equalsIgnoreCase("Wizard")) {
            System.out.println("You are fighting " + evilCharacter.getWiardName() + " who is a level " + evilCharacter.getWizardLevel() + " character!" );
            System.out.println();

            System.out.println(villianDialogue.getWizardDialogue());
            System.out.println();

            System.out.println("The final boss Saruman takes 4 questions to beat!");
            System.out.println("What is the derivative of a constant?");
            System.out.println();
            int wizardMath1 = scnr.nextInt();
            if (wizardMath1 == 0) {
                System.out.println("Saruman: That barely hurt you will have to do better than that!");
                System.out.println("He lost some, health keep going!");
                System.out.println("Apart from one, what is the first positive number that is both a square and a cube? ");
                System.out.println();
                int wizardMath2 = scnr.nextInt();
                    if (wizardMath2 == 64) {
                        System.out.println("Saruman: ughhhh, lucky! Won't happen again!");
                        System.out.println("Nice hit! He is down to half health! Two more to go!");
                        System.out.println("What is the fifth digit of the fibonacci numbers?");
                        System.out.println();
                        int wizardMath3 = scnr.nextInt();
                        if (wizardMath3 == 3) {
                            System.out.println("Saruman: NO! This can't be! I will get you!");
                            System.out.println("Direct Hit! One more!");
                            System.out.println("A triangle has three sides with two of them being 3 ft and 4 ft, what is the legnth of the 3rd side?");
                            System.out.println();
                            int wizardMath4 = scnr.nextInt();
                                if (wizardMath4 == 5) {
                                    System.out.println("Saruman: NOOOOOOO! ");
                                    System.out.println("Congrats! You have defeated Saruman");
                                    System.out.println();
                                    count = count + 1;
                                }
                                else {
                                    System.out.println("You missed and Saruman counters with a fireball! You Lose!");
                                    System.out.println("Game Over");
                                    deathList.add("Saruman");
                                    deathCount = deathCount + 1;  
                                }

                        }
                        else {
                            System.out.println("You missed and Saurmon counters with a fireball! You Lose!");
                            System.out.println("Game Over");
                            deathList.add("Saruman");
                            deathCount = deathCount + 1;  
                        }

                    }
                    else {
                        System.out.println("You missed and Saurmon counters with a fireball! You Lose!");
                        System.out.println("Game Over");
                        deathList.add("Saruman");
                        deathCount = deathCount + 1;  
                    }

            }
            else {
                System.out.println("You missed and Saurmon counters with a fireball! You Lose!");
                System.out.println("Game Over");
                deathList.add("Saruman");
                deathCount = deathCount + 1;  
            }


        
        }
    }  
    
    System.out.println();
    System.out.println("Congrats you have defeated Math Warrior! You now control the power of the One Ring to Rule them All!");


    // File of win screen and how many deaths and who you killed you.
    FileOutputStream fileStream = new FileOutputStream("howYouDid.txt");
    PrintWriter outFS = new PrintWriter(fileStream);
    outFS.println("Congrats on Winning!");
    outFS.println("Here is a recap of your adventure");
    outFS.print("You died ");
    
    if (deathList.size() == 0){
        outFS.println("zero times! Congrats!");
    }
    
    else {
        for (int j = 0 ; j < deathList.size() ; j++){
            outFS.println(deathList.size() + " times! Next time shoot for zero!");
            outFS.println("You were killed by: ");
            outFS.println(deathList.get(j));
    
        }
    }
    outFS.close();
    }
    else {
        System.out.println("Not an Option, try again");
        
    }
}
}

public class VillianCharacters {    // Class that sets/gets names and levels of villians
    
    // set private variables 
    private String gName;
    private int gLevel;
    private String oName;
    private int oLevel;
    private String sName;
    private int sLevel;
    private String wName;
    private int wLevel;

// Goblin
    public void setGoblinName(String GoblinName) {  //  Name Set
        gName = GoblinName ;
    }
    public String getGoblinName() {  // Name Get
        return gName;
    }
    public void setGoblinLevel(int goblinLevel) { // Level Set
        gLevel = goblinLevel ;
    }
    public int getGoblinLevel() {  // Level Get
        return gLevel;
    }
// Orc 
     public void setOrcName(String orcName) {  // Name Set 
        oName = orcName;
     }
     public String getOrcName() {  // Name Get
        return oName;
     }
     public void setOrcLevel(int orcLevel) { // Level Set
        oLevel = orcLevel;
     }
     public int getOrcLevel() {  // Level Get
        return oLevel;
    }

// Spider
     public void setSpiderName(String spiderName) { // Name Set
        sName = spiderName ;
     }
     public String getSpiderName() {  // Name Get 
        return sName;
     }
     public void setSpiderLevel(int spiderLevel) { // Level Set
        sLevel = spiderLevel;
     }
     public int getSpiderLevel() {  // Level Get
        return sLevel;
     }

// Wizard  
     public void setWizardName(String wizardName) { // Name Set
        wName = wizardName;
     }
     public String getWiardName() {  // Name Get 
        return wName;
     }
     public void setWizardLevel(int wizardLevel) { // Level Set
        wLevel = wizardLevel;
     }
     public int getWizardLevel() {  // Level Get
        return wLevel;
     }

}

// Weapon class that holds the array of weapons 

public class WeaponsDiscription {
    
    // set private variables
    private String swordDiscription;
    private String axeDiscription;
    private String bowDiscription;

    // Sword
    public void setSwordDiscription(String sword) {  // get 
        swordDiscription = sword;
    }
    public String getSwordDiscription() { // set 
        return swordDiscription;
    }
    
    // Axe
    public void setAxeDiscription(String axe) { // get 
        axeDiscription = axe;
    }
    public String getAxeDiscription() { // set 
        return axeDiscription;
    }
    
    // Bow
    public void setBowDiscription(String bow){ // get 
        bowDiscription = bow;
    }
    public String getBowDiscription() { // set 
        return bowDiscription;
    }
}

// Characters Dialogue 
public class CharacterDialogue {
    
    private String goblinDialogue;
    private String orcDialogue;
    private String spiderDialogue;
    private String wizardDialogue;

    // Goblin 
    public void setGoblinDialogue(String goblin) {
        goblinDialogue = goblin;
    }
    public String getGoblinDialogue() {
        return goblinDialogue;
    }
    // Orc
    public void setOrcDialogue(String orc) {
        orcDialogue = orc;
    }
    public String getOrcDialogue() {
        return orcDialogue;
    }
    // Spider
    public void setSpiderDialogue(String spider) {
        spiderDialogue = spider;
    }
    public String getSpiderDialogue() {
        return spiderDialogue;
    }
    // Wizard 
    public void setwizardDialogue(String wizard) {
        wizardDialogue = wizard;
    }
    public String getWizardDialogue() {
        return wizardDialogue;
    }
}



