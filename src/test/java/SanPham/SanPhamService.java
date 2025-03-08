package SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private List<SanPham>  sanPhams;
    public SanPhamService(){sanPhams = new ArrayList<>();
    }
    public void add(SanPham sanPham){
        validate(sanPham);
        if(sanPhams.stream().anyMatch(sp->sp.getMa().equals(sanPham.getMa()))){
            throw new IllegalArgumentException("ma khong trung");
        }
        sanPhams.add(sanPham);
    }
    public SanPham update(SanPham sanPham,String ma, String ten, int namBaoHanh, float gia, int soLuong, String danhMuc){
        sanPham.setMa(ma);
        sanPham.setTen(ten);
        sanPham.setNamBaoHanh(namBaoHanh);
        sanPham.setGia(gia);
        sanPham.setSoLuong(soLuong);
        sanPham.setDanhMuc(danhMuc);
        validate(sanPham);
        return sanPham;

    }
    public String xoa(String ma){
        SanPham sanPham = sanPhams.stream().filter(sp->sp.getMa().equals(ma)).findFirst().orElseThrow(()->new IllegalArgumentException("Khong tim thay ma"));
        sanPhams.remove(sanPham);
        return "xoa tc";
    }


    public void validate(SanPham sanPham){
        if(sanPham.getMa()==null || sanPham.getMa().trim().isEmpty()){
            throw new IllegalArgumentException("khong bo trong ma");
        }if(sanPham.getTen()== null || sanPham.getTen().trim().isEmpty()){
            throw new IllegalArgumentException("khon gbo trong ten");

        }if(sanPham.getNamBaoHanh()<=1){
            throw new IllegalArgumentException("nam bao hanh lon hon 0");
        }if(sanPham.getGia()<=1){
            throw new IllegalArgumentException("gia lon hon 0");

        }if(sanPham.getSoLuong()<=1){
            throw new IllegalArgumentException("so luong lon hon 0");
        }if(sanPham.getDanhMuc()== null || sanPham.getDanhMuc().trim().isEmpty()){
            throw new IllegalArgumentException("khong bo trong danh muc");

        }
    }
}
