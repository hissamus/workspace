import java.util.Hashtable;

import javax.swing.JOptionPane;

public class FindFirstNonRepeated {

	public FindFirstNonRepeated() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = "";
		boolean show = true;
		while (show && !userInput.equals("QQUIT")) {
			userInput = JOptionPane.showInputDialog("Enter capacity");
			System.out.println(FindFirstNonRepeated
					.findFirstNonRepeated(userInput));
		}

	}

	public static Character findFirstNonRepeated(String input) {
		// create a new hashtable:
		Hashtable<Character, Integer> hashChar = new Hashtable<>();

		int j, strLength;
		Character chr;
		Integer intgr;

		strLength = input.length();

		for (j = 0; j < strLength; j++) {
			chr = new Character(input.charAt(j));
			intgr = (Integer) hashChar.get(chr);
			if (intgr == null) {
				hashChar.put(chr, new Integer(1));
			} else {
				hashChar.put(chr, new Integer(intgr.intValue() + 1));
			}
		}

		/*
		 * go through hashtable and search for the first nonrepeated char:
		 */

		for (j = 0; j < strLength; j++) {
			chr = new Character(input.charAt(j));
			if (((Integer) hashChar.get(chr)).intValue() == 1)
				return chr;
		}
		/*
		 * this only returns if the loop above doesn't find a nonrepeated
		 * character.
		 */
		return null;

	}

}
