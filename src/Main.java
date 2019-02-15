import com.zubiri.sequenceofchars.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a char sequence");
		String userString = sc.nextLine();
		SequenceOfChars sequenceOfChars = new SequenceOfChars(userString);
		boolean finished = false;
		while (!finished) {
			System.out.println(
					"Enter a possible option:\n1.- Get the length\n2.- Enter two indexes and then get the subsequence between them\n3.- Enter an index and get the char at this position\n4.- Get the char sequence entered\n5.- Change the char sequence\n0.- Quit");
			String option = sc.nextLine();
			switch (option) {
			case "1":
				System.out.println(sequenceOfChars.length());
				break;
			case "2":
				System.out.println("Enter the first index");
				int start = sc.nextInt();
				sc.hasNextLine();
				System.out.println("Enter the second index");
				int end = sc.nextInt();
				sc.nextLine();
				System.out.println(sequenceOfChars.subSequence(start, end));
				break;
			case "3":
				System.out.println("Enter the index");
				int index = sc.nextInt();
				System.out.println(sequenceOfChars.charAt(index));
				break;
			case "4":
				System.out.println(sequenceOfChars.getCharSequence());
				break;
			case "5":
				System.out.println("Enter the new char sequence");
				userString=sc.nextLine();
				sequenceOfChars.setCharSequence(userString);
				break;
			case "0":
				finished=true;
				break;
			default:
				System.out.println("Enter a possible option");
				break;
			}
		}
		sc.close();
	}
}
