import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProblemTwoTest {

    ProblemTwo sut;

    @Before
    public void setUp() {
        sut = new ProblemTwo();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void testMaxAndMin1() {

        int[] a = {7,5,6,1,4,2};
        int[] expected = {1,7};

        int[] actual = sut.maxAndMin(a);

        Assert.assertEquals(expected[0],actual[0]);
        Assert.assertEquals(expected[1],actual[1]);
    }

    @Test
    public void testMaxAndMin2() {

        int[] a = {5,3,1,2};
        int[] expected = {1,5};

        int[] actual = sut.maxAndMin(a);

        Assert.assertEquals(expected[0],actual[0]);
        Assert.assertEquals(expected[1],actual[1]);
    }

    @Test
    public void testMissing1() {

        int[] a = {7,5,6,1,4,2};
        int expected = 3;

        int actual = sut.missing(a);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testMissing2() {

        int[] a = {5,3,1,2};
        int expected = 4;

        int actual = sut.missing(a);

        Assert.assertEquals(expected,actual);
    }
}
