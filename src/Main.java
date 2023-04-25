import java.util.Scanner;

//50 programming projects in python
//https://www.reddit.com/r/learnprogramming/comments/2a9ygh/50_programming_projects_for_practice/
//Lets make programming fun for me and a hobby that I enjoy doing
// 4/22 I shall begin with the first project for practice
//Right now I'm just simply writing comments to get myself used to writing in an IDE again.
public class Main {
    public static void main(String[] args) {

        //how to reverse a string
        //I'm going to use a scanner to get the input from the user

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please enter a string to reverse: ");
//        String stringToReverse = input.nextLine();
//        //next step reverse the string
//        //I'm going to use a for loop to reverse the string
//        //I'm going to use a string builder to reverse the string
//        StringBuilder reversedString = new StringBuilder();
//        for(int i = stringToReverse.length() - 1; i >= 0; i--){
//            reversedString.append(stringToReverse.charAt(i));
//        }
//        System.out.println("The reversed string is: " + reversedString);

        //writing a program to count the letters, spaces, and numbers and other characters in an input string
        //I'm going to use a scanner to get the input from the user

//        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
//        count(test); //calling the count method

        //writing a java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
        //I'm going to use a scanner to get the input from the user
        //I'm going to use a for loop to create the unique three digit numbers
        //I'm going to use a counter to count how many three digit numbers there are
        //I'm going to use a hashset to store the unique three digit numbers
        //I'm going to use a for each loop to display the unique three digit numbers
        //I'm going to use the size method to count how many three digit numbers there are

        //uniqueThreeDigitNumbers();

        //printing off numbers from 1 to 99
        printNumbers();


    }
    //problem 48
    public static void printNumbers() {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

       public static void uniqueThreeDigitNumbers(){
        int amount = 0;
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                for(int k = 1; k <= 4; k++){
                    if(k != i && k != j && i != j){
                        amount++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
    }

    public static void count(String x){
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for(int i = 0; i < x.length(); i++){
            if(Character.isLetter(ch[i])){
                letter ++ ;
            }
            else if(Character.isDigit(ch[i])){
                num ++ ;
            }
            else if(Character.isSpaceChar(ch[i])){
                space ++ ;
            }
            else{
                other ++;
            }
        }
        System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
    }
}
