import org.junit.Assert;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Create by hieuduong on 10/21/17
 */
public class MainTest {
    @org.junit.Test
    public void main() throws Exception {
        ArrayList<Double> list = new ArrayList<Double>();
        for(int i=1;i<6;i++){
            list.add(Double.parseDouble(i+""));
        }
        double expected = 15.0;

        Assert.assertEquals("Error", expected, Main.sum(list), 0.0);

    }

}