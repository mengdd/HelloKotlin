package interop;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JavaUtils {

    @NotNull
    public static String getStringOne() {
        return "hello";
    }

    @Nullable
    public static String getStringTwo() {
        return null;
    }

    public interface Operation {
        int doCalculate(int left, int right);
    }

    public static int calculate(int firstNumber, int secondNumber, Operation operation) {
        return operation.doCalculate(firstNumber, secondNumber);
    }
}
