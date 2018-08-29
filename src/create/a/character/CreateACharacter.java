/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package create.a.character;
import java.util.Random;
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
        String name; //For if I ever want to come back and make this into an object, ie: create multiple characters or output created character to a file
        String race;
        String classType;
        int strScore;
        int dexScore;
        int constScore;
        int intScore;
        int wisScore;
        int charScore;
        String alignment;
        String background;
        
        System.out.println("Welcome to D's D&D Character Creator! \n");
        name = getCharName();
        race = getRace();
        classType = getClassType();
        strScore = getStrScore();       //I know this can be optimized, I need help setting up the proper array loops to make that happen
        dexScore = getDexScore();
        constScore = getConstScore();
        intScore = getIntScore();
        wisScore = getWisScore();
        charScore = getCharScore();
        alignment = getCharAlignment();
        background = getBackground();
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
        if (classType.equals("Invaild Class, Restart & Choose Again.")) {
            System.out.println("\t" + classType);
            System.exit(0);
        }
        System.out.println("\t-" + classType + " Selected-");
        return classType;
    }
    
    public static int getStrScore () {
        int score;
        int scoreArray1[] = new int[4];
        int scoreArray2[] = new int[3];
        int max = 6;
        int min = 1;
        Random rand = new Random();
        int index = 0;
        for (int i = 0; i <= 3; i++) {
            scoreArray1[index] = rand.nextInt((max - min) + 1) + min;
            index++;
        }
        System.out.print("\n\t-Strength-" + "\nYour Character's Strength Score Is: ");
        scoreArray1 = bubbleSort(scoreArray1);
        scoreArray2 = removeLowest(scoreArray1);
        printArray(scoreArray2); //Testing
        score = addArray(scoreArray2);
        return score;
    }
    
    public static int getDexScore () {
        int score;
        int scoreArray1[] = new int[4];
        int scoreArray2[] = new int[3];
        int max = 6;
        int min = 1;
        Random rand = new Random();
        int index = 0;
        for (int i = 0; i <= 3; i++) {
            scoreArray1[index] = rand.nextInt((max - min) + 1) + min;
            index++;
        }
        System.out.print("\t-Dexterity-" + "\nYour Character's Dexterity Score Is: ");
        scoreArray1 = bubbleSort(scoreArray1);
        scoreArray2 = removeLowest(scoreArray1);
        printArray(scoreArray2); //Testing
        score = addArray(scoreArray2);
        return score;
    }
    
    public static int getConstScore () {
        int score;
        int scoreArray1[] = new int[4];
        int scoreArray2[] = new int[3];
        int max = 6;
        int min = 1;
        Random rand = new Random();
        int index = 0;
        for (int i = 0; i <= 3; i++) {
            scoreArray1[index] = rand.nextInt((max - min) + 1) + min;
            index++;
        }
        System.out.print("\t-Constitution-" + "\nYour Character's Constitution Score Is: ");
        scoreArray1 = bubbleSort(scoreArray1);
        scoreArray2 = removeLowest(scoreArray1);
        printArray(scoreArray2); //Testing
        score = addArray(scoreArray2);
        return score;
    }
    
    public static int getIntScore () {
        int score;
        int scoreArray1[] = new int[4];
        int scoreArray2[] = new int[3];
        int max = 6;
        int min = 1;
        Random rand = new Random();
        int index = 0;
        for (int i = 0; i <= 3; i++) {
            scoreArray1[index] = rand.nextInt((max - min) + 1) + min;
            index++;
        }
        System.out.print("\t-Intelligence-" + "\nYour Character's Intelligence Score Is: ");
        scoreArray1 = bubbleSort(scoreArray1);
        scoreArray2 = removeLowest(scoreArray1);
        printArray(scoreArray2); //Testing
        score = addArray(scoreArray2);
        return score;
    }
    
    public static int getWisScore () {
        int score;
        int scoreArray1[] = new int[4];
        int scoreArray2[] = new int[3];
        int max = 6;
        int min = 1;
        Random rand = new Random();
        int index = 0;
        for (int i = 0; i <= 3; i++) {
            scoreArray1[index] = rand.nextInt((max - min) + 1) + min;
            index++;
        }
        System.out.print("\t-Wisdom-" + "\nYour Character's Wisdom Score Is: ");
        scoreArray1 = bubbleSort(scoreArray1);
        scoreArray2 = removeLowest(scoreArray1);
        printArray(scoreArray2); //Testing
        score = addArray(scoreArray2);
        return score;
    }
    
    public static int getCharScore () {
        int score;
        int scoreArray1[] = new int[4];
        int scoreArray2[] = new int[3];
        int max = 6;
        int min = 1;
        Random rand = new Random();
        int index = 0;
        for (int i = 0; i <= 3; i++) {
            scoreArray1[index] = rand.nextInt((max - min) + 1) + min;
            index++;
        }
        System.out.print("\t-Charisma-" + "\nYour Character's Charisma Score Is: ");
        scoreArray1 = bubbleSort(scoreArray1);
        scoreArray2 = removeLowest(scoreArray1);
        printArray(scoreArray2); //Testing
        score = addArray(scoreArray2);
        return score;
    }
    
    public static String getCharAlignment () {
        Scanner reader = new Scanner (System.in);
        
        System.out.print("You can now choose from 9 Alignments" + "\n 1: Lawful Good" + "\t\t  2: Neutral Good" + "\t  3: Chaotic Good" + "\n 4: Lawful Neutral" + "\t  5: Neutral" + "\t\t  6: Chaotic Neutral" + "\n 7: Lawful Evil" + "\t\t  8: Neutral Evil" + "\t  9: Chaotic Evil" + "\nInput Your Character's Alignment Number: ");
        
        int alignNum = reader.nextInt();
        String alignment = "";
        switch (alignNum) {
            case 1:     alignment = "Lawful Good";
                        break;
            case 2:     alignment = "Neutral Good";
                        break;
            case 3:     alignment = "Chaotic Good";
                        break;
            case 4:     alignment = "Lawful Neutral";
                        break;
            case 5:     alignment = "Neutral";
                        break;
            case 6:     alignment = "Chaotic Neutral";
                        break;
            case 7:     alignment = "Lawful Evil";
                        break;
            case 8:     alignment = "Neutral Evil";
                        break;
            case 9:     alignment = "Chaotic Evil";
                        break;
            default:    alignment = "Invaild Alignment, Restart & Choose Again.";
                        break;
        }
        if (alignment.equals("Invaild Alignment, Restart & Choose Again.")) {
            System.out.println("\t" + alignment);
            System.exit(0);
        }
        System.out.println("\t-" + alignment + " Selected-");
        return alignment;
    }
    
    public static String getBackground() {
        Scanner reader = new Scanner (System.in);
        
        System.out.print("\nYou can now choose from 12 Background" + "\n 1: Spy" + "\t\t  2: Soldier" + "\t\t  3: Sailor" + "\t  4: Knight" + "\n 5: Outlander" + "\t  6: Noble" + "\t\t  7: Criminal" + "\t  8: Gladiator" + "\n 9: Folk Hero" + "\t 10: Entertainer" + "\t 11: Hermit" + "\t 12: Sage" + "\nInput Your Character's Background Number: ");
        
        int backgroundNum = reader.nextInt();
        String backgroundType = "";
        switch (backgroundNum) {
            case 1:     backgroundType = "Spy";
                        break;
            case 2:     backgroundType = "Soldier";
                        break;
            case 3:     backgroundType = "Sailor";
                        break;
            case 4:     backgroundType = "Knight";
                        break;
            case 5:     backgroundType = "Outlander";
                        break;
            case 6:     backgroundType = "Noble";
                        break;
            case 7:     backgroundType = "Criminal";
                        break;
            case 8:     backgroundType = "Gladiator";
                        break;
            case 9:     backgroundType = "Folk Hero";
                        break;
            case 10:    backgroundType = "Entertainer";
                        break;
            case 11:    backgroundType = "Hermit";
                        break;
            case 12:    backgroundType = "Sage";
                        break;
            default:    backgroundType = "Invaild Background, Restart & Choose Again.";
                        break;
        }
        if (backgroundType.equals("Invaild Background, Restart & Choose Again.")) {
            System.out.println("\t" + backgroundType);
            System.exit(0);
        }
        System.out.println("\t-" + backgroundType + " Selected-");
        return backgroundType;
    }
    
    public static int[] bubbleSort (int [] array) {
        int counter = array.length;
        for (int index = 0; index < counter-1; index++) {
            for (int highIndex = 0; highIndex < counter-index-1; highIndex++) {
                if (array[highIndex] > array[highIndex+1]) {
                    int temp = array[highIndex];
                    array[highIndex] = array[highIndex+1];
                    array[highIndex+1] = temp;
                }
            }
        }
        return array;
    }
    
    public static int[] removeLowest (int [] array) {
        int counter = 1;
        int index = 0;
        int array2[] = new int[3];
        while (counter < array.length) {
            array2[index] = array[counter]; 
            counter++;
            index++;
        }
        return array2;
    }
    
    public static int addArray(int[] array) {
        int score = 0;
        for( int i : array) {
            score += i;
        }
        System.out.print(score + "\n\n");
        return score;
    }
    
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            if (i < 2) {
                System.out.print(arr[i] + " + ");
            } else {
                System.out.print(arr[i] + " = ");
            }
    }
}

//Name, Race, Class, Ability score (6d6 & remove lowest number) (Race affects scores), Alignment, Backgrounds, Hit Points, Starting gold, 