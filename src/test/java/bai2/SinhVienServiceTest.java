package bai2;

import org.example.ontap1.bai2.SinhVien;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SinhVienServiceTest {
    SinhVienService service = new SinhVienService();

    @Test
    void testSinhVien(){
        SinhVien sv = new SinhVien("SV001","Phan Tuấn Anh",18,8.3f,2,"CNTT");
        SinhVien updateSinhVien = service.suaSinhVien(sv,"Mai Đình To",91,1.2f,1,"Marketing");

        Assertions.assertEquals("Mai Đình To",updateSinhVien.getTen());
        Assertions.assertEquals(91,updateSinhVien.getTuoi());
        Assertions.assertEquals(1.2f,updateSinhVien.getDiemTrungBinh());
        Assertions.assertEquals(1,updateSinhVien.getKyHoc());
        Assertions.assertEquals("Marketing",updateSinhVien.getChuyenNganh());
    }

    @Test
    void testTrong(){
        SinhVien sv = new SinhVien("SV001","Phan Tuấn Anh",18,8.3f,2,"CNTT");

        try {
            service.suaSinhVien(sv, "", 12, 8.0f, 4, "An ninh mạng");
        } catch (IllegalArgumentException ex) {
            System.out.println("Test Error Message: " + ex.getMessage());
            Assertions.assertEquals("Tên sinh viên không được để trống", ex.getMessage());
        }

        try {
            service.suaSinhVien(sv, "Mai Đình Dái to", -1, 1.0f, 3, "Cướp");
        } catch (IllegalArgumentException ex) {
            System.out.println("Test Error Message: " + ex.getMessage());
            Assertions.assertEquals("Tuổi phải lớn hơn 0", ex.getMessage());
        }

        try {
            service.suaSinhVien(sv, "Mai Đình Dái bé", 1, -1.0f, 3, "Cướp");
        } catch (IllegalArgumentException ex) {
            System.out.println("Test Error Message: " + ex.getMessage());
            Assertions.assertEquals("Điểm trung bình không được âm", ex.getMessage());
        }
    }
}
