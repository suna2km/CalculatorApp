public class AdvanceCalc <N extends Number> extends MemoryCalc implements AdvanceMath<N> {

    public int precisionValue;

    public AdvanceCalc() {
        super();
        precisionValue = 4;
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
        operator = '\u221A';
        previousValue = currentValue;
        currentValue = Math.pow(this.currentValue, inputValue.doubleValue());
        updateDisplay();
    }

    @Override
    public void updateDisplay(){
        String format1 =" %,12." + previousValue +"f%n";
    }
}
