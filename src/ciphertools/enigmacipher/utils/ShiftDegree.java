package ciphertools.enigmacipher.utils;

public class ShiftDegree {
    private byte shiftDegree; 

    public ShiftDegree() {

    } // End Method

    public ShiftDegree(byte shiftDegree) {
        setShiftDegree(shiftDegree);
    } // End Method

    // Accessor Method(s)

    public byte getShiftDegree() {
        return shiftDegree;
    } // End Method

    // Mutator Method(s)

    public void setShiftDegree(byte shiftDegree) {
        this.shiftDegree = shiftDegree;
    } // End Method
}// End Class