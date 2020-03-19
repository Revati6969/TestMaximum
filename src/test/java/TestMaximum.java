import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    FindMaximum maximum;

    @Test
    public void givenIntegers_WhenMaxAtOne_ReturnMaximum() {
        maximum = new FindMaximum(5, 2, 3);
        Integer max = (Integer) maximum.checkMaximum();
        Assert.assertEquals((Integer) 5, max);
    }

    @Test
    public void givenIntegers_WhenMaxAtTwo_ReturnMaximum() {
        maximum = new FindMaximum(2, 5, 3);
        Integer max = (Integer) maximum.checkMaximum();
        Assert.assertEquals((Integer) 5, max);
    }

    @Test
    public void givenIntegers_WhenMaxAtThree_ReturnMaximum() {
        maximum = new FindMaximum(2, 3, 5);
        Integer max = (Integer) maximum.checkMaximum();
        Assert.assertEquals((Integer) 5, max);
    }

    @Test
    public void givenFloats_WhenMaxAtOne_ReturnMaximum() {
        maximum = new FindMaximum(5.2f, 2.5f, 3.4f);
        Float max = (Float) maximum.checkMaximum();
        Assert.assertEquals((Float) 5.2f, max);
    }

    @Test
    public void givenFloats_WhenMaxATwo_ReturnMaximum() {
        maximum = new FindMaximum(2.5f, 5.2f, 3.4f);
        Float max = (Float) maximum.checkMaximum();
        Assert.assertEquals((Float) 5.2f, max);
    }

    @Test
    public void givenFloats_WhenMaxAtThree_ReturnMaximum() {
        maximum = new FindMaximum(2.5f, 3.4f, 5.2f);
        Float max = (Float) maximum.checkMaximum();
        Assert.assertEquals((Float) 5.2f, max);
    }

    @Test
    public void givenStrings_WhenMaxAtOne_ReturnMaximum() {
        maximum = new FindMaximum("7", "5", "1");
        String max = (String) maximum.checkMaximum();
        Assert.assertEquals("7", max);
    }

    @Test
    public void givenStrings_WhenMaxAtTwo_ReturnMaximum() {
        maximum = new FindMaximum("5", "7", "1");
        String max = (String) maximum.checkMaximum();
        Assert.assertEquals("7", max);
    }

    @Test
    public void givenStrings_WhenMaxAtThree_ReturnMaximum() {
        maximum = new FindMaximum("3", "5", "7");
        String max = (String) maximum.checkMaximum();
        Assert.assertEquals("7", max);
    }
}


