package ciphertools.enigmacipher.utils;

/**
 * 
 * @author wpnx777
 *
 */
public class Rotor {
    private Alphabet alphabet = new Alphabet();
    private char[] alphabetArray = alphabet.getAlphabet();
    private int rotorIndex;
    private int stepOffset;

    /**
     * 
     */
    public Rotor() {
        rotorIndex = 0;
        stepOffset = 0;
    }

    /**
     * 
     * @return
     */
    public int getRotorIndex() {
        return rotorIndex;
    }
    
    public int getStepOffset() {
    	return stepOffset;
    }
    
    /**
     * 
     * @param rotorIndex
     * @return
     */
    public char charAt(int rotorIndex) {
        return alphabetArray[rotorIndex];
    }

    /**
     * 
     * @param rotorIndex
     */
    public void setRotorIndex(int rotorIndex) {
        this.rotorIndex = rotorIndex;
    }

    public void setStepOffset(int stepOffset) {
    	this.stepOffset = stepOffset;
    }
    
    /**
     * 
     */
    public void step() {
        if (rotorIndex == (Alphabet.NUM_LETTERS_IN_ALPHABET - 1)) {
            setRotorIndex(0);
        } else {
            setRotorIndex(rotorIndex + 1);
        }
    }
}//End Class