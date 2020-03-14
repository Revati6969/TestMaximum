import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    FindMaximum maximum;

    @Test
    public void givenIntegers_WhenProper_ReturnMaximum() {
        maximum = new FindMaximum();
        Integer[] array = {4, 7, 2};
        Integer maxIntegers = maximum.maximumInteger(array);
        Assert.assertEquals(7, (int) maxIntegers);
    }
}
