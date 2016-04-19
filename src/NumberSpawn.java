import java.util.Scanner;

public class NumberSpawn {

	public static void main(String[] args) {

		NumberGen game = new NumberGen();
		int Guess = 0;
		while (game.Play <= 20) {
			
			int random = (int) (Math.random() * 6 + 1);
			Scanner input = new Scanner(System.in);
			System.out.println();
			System.out.println("Games Played="+game.GamesPlayed+" Wins="+game.PlayerWin+" Number of Even="+game.Even+" Number of Odds="+game.Odd);
			System.out.println("Is the generated number odd or even? 1=odd 2=even");
			Guess = input.nextInt();

			if (((random == 1) || (random == 3) || (random == 5)) && (Guess == 1)) {
				game.Play++;
				game.Odd++;
				game.GamesPlayed++;
				game.PlayerWin++;
				System.out.println("Correct the answer was Odd " + random);
			} else if (((random == 1) || (random == 3) || (random == 5)) && (Guess == 2)) {
				game.Play++;
				game.Odd++;
				game.GamesPlayed++;
				System.out.println("Incorrect the answer was Odd " + random);
			} else if (((random == 2) || (random == 4) || (random == 6)) && (Guess == 2)) {
				game.Play++;
				game.Even++;
				game.GamesPlayed++;
				game.PlayerWin++;
				System.out.println("Correct the answer was Even " + random);
			} else if (((random == 2) || (random == 4) || (random == 6)) && (Guess == 1)) {
				game.Play++;
				game.Even++;
				game.GamesPlayed++;
				System.out.println("Inorrect the answer was even " + random);
			}
			else {
				System.out.println("enter a valid number");
			}
		}
	}
}
