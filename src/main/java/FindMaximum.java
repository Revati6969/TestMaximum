public class FindMaximum {

    public static Integer maximumInteger(Integer firstValue, Integer secondValue, Integer thirdValue) {
        Integer maximumValue = firstValue;
        if(secondValue.compareTo(maximumValue) > 0)
            maximumValue = secondValue;
        if (thirdValue.compareTo(maximumValue) > 0)
            maximumValue = thirdValue;
        return maximumValue;
    }

}
