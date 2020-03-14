public class FindMaximum {

    //Maximum form three integers
    public static Integer maximumInteger(Integer first, Integer second, Integer third) {
        Integer maximum = first;

        if(second.compareTo(maximum) > 0)
            maximum = second; //second is larger
        if (third.compareTo(maximum) > 0)
            maximum = third; //third is larger
        return maximum;
    }
    //Maximum from floats
    public static Float maximumFloat(Float first, Float second, Float third) {
        Float maximum = first;
        if(second.compareTo(maximum) > 0)
            maximum = second;//second is larger
        if (third.compareTo(maximum) > 0)
            maximum = third;//third is larger
        return maximum;

    }
    //Maximum from strings
    public static String largeString(String first, String second, String third) {
        String large = first;

        if (second.compareTo(large) > 0)
            large = second;
        if (third.compareTo(large) > 0)
            large = third;
        return large;



    }
}
