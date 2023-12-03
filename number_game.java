import java.util.Scanner;
import java.lang.Math;
public class number_game {
  public static void guess_the_Number() {
  try(Scanner input = new Scanner(System.in)){
    int answer = (int)(Math.random() * 100) + 1;
    int k = 5;
    boolean correct = false;
    System.out.println("I'm thinking of a number between 1 and 100.\nYou have 5 tries to guess the number.");
    System.out.println("Correct Answer :"+answer);
    while (k > 0) {
      System.out.println("Enter your guess: ");
     int guess = input.nextInt();
      if (guess == answer) {
        System.out.println("You guessed the number!\nYou win!");
        correct = true;
        break;
      }
      else if (guess > answer) {
        System.out.println("Your guess is too high.\nYou have " + (k - 1) + " tries left.");
        k--;
      }
      else if (guess<answer){
        System.out.println("Your guess is too low.\nYou have " + (k - 1) + " tries left.");
      k--;
    }
}
    if (correct == false) {
      System.out.println("You ran out of tries.\nYou lose!");
      System.out.println("Correct Answer :"+answer);
    }
    if(k==5)
    System.out.println("Your Score is : 100 out of 100");
    else if(k==4)
    System.out.println("Your Score is : 80 out of 100");
    else if(k==3)
    System.out.println("Your Score is : 60 out of 100");
    else if(k==2)
    System.out.println("Your Score is : 40 out of 100");
    else if(k==1)
    System.out.println("Your Score is : 20 out of 100");
    else if(k==0)
    System.out.println("Your Score is : 0 out of 100");
   System.out.println("Do you want to play another round ? (y/n)");
   String a = input.next();
   if (a.equals("y") || a.equals("Y"))
   {
    guess_the_Number();
   }
   else
   {
    return;
   }
  }
}
public static void main(String[] args){
  guess_the_Number();
}
}

