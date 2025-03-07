import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
  private List<SinhVien> sinhViens;
  public SinhVienService(){
      sinhViens = new ArrayList<>();
  }
  public void add(SinhVien sinhVien){
      validate(sinhVien);
   if (sinhViens.stream().anyMatch(sv ->sv.getMaSV().equals(sinhVien.getMaSV()))){
       throw new IllegalArgumentException("ma ko trungf");
   }

      sinhViens.add(sinhVien);
  }
public SinhVien update(SinhVien sinhVien ,String ma,String ten ,int tuoi){
      sinhVien.setMaSV(ma);
      sinhVien.setTen(ten);
      sinhVien.setTuoi(tuoi);
      validate(sinhVien);
      return sinhVien;
}
public String xoa(String ma){
      SinhVien sinhVien = sinhViens.stream()
              .filter(sv -> sv.getMaSV().equals(ma))
              .findFirst()
              .orElseThrow(() -> new IllegalArgumentException("ko tim thay ma"));
      sinhViens.remove(sinhVien);
      return "xoa tc";
}
public void validate(SinhVien sinhVien){
      if (sinhVien.getMaSV() == null || sinhVien.getMaSV().trim().isEmpty()){
          throw new IllegalArgumentException("ko bo trong ma");
      }if (sinhVien.getTen() == null || sinhVien.getTen().trim().isEmpty()){
          throw new IllegalArgumentException("ko bor chong ten");
    }if (sinhVien.getTuoi()<=1){
          throw new IllegalArgumentException("tuoi lon hon 0");
    }
}
}
