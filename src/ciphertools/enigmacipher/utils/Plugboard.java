package ciphertools.enigmacipher.utils;

import java.util.*;

/**
 * 
 * @author wpnx777
 *
 */
public class Plugboard {
	public static final int MAX_PLUGS = 10;
	private ArrayList<Plug> plugboard = new ArrayList<Plug>();

	/**
	 * Default Class Constructor.
	 */
	public Plugboard() {
	}// End Method
	
	public Plugboard(ArrayList<Plug> plugboard) {
		this.plugboard = plugboard;
	}//End Method

	/**
	 * This method takes two characters and validates if they can be used to
	 * create a valid plug for the plugboard.
	 * 
	 * @param subChar1
	 *            The first character in the perspective plug.
	 * @param subChar2
	 *            The second character in the perspective plug.
	 * @return True/False depending on if the input provided is valid for
	 *         creating a plug.
	 */
	public boolean isValidInput(char subChar1, char subChar2) {
		boolean isValidInput = false;
		
		char tmpSubChar1 = Character.toUpperCase(subChar1);
		char tmpSubChar2 = Character.toUpperCase(subChar2);

		System.out.println("DEBUG: Testing characters [" + tmpSubChar1 + "," +
		                   tmpSubChar2 + "].");

		if (tmpSubChar1 == tmpSubChar2) {
			System.out.println("ERROR: A plug must consist of 2 different " +
		                       "characters.\n");
		} else {
			if ((tmpSubChar1 < Alphabet.ASCII_UPPER_CASE_LETTER_START
					|| tmpSubChar1 > Alphabet.ASCII_LOWER_CASE_LETTER_END)
					|| (tmpSubChar2 < Alphabet.ASCII_UPPER_CASE_LETTER_START
					|| tmpSubChar2 > Alphabet.ASCII_LOWER_CASE_LETTER_END)) {
				System.out.println("ERROR: Only Alphabetical characters are " +
					               "allowed as input.\n");
			} else {
				isValidInput = true;
				System.out.println("DEBUG: Input set [" + tmpSubChar1 + "," +
				                   tmpSubChar2 + "] is valid.");
			} // End else
		} // End if
		
		return isValidInput;
	}// End Method

	/**
	 * 
	 * @param newPlug
	 * @return True/False depending on if a plug with the same values as newPlug
	 *         already exists.
	 */
	public boolean plugExists(Plug newPlug) {
		boolean plugExists = false;

		for (int i = 0; i < plugboard.size(); i++) {
			if (newPlug.getSubChar1() == plugboard.get(i).getSubChar1()
			    && newPlug.getSubChar2() == plugboard.get(i).getSubChar2()) {
				plugExists = true;
				System.out.println("ERROR: A plug with value [" +
				                   plugboard.get(i).getSubChar1() + "," +
						           plugboard.get(i).getSubChar2() + "] " +
				                   "already exists.\n");
			} // End if
		} // End for

		if (!plugExists) {
			System.out.println("DEBUG: Plug [" + newPlug.getSubChar1() + "," +
		                       newPlug.getSubChar2() + "] is unique.");
		} // End if

		return plugExists;
	}// End Method

	/**
	 * 
	 * @param subChar1
	 * @param subChar2
	 */
	public boolean addPlug(char subChar1, char subChar2) {
		boolean plugAdded = false;
		
		if (plugboard.size() < MAX_PLUGS) {
			if (isValidInput(subChar1, subChar2)) {
				Plug newPlug = new Plug(subChar1, subChar2, plugboard.size());

				if (!plugExists(newPlug)) {
					plugboard.add(newPlug);
					plugAdded = true;
					System.out.println("DEBUG: Plug [" + newPlug.getSubChar1() +
							           "," + newPlug.getSubChar2() +
							           "] created.\n");
				} // End if
			} // End if
		} else {
			System.out.println("ERROR: No new plugs can be added to the " +
		                       "plugboard as it has reached it's maximum " +
					           "capacity.\n");
		} // End else
		
		return plugAdded;
	}// End Method

	public boolean removePlug(Plug plug) {
		boolean plugRemoved = false;
		
		if(plugExists(plug)) {
			plugboard.remove(getIndex(plug));
			plugRemoved = true;
		}//End if
		
		return plugRemoved;
	}//End Method
	
	public int getIndex(Plug plug) {
		int index = 0;
		
		
		
		return index;
	}
	
	public void sort() {
		
	}
	
	/**
	 * This method prints out all the plugs contained in the plugboard.
	 */
	public void print() {
		for (int i = 0; i < plugboard.size(); i++) {
			if (i < 9) {
				System.out.println("Plugboard 0" + (i + 1) + ": " +
			                       plugboard.get(i).getSubChar1() + " --> " +
						           plugboard.get(i).getSubChar2());
			} else {
				System.out.println("Plugboard " + (i + 1) + ": " +
			                       plugboard.get(i).getSubChar1() + " --> " +
						           plugboard.get(i).getSubChar2());
			}
		} // End for
	}// End Method
}// End Class