import java.util.Scanner;
//Class to run custom user input
public class Runner {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter text");
		//takes in user input through the console
		String input = console.nextLine();
		Encrypter e = new Encrypter(input);
		System.out.print(e.encoded);
	}
}
