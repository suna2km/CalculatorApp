public abstract class Calculator <N extends Number> implements BasicMath <N> {

    protected double previousValue;
    protected double inputValue;
    protected double currentValue;
    protected char operator;

    public Calculator() {
        System.out.println("Calculator is on");
        clear();
    }
    public void clear () {
        previousValue = 0;
        inputValue = 0;
        currentValue = 0;
        operator = '+';
        System.out.println("Calculator cleared");
    }


    @Override
    public void add(N inputValue){
        operator = '+';
        previousValue = currentValue;
        this.inputValue = inputValue.doubleValue();
        currentValue += this.inputValue;
        updateDisplay();
    }
    @Override
    public void subtract(N inputValue){
        operator = '-';
        previousValue = currentValue;
        this.inputValue = inputValue.doubleValue();
        currentValue -= this.inputValue;
        updateDisplay();
    }
    @Override
    public void multiply(N inputValue){
        operator = '*';
        previousValue = currentValue;
        this.inputValue = inputValue.doubleValue();
        currentValue *= this.inputValue;
        updateDisplay();
    }
    @Override
    public void divide(N inputValue){
        operator = '/';
        previousValue = currentValue;
        this.inputValue = inputValue.doubleValue();
        currentValue /= this.inputValue;
        updateDisplay();
    }

    public void updateDisplay() {
        System.out.println();
        System.out.printf(" %,12.2f%n", previousValue);
        System.out.printf("%1s%,12.2f%n", operator, inputValue);
        System.out.println("==================");
        System.out.printf(" %,12.2f%n", currentValue);
        System.out.println();

    }
}
