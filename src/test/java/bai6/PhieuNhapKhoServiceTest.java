package bai6;

import org.example.ontap3.PhieuNhapKho;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhieuNhapKhoServiceTest {

    private PhieuNhapKhoService phieuNhapKhoService;

    @BeforeEach
    void setup(){
        phieuNhapKhoService = new PhieuNhapKhoService();
    }

    @Test
    void testThemPNK(){
        PhieuNhapKho pnk = new PhieuNhapKho("PNK001","NCC001",32.5f,"30-05-2025");
        Assertions.assertTrue(phieuNhapKhoService.them(pnk));
    }

    @Test
    void testXoa(){
        PhieuNhapKho pnk = new PhieuNhapKho("PNK001","NCC001",32.5f,"30-05-2025");
        phieuNhapKhoService.them(pnk);
        Assertions.assertTrue(phieuNhapKhoService.xoa("PNK001"));
    }

    @Test
    void testUpdate(){
        PhieuNhapKho pnk = new PhieuNhapKho("PNK001","NCC002",32.5f,"30-05-2025");
        phieuNhapKhoService.them(pnk);
        PhieuNhapKho pnkNew = new PhieuNhapKho("PNK002","NCC005",32.7f,"23-05-2025");
        Assertions.assertTrue(phieuNhapKhoService.sua("PNK001",pnkNew));
    }

    @Test
    void testTrong(){
        PhieuNhapKho pnk = new PhieuNhapKho("  ","NCC002",32.5f,"30-05-2025");
        Assertions.assertTrue(phieuNhapKhoService.them(pnk));
    }

    @Test
    void testBien(){
        PhieuNhapKho pnk = new PhieuNhapKho("PNK001 ","NCC002",0f,"30-05-2025");
        Assertions.assertTrue(phieuNhapKhoService.them(pnk));
    }

    @Test
    void testBien2(){
        PhieuNhapKho pnk = new PhieuNhapKho("PNK001 ","NCC002",101f,"30-05-2025");
        Assertions.assertTrue(phieuNhapKhoService.them(pnk));
    }

    @Test
    void testTuongDuong(){
        PhieuNhapKho pnk = new PhieuNhapKho("PNK001","NCC002",18f,"30-05-2025");
        Assertions.assertTrue(phieuNhapKhoService.them(pnk));
    }


}
