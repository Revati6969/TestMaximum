public class FindMaximum {

    public Integer maximumInteger(Integer[] array) {
        Integer maximum = 0;
        for(Integer integer: array)
        {
            if(integer.compareTo(maximum)>0)
                maximum = integer;
        }
        return maximum;
    }

}
