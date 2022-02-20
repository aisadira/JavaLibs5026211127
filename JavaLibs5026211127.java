import javax.swing.*;

public class JavaLibs5026211127{

	public static void main(String[] args)	{
		String welcome;
		JOptionPane.showMessageDialog(null, "Welcome! we will rate your music taste, get ready!");
		String name = JOptionPane.showInputDialog(null, "Please insert your name");
		String year = JOptionPane.showInputDialog(null, "What year were you born in?");
		String classic = JOptionPane.showInputDialog(null, "What is your go to classic song to wake up to?");
		String genre = JOptionPane.showInputDialog(null, "That one genre of song you just can't listen to");
		String TSwift = JOptionPane.showInputDialog(null, "What is your favorite song from Taylor Swift?");
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "From 1-5 my friends will rate my music taste as"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "From 1-5 rate The Weekend's newest album (Dawn FM)"));
		double num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "From 1-5 rate how good tiktok songs are"));
		double num4 = Double.parseDouble(JOptionPane.showInputDialog("From 1-5 rate All too well (10 Minutes Version)(Taylor's Version)(From The Vault)"));
		String thought = JOptionPane.showInputDialog(null, "I think this artist deserve more recognition");
		String recommend1 = JOptionPane.showInputDialog(null, "The best album of all time goes to");
		String recommend2 = JOptionPane.showInputDialog(null, "Here is a song that everyone should listen to on a bad day");
		int sum1 = num1+num2;
		double sum2 = num3+num4;
		System.out.println("Hi " +name+ " okay.. this is tough. Your music taste is.. bearable, for a person who is born in " +year);
		System.out.println("Although " +classic+ " is a good song, we all know it's not a classic, but we'll let that pass");
		System.out.println("I predict in your past life you probably have a feud with " +thought+ " and now your karma makes it hard for you to listen to a song under the genre " +genre);
		System.out.println("Out of all that, we understand why you like " +TSwift+ " But rating ALTWTMVTVFTV a " +num4+ " you gotta be joking?");
		System.out.println("Saying "+recommend1+ " is the best album of all time and recommending " +recommend2+ " to us and actually liking that song? you're okay right?");
		System.out.println("After the short commentary here is the most awaited part *drum roll please*");
		System.out.println("We have rated that your music taste is a solid " +sum1+ " although you need to give your playlist an update cause the score is a.." +sum2);
		System.out.println("BUT thank you for giving us a new song recommendation we appreciate it, see you next time!!");

	}
}