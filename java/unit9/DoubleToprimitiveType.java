package unit9;

public class DoubleToprimitiveType {
    public static void main(String[] args) {
        
        // Creationg a double class object
        Double d = new Double("6.9685");
        // Converting double to primitive type
        byte b = d.byteValue();
        short s= d.shortValue();
    int i=d.intValue();
    long l = d.longValue();
    float f=d.floatValue();
    double d1=d.doubleValue();
    System.out.println("Byte value: "+b);
    System.out.println("Short value: "+s);
    System.out.println("Int value: "+i);
    System.out.println("Long value: "+l);
    System.out.println("Float value: "+f);
    System.out.println("Double value: "+d1);

    }

}
