import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class TestVariant6 {

    @Test(dataProvider = "integerProvider")
    public void integerTest(int p1, int[] p3){
        assertEquals(new Variant6().aInteger(p1), p3);
    }

    @DataProvider
    public Object[][] integerProvider(){
        return new Object[][] {{24,new int[]{2,4}}};
    }

    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int p1, int p2, int p3, boolean p4){
        assertEquals(new Variant6().aBoolean(p1,p2,p3), p4);
    }

    @DataProvider
    public Object[][] booleanProvider(){
        return new Object[][] {{3,4,5,true}};
    }

    @Test(dataProvider = "ifProvider")
    public void ifTest(int p1, int p2, int p3){
        assertEquals(new Variant6().MinMax(p1,p2), p3);
    }

    @DataProvider
    public Object[][] ifProvider(){
        return new Object[][] {{2,4,4}};
    }

    @Test(dataProvider = "switchProvider")
    public void switchTest(double p1, int p2, double p3){
        assertEquals(new Variant6().Mass(p1, p2), p3);
    }

    @DataProvider
    public Object[][] switchProvider(){
        return new Object[][] {{2,2,2000.0}};
    }

    @Test(dataProvider = "whileProvider")
    public void whileTest(int p1, int p2){
        assertEquals(new Variant6().doubleFact(p1), p2);
    }

    @DataProvider
    public Object[][] whileProvider(){
        return new Object[][] {{4,8}};
    }

    @Test(dataProvider = "MassProvider")
    public void massTest(int[] ar){
        int[] a = {7,9,16};
        assertEquals(new Variant6().arr(7,9,3), a);
    }
    @DataProvider
    public Object[][] massProvider(){
        return new Object[][] {{7,9,16}};
    }
}
