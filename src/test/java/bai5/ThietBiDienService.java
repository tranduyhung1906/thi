package bai5;

import org.example.ontap2.ThietBiDien;

import java.util.ArrayList;
import java.util.List;

public class ThietBiDienService {
    private List<ThietBiDien> list = new ArrayList<>();

    public boolean them(ThietBiDien tbd) {
        if (tbd == null ||
                tbd.getMaTB().trim().isEmpty() ||
                tbd.getTenTB().trim().isEmpty() ||
                tbd.getGia() < 0 ||
                tbd.getBaoHanh() < 0 ||
                tbd.getSoLuong() < 0 ||
                tbd.getHangSX().trim().isEmpty()) {
            return false;
        }
        list.add(tbd);
        return true;
    }

    public boolean suaThietBi(String maTB, ThietBiDien tbMoi) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaTB().equals(maTB)) {
                if (tbMoi == null || tbMoi.getGia() < 0 || tbMoi.getSoLuong() < 0 || tbMoi.getBaoHanh() < 0) {
                    return false;
                }
                list.set(i, tbMoi);
                return true;
            }
        }
        return false;
    }

    public boolean xoaThietBi(String maTB) {
        return list.removeIf(tb -> tb.getMaTB().equals(maTB));
    }

    public ThietBiDien getThietBi(String maTB) {
        return list.stream().filter(tb -> tb.getMaTB().equals(maTB)).findFirst().orElse(null);
    }

}
