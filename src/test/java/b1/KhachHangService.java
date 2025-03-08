package b1;

import java.util.ArrayList;
import java.util.List;

public class KhachHangService {
    private List<KhachHang> khachHangs;
    public KhachHangService(){khachHangs = new ArrayList<>();
    }
    public KhachHang timKiemTheoMa(String maKh) {
        return khachHangs.stream()
                .filter(kh -> kh.getMaKh().equals(maKh))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Không tìm thấy khách hàng với mã: " + maKh));
    }


    public void add(KhachHang khachHang){
        validate(khachHang);
        if(khachHangs.stream().anyMatch(sp->sp.getMaKh().equals(khachHang.getMaKh()))){
            throw new IllegalArgumentException("ma khong trung");
       }
       khachHangs.add(khachHang);
   }

    public void validate(KhachHang khachHang){
        if(khachHang.getMaKh()==null || khachHang.getMaKh().trim().isEmpty()){
            throw new IllegalArgumentException("khong bo trong ma");
        }if(khachHang.getTenKh()== null || khachHang.getTenKh().trim().isEmpty()){
            throw new IllegalArgumentException("khon gbo trong ten");

        }if(khachHang.getTuoi()<=1){
            throw new IllegalArgumentException("tuoi lon hon 0");
        }if(khachHang.getEmail()== null || khachHang.getEmail().trim().isEmpty()){
            throw new IllegalArgumentException("khon gbo trong email");

        }if(khachHang.getSoDienThoai()== null || khachHang.getSoDienThoai().trim().isEmpty()){
            throw new IllegalArgumentException("khon gbo trong so dien thoai");

        }
    }

}
