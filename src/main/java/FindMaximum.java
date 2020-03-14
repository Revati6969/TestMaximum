public class FindMaximum {
    //Find maximum from all three different datatypes
    public static <E extends Comparable> E checkMaximum(E first, E second, E third) {

        E maximum = first;

        if (second.compareTo(maximum) > 0)
            maximum = second;
        if (third.compareTo(maximum) > 0)
            maximum = third;

        return maximum;
    }
}
