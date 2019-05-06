package helpers;

public class Assertions {

    public static void assertType(Object obj, Class tClass) {
        if (!tClass.isInstance(obj)) {
            throw new RuntimeException(
                    String.format(
                            "Expected %s, found %s!",
                            tClass,
                            obj.getClass()
                    )
            );
        }
    }

}
