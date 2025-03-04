package bai1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TinhTong {
    public int tongChuoi(int[] arr){
    int sum = 0;
    for(int num:arr){
        sum += num;
    }
    return sum;
    }

    @Test
    void testTongChuoi(){
        TinhTong test = new TinhTong();

        Assertions.assertEquals(10,test.tongChuoi(new int[]{1,2,3,4}));
        Assertions.assertEquals(0,test.tongChuoi(new int[]{}));
        Assertions.assertEquals(-10,test.tongChuoi(new int[]{-1,-2,-3,-4}));
        Assertions.assertEquals(5,test.tongChuoi(new int[]{5}));
    }
}
