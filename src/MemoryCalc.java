/**
 * Extends the Calculator class to provide memory functionality.
 *
 * @author Suna Aregay
 */
public class MemoryCalc extends Calculator{

    /** Stores the value in memory */
    protected double memoryValue;

    /**
     * Default constructor.
     */
    public MemoryCalc(){
        super();
    }

    /** Clears the memory value. */
    public void memoryClear(){
        memoryValue = 0;
        displayMemoryValue("Memory Cleared");
    }

    /** Adds the current value to memory. */
    public void memoryAdd(){
        memoryValue += currentValue;
        displayMemoryValue("Memory Add");
    }

    /** Subtracts the current value from memory. */
    public void memorySubtract(){
        memoryValue -= currentValue;
        displayMemoryValue("Memory Subtract");
    }

    /**
     * Returns the current memory value.
     * @return memory value
     */
    public double getMemoryValue(){
        System.out.println("Using memory value");
        return memoryValue;
    }

    /**
     * Displays the memory value.
     * @param phrase description of the memory operation
     */
    public void displayMemoryValue(String phrase){
        System.out.printf("%-15s %,12.2f%n", phrase, memoryValue);
    }

}
