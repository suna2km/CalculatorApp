/**
 * Abstract base class representing a generic calculator.
 * Provides implementation for basic arithmetic operations
 * and maintains the calculator state.
 *
 * @author Suna Aregay
 * @see <a href="{https://github.com/suna2km/CalculatorApp</a>
 * @param <N> a numeric type that extends Number
 */
public abstract class Calculator <N extends Number> implements BasicMath <N> {

    /** Stores the previous value before an operation */
    protected double previousValue;

    /** Stores the input value provided by the user */
    protected double inputValue;

    /** Stores the current result of the calculator */
    protected double currentValue;

    /** Stores the last operator used */
    protected char operator;

    /**
     * Default constructor initializes the calculator.
     */
    public Calculator() {
        System.out.println("Calculator is on");
        clear();
    }

    /**
     * Resets all calculator values to default.
     */
    public void clear () {
        previousValue = 0;
        inputValue = 0;
        currentValue = 0;
        operator = '+';
        System.out.println("Calculator cleared");
    }

    /**
     * Adds the given value to the current value.
     * @param inputValue value to add
     */
    @Override
    public void add(N inputValue){
        operator = '+';
        previousValue = currentValue;
        this.inputValue = inputValue.doubleValue();
        currentValue += this.inputValue;
        updateDisplay();
    }

    /**
     * Subtracts the given value from the current value.
     * @param inputValue value to subtract
     */
    @Override
    public void subtract(N inputValue){
        operator = '-';
        previousValue = currentValue;
        this.inputValue = inputValue.doubleValue();
        currentValue -= this.inputValue;
        updateDisplay();
    }

    /**
     * Multiplies the current value by the given value.
     * @param inputValue value to multiply
     */
    @Override
    public void multiply(N inputValue){
        operator = '*';
        previousValue = currentValue;
        this.inputValue = inputValue.doubleValue();
        currentValue *= this.inputValue;
        updateDisplay();
    }

    /**
     * Divides the current value by the given value.
     * @param inputValue value to divide by
     */
    @Override
    public void divide(N inputValue){
        operator = '/';
        previousValue = currentValue;
        this.inputValue = inputValue.doubleValue();
        currentValue /= this.inputValue;
        updateDisplay();
    }

    /**
     * Displays the current calculation in a formatted output.
     */
    public void updateDisplay() {
        System.out.println();
        System.out.printf(" %,12.2f%n", previousValue);
        System.out.printf("%1s%,12.2f%n", operator, inputValue);
        System.out.println("==================");
        System.out.printf(" %,12.2f%n", currentValue);
        System.out.println();

    }
}
