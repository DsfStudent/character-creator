/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package create.a.character;
import java.util.Scanner;
/**
 *
 * @author David Ferreira
 */
public class CreateACharacter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        String race;
        String classType;
        
        System.out.println("Welcome to D's D&D Character Creator! \n");
        name = getCharName();
        race = getRace();
        //getRace();
        classType = getClassType();
        //ability scores
    }
    
    public static String getCharName () {
        Scanner reader = new Scanner (System.in);
        
        System.out.print("Input Your Character's Name: ");
        String name = reader.nextLine();
        System.out.print("\t-" + name + " Selected- \n");
        
        return name;
    }
    
    public static String getRace() {
        Scanner reader = new Scanner (System.in);
        
        System.out.print("\nYou can now choose from 9 Races" + "\n 1: Human" + "\t  2: Dwarf" + "\t  3: Elf" + "\n 4: Halfling" + "\t  5: Dragonborn" + "\t  6: Gnome" + "\n 7: Half-Elf" + "\t  8: Half-Orc" + "\t  9: Tiefling" + "\nInput Your Character's Race Number: ");
        
        int raceNum = reader.nextInt();
        String race = "";
        switch (raceNum) {
            case 1:     race = "Human";
                        break;
            case 2:     race = "Dwarf";
                        break;
            case 3:     race = "Elf";
                        break;
            case 4:     race = "Halfling";
                        break;
            case 5:     race = "Dragonborn";
                        break;
            case 6:     race = "Gnome";
                        break;
            case 7:     race = "Half-Elf";
                        break;
            case 8:     race = "Half-Orc";
                        break;
            case 9:     race = "Tiefling";
                        break;
            default:    race = "Invaild Race, Restart & Choose Again.";
                        break;
        }
        if (race.equals("Invaild Race, Restart & Choose Again.")) {
            System.out.println("\t" + race);
            System.exit(0);
        }
        System.out.println("\t-" + race + " Selected-");
        return race;
    }
    
    public static String getClassType() {
        Scanner reader = new Scanner (System.in);
        
        System.out.print("\nYou can now choose from 12 Classes" + "\n 1: Barbarian" + "\t  2: Bard" + "\t  3: Cleric" + "\t  4: Druid" + "\n 5: Fighter" + "\t  6: Monk" + "\t  7: Paladin" + "\t  8: Ranger" + "\n 9: Rogue" + "\t 10: Sorcerer" + "\t 11: Warlock" + "\t 12: Wizard" + "\nInput Your Character's Class Number: ");
        
        int classNum = reader.nextInt();
        String classType = "";
        switch (classNum) {
            case 1:     classType = "Barbarian";
                        break;
            case 2:     classType = "Bard";
                        break;
            case 3:     classType = "Cleric";
                        break;
            case 4:     classType = "Druid";
                        break;
            case 5:     classType = "Fighter";
                        break;
            case 6:     classType = "Monk";
                        break;
            case 7:     classType = "Paladin";
                        break;
            case 8:     classType = "Ranger";
                        break;
            case 9:     classType = "Rogue";
                        break;
            case 10:    classType = "Sorcerer";
                        break;
            case 11:    classType = "Warlock";
                        break;
            case 12:    classType = "Wizard";
                        break;
            default:    classType = "Invaild Class, Restart & Choose Again.";
                        break;
        }
        if (classType.equals("Invaild Class, Choose Again.")) {
            System.out.println("\t" + classType);
            System.exit(0);
        }
        System.out.println("\t-" + classType + " Selected- \n");
        return classType;
    }
}

//Name, Race, Class, Ability score (6d6 & remove lowest number) (Race affects scores), Alignment, Backgrounds, Hit Points, Starting gold, 