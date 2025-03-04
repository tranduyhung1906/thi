package bai2;

import org.example.ontap1.bai2.SinhVien;

import java.util.Objects;

public class SinhVienService {
    public SinhVien suaSinhVien(SinhVien sv, String ten, int tuoi, float diemTrungBinh, int kyHoc, String chuyenNganh) {

        sv.setTen(ten);
        sv.setTuoi(tuoi);
        sv.setDiemTrungBinh(diemTrungBinh);
        sv.setKyHoc(kyHoc);
        sv.setChuyenNganh(chuyenNganh);
        return sv;
    }
}
