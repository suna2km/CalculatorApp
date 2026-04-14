public class MemoryCalc  {

    protected double memoryValue;

    public MemoryCalc(){
        System.out.println("Using memory value");
        getMemoryValue();
        System.out.println("Memory cleared");
        memoryClear();
    }


    public void memoryAdd(){
        memoryValue += inputValue;
    }

    public void memorySubtract(){

    }

    public double getMemoryValue(){

    }

    public void displayMemoryValue(){

    }

    public void memoryClear(){
        memoryValue = 0;
        System.out.println("Memory Cleared ");
    }

}
