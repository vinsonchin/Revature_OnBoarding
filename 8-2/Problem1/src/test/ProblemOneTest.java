import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProblemOneTest {

    ProblemOne sut;

    @Before
    public void setUpTest() {
        sut = new ProblemOne();
    }

    @After
    public void tearDownTest() {
        sut = null;
    }

    @Test
    public void test1() {

        String a = "Minneapolis";
        String b = "Minnesota";
        int expected = 5;

        int actual = sut.LCS(a,b);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test2() {

        String a = "abcd";
        String b = "abbcd";
        int expected = 3;

        int actual = sut.LCS(a,b);

        Assert.assertEquals(expected,actual);
    }
}
