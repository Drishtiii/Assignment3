import java.util.*;

class Intro{
	String intro;
	
	 public Intro() {
		
		System.out.println("Welcome to the Guesser Game.");
		System.out.println();
		System.out.println("Here, Guesser guesses a number and rest all players guesses the guessed number");
		System.out.println("____________________________________");
	}
	
}

class Guesser{
	
	int numFromGuesser;
	
	int guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser kindly guess the number:");
		numFromGuesser=sc.nextInt();
		return numFromGuesser;
	}
	
	
}

class Player
{
	int guessNum1;
	int guessNum1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player1, kindly enter the number:");
		guessNum1=sc.nextInt();
		return guessNum1;
	}
	
	int guessNum2;
	int guessNum2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player2, kindly enter the number:");
		guessNum2=sc.nextInt();
		return guessNum2;
	}
	
	int guessNum3;
	int guessNum3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player, kindly enter the number:");
		guessNum3=sc.nextInt();
		return guessNum3;
	}
}

class Umpire{
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	
	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser=g.guessNum();
	}
	
	void collectNumFromPlayers() {
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum1();
		numFromPlayer2=p2.guessNum2();
		numFromPlayer3=p3.guessNum3();
	}
	
	void compare() {
		if(numFromGuesser == numFromPlayer1)
		{
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3)
			{
				System.out.println("All are winners, yay!");
			}
			else if(numFromGuesser == numFromPlayer2)
			{
				System.out.println("Player1 and Player2 won the game.");
			}
			else if(numFromGuesser == numFromPlayer3)
			{
				System.out.println("Player1 and Player3 won the game.");
			}
			else
			{
				System.out.println("Player1 won the game");
			}
		}
		
		else if(numFromGuesser == numFromPlayer2) {
			if(numFromGuesser == numFromPlayer3) {
				System.out.println("Player2 and Player3 won the game");
			}
			else
			{
				System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser == numFromPlayer3)
		{
			System.out.println("Player3 won the game");
		}
		
		else
		{
		System.out.println("Everybody lost their game. Please try again..");
		}
	
	}
}

public class GuesserGame{
	public static void main(String[] args) {
		Intro i=new Intro();
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
		
	}
}