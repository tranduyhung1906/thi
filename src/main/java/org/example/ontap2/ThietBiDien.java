package org.example.ontap2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ThietBiDien {
    private String maTB;
    private String tenTB;
    private float gia;
    private int baoHanh;
    private int soLuong;
    private String hangSX;
}
