package bai4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChiaCho6 {
    public boolean chiaSo6(int a){
        return a%6 == 0;
    }

    @Test
    public void test(){
        Assertions.assertTrue(chiaSo6(6));
        Assertions.assertFalse(chiaSo6(9));
        Assertions.assertTrue(chiaSo6(0));
        Assertions.assertFalse(chiaSo6(-1));
    }
}
