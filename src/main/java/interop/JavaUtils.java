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
}
