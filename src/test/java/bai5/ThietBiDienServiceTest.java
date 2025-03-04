package bai5;

import org.example.ontap2.ThietBiDien;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ThietBiDienServiceTest {
    private ThietBiDienService thietBiDienService;

    @BeforeEach
    void setup(){
        thietBiDienService = new ThietBiDienService();
    }

    @Test
    void testThemThietBi_Valid(){
        ThietBiDien tb = new ThietBiDien("TB001","Đèn Led",100.5f,12,5,"Philips");
        Assertions.assertTrue(thietBiDienService.them(tb));
    }

    @Test
    void testThemThietBi_Invalid_Gia_Am() {
        ThietBiDien tb = new ThietBiDien("TB02", "Quạt", -50.0f, 12, 10, "Sony");
        Assertions.assertFalse(thietBiDienService.them(tb));
    }

    @Test
    void testSuaThietBi_Valid() {
        ThietBiDien tb = new ThietBiDien("TB03", "Máy lạnh", 5000.0f, 24, 3, "LG");
        thietBiDienService.them(tb);
        ThietBiDien tbMoi = new ThietBiDien("TB03", "Máy lạnh", 4500.0f, 24, 4, "LG");
        Assertions.assertTrue(thietBiDienService.suaThietBi("TB03", tbMoi));
    }

    @Test
    void testSuaThietBi_Invalid_NotFound() {
        ThietBiDien tbMoi = new ThietBiDien("TB04", "TV", 2000.0f, 18, 2, "Samsung");
        Assertions.assertFalse(thietBiDienService.suaThietBi("TB04", tbMoi));
    }

    @Test
    void testXoaThietBi_Valid() {
        ThietBiDien tb = new ThietBiDien("TB05", "Loa", 300.0f, 6, 10, "Bose");
        thietBiDienService.them(tb);
        Assertions.assertTrue(thietBiDienService.xoaThietBi("TB05"));
    }

    @Test
    void testXoaThietBi_NotFound() {
        Assertions.assertFalse(thietBiDienService.xoaThietBi("TB06"));
    }
}
