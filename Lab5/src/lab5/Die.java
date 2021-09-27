package lab5;
public class Die {
    // Instance fields for Die class
    // Value for dieSides gets supplied by constructor
    // faceValue is given a default value of '1' for a given Die object.
    private int dieSides;
    private int faceValue = 1;
    
    // Constructor w/ int parameter for dieSides
    public Die(int dieSides) {
        // dieSides instance field supplied with the object argument.
        this.dieSides = dieSides;
    }
    
    // 'Roll' method. Returns an integer value.
    public int roll() {
        // Random face value chosen, and overrides default value of 'faceValue'. 
        // Incremented by one so that first side isn't 0.
        // Method returns faceValue
        faceValue = (int)(Math.random() * dieSides) + 1;
        return faceValue;
    }
    // 'Getter' method returns the value stored in 'faceValue'.
    public int getFaceValue() {
        return faceValue;
    }

    // 'Getter' method returns the value stored in 'dieSies'.
    public int getNumFaces() {
        return dieSides;
    }
    // This String method returns the values of 'dieSides' and 'faceValue' in a string with formatting
    // e.g. (d4 = 3)
    public String toString() {
        return ("d" + dieSides + " = " + faceValue);
    }
}
