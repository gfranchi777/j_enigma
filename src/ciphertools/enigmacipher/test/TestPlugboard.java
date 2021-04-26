package ciphertools.enigmacipher.test;

import  ciphertools.enigmacipher.utils.*;

/**
 * 
 * @author wpnx777
 *
 */
public class TestPlugboard {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Plugboard plugboard  =  new  Plugboard();
		
		plugboard.addPlug('a','b');
		plugboard.addPlug('a','b');
		plugboard.addPlug('b','a');
		plugboard.addPlug('a','a');
		plugboard.addPlug('a','1');
		plugboard.addPlug('a','$');
		
		char testChar = 'b';
		
		for(int i = 0; i < Plugboard.MAX_PLUGS; i++) {
			plugboard.addPlug((char)(testChar+1), (char)(testChar+3));
			testChar = (char)(testChar+2);
		}//End For
		
		plugboard.print();
	}//End Method
}//End Class
