package bai6;

import org.example.ontap3.PhieuNhapKho;

import java.util.ArrayList;
import java.util.List;

public class PhieuNhapKhoService {
    List<PhieuNhapKho> list = new ArrayList<>();

    public boolean them(PhieuNhapKho pnk){
        if(pnk == null || pnk.getMaPNK().trim().isEmpty() ||
           pnk.getMaNCC().trim().isEmpty() || pnk.getTongTien() == null || pnk.getTongTien() < 0 || pnk.getTongTien() > 100 ||
           pnk.getNgayNhap().trim().isEmpty()){
            return false;
        }
        list.add(pnk);
        return true;
    }

    public boolean sua(String ma,PhieuNhapKho pnk){
        for (int i = 0;i< list.size();i++){
            if(list.get(i).getMaPNK().equals(ma)){
                if(pnk == null || pnk.getMaPNK().trim().isEmpty() ||
                        pnk.getMaNCC().trim().isEmpty() || pnk.getTongTien() == null || pnk.getTongTien() < 0 || pnk.getTongTien() > 100 ||
                        pnk.getNgayNhap().trim().isEmpty()){
                    return false;
                }
                list.set(i,pnk);
                return true;
            }
        }
        return false;
    }

    public boolean xoa(String ma){
        return list.removeIf(pnk ->pnk.getMaPNK().equals(ma));
    }

    public PhieuNhapKho getOne(String ma){
        return list.stream().filter(phieuNhapKho -> phieuNhapKho.getMaPNK().equals(ma)).findFirst().orElse(null);
    }
}
