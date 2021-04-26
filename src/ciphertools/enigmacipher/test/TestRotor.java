package ciphertools.enigmacipher.test;

import java.util.Random;

import ciphertools.enigmacipher.utils.*;

public class TestRotor {
    public static void main(String[] args) {
        Rotor[] rotor = new Rotor[6];
        int min = 0;
        int max = Alphabet.NUM_LETTERS_IN_ALPHABET - 1;
        Random random = new Random();

        for (int rotorNum = 0; rotorNum < rotor.length; rotorNum++) {
            rotor[rotorNum] = new Rotor();
            rotor[rotorNum].setRotorIndex(random.nextInt((max - min) + 1) 
            		                      + min);
            System.out.println("ROTOR NUM: " + rotorNum);
            for (int rotorIndex = 0; rotorIndex < 
            	Alphabet.NUM_LETTERS_IN_ALPHABET; rotorIndex++) {
                System.out.print("[" + rotor[rotorNum].getRotorIndex() + "," +
                                 rotor[rotorNum].charAt(rotor[rotorNum]
                                .getRotorIndex()) + "]");
                rotor[rotorNum].step();
            }//End for
            System.out.println();
        }//End for
    }//End main
}//End class