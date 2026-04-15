public class AdvanceCalc <N extends Number> extends MemoryCalc implements AdvanceMath<N> {

    protected int precision;

    public AdvanceCalc() {
        super();
        setPrecision(4);
    }

    public void setPrecision(int precision) {
        if (precision < 0 || precision > 10)
            throw new IllegalArgumentException("Precision must be between 0 and 10");
        this.precision = precision;

        System.out.println("Calculator precision is " + precision + " decimal places.");
    }

    @Override
    public void sqrt() {
        operator = '\u221A';
        previousValue = currentValue;
        inputValue = 0.0;
        currentValue = Math.sqrt(this.currentValue);
        updateDisplay();
    }

    @Override
    public void pow(N inputValue) {
        operator = '^';
        previousValue = currentValue;
        currentValue = Math.pow(this.currentValue, inputValue.doubleValue());
        updateDisplay();
    }

    @Override
    public void updateDisplay(){
        String format1 =" %,12." + precision +"f%n"; //used to display just one value
        String format2 ="%1s%,12." + precision +"f%n"; //used to display the operator plus the inputValue

        if(operator == '\u221A') { //square root with no input value
            System.out.printf(format2, operator, previousValue);
        } else {
            System.out.printf(format1,previousValue);
            System.out.printf(format2,operator, inputValue);
        }

        System.out.println("=============");
        System.out.printf(format1,currentValue);
        System.out.println();

    }

    @Override
    public void displayMemoryValue(String phrase){
        String format3 ="%-15s %,12." + precision +"f%n";

        System.out.printf(format3, phrase, memoryValue);
        System.out.println();
    }

}
