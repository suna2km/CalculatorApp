/**
 * Interface defining basic arithmetic operations.
 *
 * @author Suna Aregay
 * @see <a href="{https://github.com/suna2km/CalculatorApp</a>
 * @param <N> numeric type
 */
public interface BasicMath <N extends Number> {
    void add(N inputValue);
    void subtract(N inputValue);
    void multiply(N inputValue);
    void divide(N inputValue);
}
