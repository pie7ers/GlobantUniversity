import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args){
        String opt = IntroductionMessage();
        while(!opt.equals("EXIT") && !opt.equals("exit")) {
            System.out.println("You wrote "+opt+"\n");
            HandlerMenu(opt);
            opt = IntroductionMessage();
        }

    }

    public static boolean res;
    public static int[] arrNumbers;
    public static String reciveKeys = "";
    public static Scanner write = new Scanner(System.in);
    public static Random myRandom = new Random();

    public static String IntroductionMessage(){

        System.out.println("\n---------------------------------------------------------------------------");
        System.out.println("These are the exercises of basic programming in Java for Globant Univeristy");

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("MENU");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Write the number for the option which you want to run \n");
        System.out.println("1. Value boolean for gender");
        System.out.println("2. Generate an array with at least 5 numbers randomly and check if the sum between the number in position 2, 3 and 4 is a pair number");
        System.out.println("3. Generate an array with many numbers randomly and check if at least of these is pair");
        System.out.println("4. Write two words and check if are equals");
        reciveKeys = write.nextLine();
        System.out.println("If you want to finish the program write 'EXIT'");

        return reciveKeys;
    }

    public static void HandlerMenu(String opt){
        
        System.out.println("your opt is: " + opt +"\n");

        switch(opt){
            case "1":
                System.out.println("Write 'F' if your gender is female or 'M' if is male or another");
                reciveKeys = write.nextLine();
                boolean myGender = ReturnGender(reciveKeys.charAt(0));
                System.out.println("you wrote ["+reciveKeys+"] so the result is ["+myGender+"]");
                break;
            case "2":
                arrNumbers = GenerateNumbers();
                int sum = arrNumbers[2]+arrNumbers[3]+arrNumbers[4];
                boolean isPair = CheckPairAndOdd(sum);
                System.out.println("\nThe sum between "+arrNumbers[2]+" + "+arrNumbers[3]+" + "+arrNumbers[4]+" = "+sum+" then pair is ["+isPair+"]");
                break;
            case "3":
                arrNumbers = GenerateNumbers();
                boolean hasAPair = HasAtLeastPairNumber(arrNumbers);
                System.out.println("\nThe array has at least a pair number? ["+hasAPair+"]");
                break;
            case "4":
                boolean equalWords = EqualWords();
                System.out.println("the words are equals? = ["+equalWords+"]");
                break;
            default:
                System.out.println("\nThe option ["+opt+"] does not exist");
                break;
        }
    }

    public static int[] GenerateNumbers(){
        int arrayLength;
        //System.out.println("Write the number to assign the quantity of numbers to generate randomly");
        arrayLength = 5+myRandom.nextInt(10);
        int[] arrNumbers = new int[arrayLength];
        for(int count = 0; count < arrayLength ;count++){
            arrNumbers[count] = myRandom.nextInt(1000);
            System.out.println("The number for pos ["+count+"] = " + arrNumbers[count]);
        }
        return arrNumbers;
    }
    
    public static boolean ReturnGender(char gender){
        gender = Character.toUpperCase(gender);
        boolean res;
        if(gender == 'F'){
            res = true;
        } else {
            res = false;
        }
        return res;
    }
    
    public static boolean CheckPairAndOdd(int resSum){
        res = resSum % 2 == 0 ? true : false;
        return res;
    }

    public static boolean HasAtLeastPairNumber(int[] arrNumbers){
        int hasAPair = 0;

        for(int count = 0; count < arrNumbers.length; count++ ){
            if(arrNumbers[count] % 2 == 0){
                hasAPair++;
            }
        }
        res = hasAPair >= 1 ? true : false;

        return res;
    }

    public static boolean EqualWords(){
        String firstWord = "";
        String secondWord = "";
        
        System.out.println("Write the first word");
        firstWord = write.nextLine();
        firstWord = firstWord.toLowerCase();
        
        System.out.println("Write the second word");
        secondWord = write.nextLine();
        secondWord = secondWord.toLowerCase();

        res = firstWord.equals(secondWord) ? true : false;

        return res;
    }
}
