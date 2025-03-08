package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


//    public class SanPhamServiceTest {
//        SanPhamService service = new SanPhamService();
//
//
//        @Test
//        public void addtc(){
//            SanPham sanPham = new SanPham("ma","hung",2,2000f,3,"dien thaoi");
//            service.add(sanPham);
//        }
//
//        @Test
//        public void addcoimarong(){
//            SanPham sanPham = new SanPham("","hung",2,2000f,3,"dien thaoi");
//            service.add(sanPham);
//            Assertions.assertEquals("",sanPham.getMa());
//        }
//        @Test
//        public void addnambaohanhnhohon0(){
//            SanPham sanPham = new SanPham("ma","hung",-1,2000f,3,"dien thaoi");
//            service.add(sanPham);
//            Assertions.assertEquals(-1,sanPham.getNamBaoHanh());
//        }
//
//        @Test
//        public void addgianhohon0() {
//            SanPham sanPham = new SanPham("ma", "hung", 2, -1f, 3, "dien thaoi");
//            service.add(sanPham);
//            Assertions.assertEquals(-1, sanPham.getGia());
//        }
//        @Test
//        public void addvoidanhmucrong(){
//            SanPham sanPham = new SanPham("ma","hung",2,2000f,3," ");
//            service.add(sanPham);
//            Assertions.assertEquals("",sanPham.getDanhMuc());
//        }
//
//        @Test
//        public void suatc(){
//            SanPham sanPham = new SanPham("ma","hung",2,2000f,3,"dien thaoi");
//            service.update(sanPham,"ma","abc",2,300f,3,"dien thoai");
//            Assertions.assertEquals("ma",sanPham.getMa());
//            Assertions.assertEquals("abc",sanPham.getTen());
//            Assertions.assertEquals(2,sanPham.getNamBaoHanh());
//            Assertions.assertEquals(300f,sanPham.getGia());
//            Assertions.assertEquals(3,sanPham.getSoLuong());
//            Assertions.assertEquals("dien thoai",sanPham.getDanhMuc());
//        }
//        @Test
//        public void suavoimarong(){
//            SanPham sanPham = new SanPham("ma","hung",2,2000f,3,"dien thaoi");
//            IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
//                service.update(sanPham, "ma","",2,2000f,3,"dien thaoi");
//            });
//            Assertions.assertEquals("ma san pham khong duoc bo trong", thrown.getMessage());
//        }
//        @Test
//        public void suavoinambaohanhnhohon1(){
//            SanPham sanPham = new SanPham("ma","hung",2,2000f,3,"dien thaoi");
//            service.update(sanPham,"ma","hung",-1,2000f,3,"dien thaoi");
//            Assertions.assertEquals(-1,sanPham.getNamBaoHanh());
//        }
//        @Test
//        public void xoatc(){
//            SanPham sanPham = new SanPham("ma","hung",2,2000f,3,"dien thaoi");
//            service.add(sanPham);
//            service.xoa(sanPham.getMa());
//        }
//
//        @Test
//        public void xoatb(){
//            SanPham sanPham = new SanPham("ma","hung",2,2000f,3,"dien thaoi");
//            IllegalArgumentException s = Assertions.assertThrows(IllegalArgumentException.class,()->{
//                service.add(sanPham);
//                service.xoa(sanPham.getMa());
//            });
//            Assertions.assertEquals(",ma rong",s.getMessage());
//        }
//
//    }


//private List<SanPham> sanPhams;
//    public SanPhamService(){sanPhams = new ArrayList<>();
//    }
//    public void add(SanPham sanPham){
//        validate(sanPham);
//        if(sanPhams.stream().anyMatch(sp->sp.getMa().equals(sanPham.getMa()))){
//            throw new IllegalArgumentException("ma khong trung");
//        }
//        sanPhams.add(sanPham);
//    }
//    public SanPham update(SanPham sanPham,String ma, String ten, int namBaoHanh, float gia, int soLuong, String danhMuc){
//        sanPham.setMa(ma);
//        sanPham.setTen(ten);
//        sanPham.setNamBaoHanh(namBaoHanh);
//        sanPham.setGia(gia);
//        sanPham.setSoLuong(soLuong);
//        sanPham.setDanhMuc(danhMuc);
//        validate(sanPham);
//        return sanPham;
//
//    }
//    public String xoa(String ma){
//        SanPham sanPham = sanPhams.stream().filter(sp->sp.getMa().equals(ma)).findFirst().orElseThrow(()->new IllegalArgumentException("Khong tim thay ma"));
//        sanPhams.remove(sanPham);
//        return "xoa tc";
//    }
//
//
//    public void validate(SanPham sanPham){
//        if(sanPham.getMa()==null || sanPham.getMa().trim().isEmpty()){
//            throw new IllegalArgumentException("khong bo trong ma");
//        }if(sanPham.getTen()== null || sanPham.getTen().trim().isEmpty()){
//            throw new IllegalArgumentException("khon gbo trong ten");
//
//        }if(sanPham.getNamBaoHanh()<=1){
//            throw new IllegalArgumentException("nam bao hanh lon hon 0");
//        }if(sanPham.getGia()<=1){
//            throw new IllegalArgumentException("gia lon hon 0");
//
//        }if(sanPham.getSoLuong()<=1){
//            throw new IllegalArgumentException("so luong lon hon 0");
//        }if(sanPham.getDanhMuc()== null || sanPham.getDanhMuc().trim().isEmpty()){
//            throw new IllegalArgumentException("khong bo trong danh muc");
//
//        }
//    }


}