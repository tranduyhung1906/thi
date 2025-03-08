package SanPham;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SanPhamServiceTest {
    SanPhamService service = new SanPhamService();


    @Test
    public void addtc(){
        SanPham sanPham = new SanPham("ma","hung",2,2000f,3,"dien thaoi");
        service.add(sanPham);
    }

    @Test
public void addcoimarong(){
    SanPham sanPham = new SanPham("","hung",2,2000f,3,"dien thaoi");
   service.add(sanPham);
        Assertions.assertEquals("",sanPham.getMa());
    }
    @Test
    public void addnambaohanhnhohon0(){
        SanPham sanPham = new SanPham("ma","hung",-1,2000f,3,"dien thaoi");
    service.add(sanPham);
    Assertions.assertEquals(-1,sanPham.getNamBaoHanh());
    }

    @Test
    public void addgianhohon0() {
        SanPham sanPham = new SanPham("ma", "hung", 2, -1f, 3, "dien thaoi");
        service.add(sanPham);
        Assertions.assertEquals(-1, sanPham.getGia());
    }
    @Test
    public void addvoidanhmucrong(){
        SanPham sanPham = new SanPham("ma","hung",2,2000f,3," ");
        service.add(sanPham);
        Assertions.assertEquals("",sanPham.getDanhMuc());
    }

    @Test
    public void suatc(){
        SanPham sanPham = new SanPham("ma","hung",2,2000f,3,"dien thaoi");
        service.update(sanPham,"ma","abc",2,300f,3,"dien thoai");
        Assertions.assertEquals("ma",sanPham.getMa());
        Assertions.assertEquals("abc",sanPham.getTen());
        Assertions.assertEquals(2,sanPham.getNamBaoHanh());
        Assertions.assertEquals(300f,sanPham.getGia());
        Assertions.assertEquals(3,sanPham.getSoLuong());
        Assertions.assertEquals("dien thoai",sanPham.getDanhMuc());
    }
    @Test
    public void suavoimarong(){
        SanPham sanPham = new SanPham("ma","hung",2,2000f,3,"dien thaoi");
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            service.update(sanPham, "ma","",2,2000f,3,"dien thaoi");
        });
        Assertions.assertEquals("ma san pham khong duoc bo trong", thrown.getMessage());
    }
    @Test
     public void suavoinambaohanhnhohon1(){
        SanPham sanPham = new SanPham("ma","hung",2,2000f,3,"dien thaoi");
        service.update(sanPham,"ma","hung",-1,2000f,3,"dien thaoi");
        Assertions.assertEquals(-1,sanPham.getNamBaoHanh());
    }
@Test
    public void xoatc(){
        SanPham sanPham = new SanPham("ma","hung",2,2000f,3,"dien thaoi");
        service.add(sanPham);
        service.xoa(sanPham.getMa());
}

    @Test
    public void xoatb(){
        SanPham sanPham = new SanPham("ma","hung",2,2000f,3,"dien thaoi");
        IllegalArgumentException s = Assertions.assertThrows(IllegalArgumentException.class,()->{
            service.add(sanPham);
            service.xoa(sanPham.getMa());
        });
        Assertions.assertEquals(",ma rong",s.getMessage());
    }

}

