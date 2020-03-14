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

    @Test
    public void givenFloats_WhenMaxAtOne_ReturnMaximum() {
        maximum = new FindMaximum();
        Float max = maximum.maximumFloat(5.2f, 2.5f, 3.6f);
        Assert.assertEquals((Float) 5.2f, max);
    }

    @Test
    public void givenFloats_WhenMaxAtwo_ReturnMaximum() {
        maximum = new FindMaximum();
        Float max = maximum.maximumFloat(3.6f, 5.2f, 2.5f);
        Assert.assertEquals((Float) 5.2f, max);
    }

    @Test
    public void givenFloats_WhenMaxAtThree_ReturnMaximum() {
        maximum = new FindMaximum();
        Float max = maximum.maximumFloat(2.5f, 3.6f, 5.2f);
        Assert.assertEquals((Float) 5.2f, max);
    }

}
