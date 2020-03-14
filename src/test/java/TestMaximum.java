import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    FindMaximum maximum;

    @Test
    public void givenIntegers_WhenMaxAtOne_ReturnMaximum() {
        maximum = new FindMaximum();
        int maxIntegers = maximum.checkMaximum(5, 2, 3);
        Assert.assertEquals(5, maxIntegers);
    }

    @Test
    public void givenIntegers_WhenMaxAtTwo_ReturnMaximum() {
        maximum = new FindMaximum();
        int maxIntegers = maximum.checkMaximum(2, 5, 3);
        Assert.assertEquals(5, maxIntegers);
    }

    @Test
    public void givenIntegers_WhenMaxAtThree_ReturnMaximum() {
        maximum = new FindMaximum();
        int maxIntegers = maximum.checkMaximum(3, 3, 5);
        Assert.assertEquals(5, maxIntegers);
    }
    @Test
    public void givenFloats_WhenMaxAtOne_ReturnMaximum() {
        maximum = new FindMaximum();
        Float max = maximum.checkMaximum(5.2f, 2.5f, 3.6f);
        Assert.assertEquals((Float) 5.2f, max);
    }

    @Test
    public void givenFloats_WhenMaxATwo_ReturnMaximum() {
        maximum = new FindMaximum();
        Float max = maximum.checkMaximum(3.6f, 5.2f, 2.5f);
        Assert.assertEquals((Float) 5.2f, max);
    }

    @Test
    public void givenFloats_WhenMaxAtThree_ReturnMaximum() {
        maximum = new FindMaximum();
        Float max = maximum.checkMaximum(2.5f, 3.6f, 5.2f);
        Assert.assertEquals((Float) 5.2f, max);
    }

    @Test
    public void givenStrings_WhenMaxAtOne_ReturnMaximum() {
        maximum = new FindMaximum();
        String max = maximum.checkMaximum("7", "5", "3");
        Assert.assertEquals("7", max);
    }

    @Test
    public void givenStrings_WhenMaxAtTwo_ReturnMaximum() {
        maximum = new FindMaximum();
        String max = maximum.checkMaximum("5", "7", "3");
        Assert.assertEquals("7", max);
    }

    @Test
    public void givenStrings_WhenMaxAtThree_ReturnMaximum() {
        maximum = new FindMaximum();
        String max = maximum.checkMaximum("3", "5", "7");
        Assert.assertEquals("7", max);
    }

}
