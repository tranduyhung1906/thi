package b1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {
    public  int sumArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        
        int sum = 0;
        for (int num : arr) {
            if (sum % 8 == 0){
                sum += num;
            }

        }
        return sum ;
    }
    public List<Integer> chiahetcho6(int[] arr){
        if (arr == null){
            throw new IllegalArgumentException("ko bo chong");
        }
        List<Integer> list = new ArrayList<>();
        for ( int sum : arr){
            if (sum % 6==0){
                list.add(sum);

            }
        }
        return list;
    }
    public int tongmang(int[] arr){
        if (arr == null){
            throw new IllegalArgumentException("ko bo chong");
        }
     int sum =0;
        for (int num : arr){

                sum += num;

        }
        return sum  ;
    }
    @Test
    public void  kiemtongmang(){
        ArrayUtils tinh = new ArrayUtils();
        Assertions.assertEquals(12,tinh.tongmang(new  int[]{1,2,3,6}));
        Assertions.assertEquals(12,tinh.tongmang(new int[]{1,2,3,3,9}));
        Assertions.assertEquals(12,tinh.tongmang(new int[]{1,2,3,4,7,-1}));
    }
    @Test
    public void tongchicho8(){
        ArrayUtils tongchi8 = new ArrayUtils();
        Assertions.assertEquals(12,tongchi8.chiahetcho6(new int[]{6,0,12}));
    }
}

