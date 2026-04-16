/**
 * Class for testing the program
 *
 * @author Suna Aregay
 * @see <a href="{https://github.com/suna2km/CalculatorApp</a>
 */
public class TestBench {
    public static void main(String[] args) {

        AdvanceCalc advCalc = new AdvanceCalc();

        advCalc.add(10.22);
        advCalc.subtract(2.22);
        advCalc.memoryAdd();
        advCalc.multiply(10);
        advCalc.memorySubtract();
        advCalc.divide(2);
        advCalc.setPrecision(4);
        advCalc.pow(2);
        advCalc.sqrt();
        advCalc.add(advCalc.getMemoryValue());
        advCalc.memoryClear();
        advCalc.clear();
    }
}