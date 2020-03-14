import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    FindMaximum maximum;

    @Test
    public void givenIntegers_WhenMaxAtOne_ReturnMaximum() {
        maximum = new FindMaximum();
        int maxIntegers = maximum.maximumInteger(5, 2, 3);
        Assert.assertEquals(5, maxIntegers);
    }

    @Test
    public void givenIntegers_WhenMaxAtTwo_ReturnMaximum() {
        maximum = new FindMaximum();
        int maxIntegers = maximum.maximumInteger(2, 5, 3);
        Assert.assertEquals(5, maxIntegers);
    }

    @Test
    public void givenIntegers_WhenMaxAtThree_ReturnMaximum() {
        maximum = new FindMaximum();
        int maxIntegers = maximum.maximumInteger(3, 3, 5);
        Assert.assertEquals(5, maxIntegers);
    }
}
