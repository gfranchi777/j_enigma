package ciphertools.enigmacipher.utils;

/*
 * 
 */
public class Plug {
    private char subChar1, subChar2;
    
    private int index;
    
    /*
     * 
     */
    public Plug() {
      
    }//End Method
    
    /*
     * 
     */
    public Plug(char subChar1, char subChar2) {
    	sortCharOrder(subChar1,subChar2);
    }//End Method
    
    /*
     * 
     */
    public Plug(char subChar1, char subChar2, int index) {
    	sortCharOrder(subChar1,subChar2);
    	setIndex(index);
    }
    
    /*
     * 
     */
    public void setChars(char subChar1, char subChar2) {
    	sortCharOrder(subChar1,subChar2);
    }//End Method
    
    /*
     * 
     */
    public void setIndex(int index) {
    	this.index = index;
    }//End Method
    
    /*
     * 
     */
    public char getSubChar1() {
    	return subChar1;
    }//End Method
    
    /*
     * 
     */
    public char getSubChar2() {
    	return subChar2;
    }//End Method
    
    /*
     * 
     */
    public int getIndex() {
    	return index;
    }//End Method
    
    /*
     * 
     */
    public void sortCharOrder(char subChar1, char subChar2) {
    	char tmpChar;
    	subChar1 = Character.toUpperCase(subChar1);
    	subChar2 = Character.toUpperCase(subChar2);
    	if(subChar1 > subChar2) {
    		tmpChar = subChar1;
    		this.subChar1 = subChar2;
    		this.subChar2 = tmpChar;
    	} else {
    		this.subChar1 = subChar1;
    		this.subChar2 = subChar2;
    	}//End Else
    }//End Method
}//End Class
