public class Values {
    public static void main(String[] args) {
        byte byteValue = 12;
        short shortValue = 67;
        int intValue = 789;
        long longValue = 123456789L;
        float floatValue = 100.6F;
        double doubleValue = 420.69;
        boolean booleanValue = true;
        char charValue = 'A';

        printInfo("byte", byteValue, Byte.BYTES);
        printInfo("short", shortValue, Short.BYTES);
        printInfo("int", intValue, Integer.BYTES);
        printInfo("long", longValue, Long.BYTES);
        printInfo("float", floatValue, Float.BYTES);
        printInfo("double", doubleValue, Double.BYTES);
        printInfo("boolean", booleanValue, -1);
        printInfo("char", charValue, Character.BYTES);
    }

    private static void printInfo(String type, Object value, int primitiveSize) {
        String stringValue = String.valueOf(value);
        int stringLength = stringValue.length();
        int stringBytes = stringValue.getBytes().length;

        System.out.println("Type: " + type);
        System.out.println("Value: " + value);
        System.out.println("String Length: " + stringLength);
        System.out.println("String Bytes: " + stringBytes);
        System.out.println("Primitive Bytes: " + (primitiveSize == -1 ? "N/A" : primitiveSize));
        System.out.println("-------------");
    }
}
