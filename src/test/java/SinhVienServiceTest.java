import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SinhVienServiceTest {
    SinhVienService service = new SinhVienService();


@Test
    public void addtc(){
    SinhVien sinhVien = new SinhVien("ma","a",1);
    service.add(sinhVien);

}
@Test
    public void addvoimarong(){
    SinhVien sinhVien = new SinhVien("","a",1);
    service.add(sinhVien);
    Assertions.assertEquals("",sinhVien.getMaSV());
}
@Test
    public void addtuoinhoho0(){
    SinhVien sinhVien = new SinhVien("ac","aa",-1);
    service.add(sinhVien);
    Assertions.assertEquals(-1,sinhVien.getTuoi());
}
@Test
     public  void suatc(){
    SinhVien sinhVien = new SinhVien("ma","ten",1);
service.update(sinhVien,"ma","ma",2);
    Assertions.assertEquals("ma",sinhVien.getTen());
    Assertions.assertEquals("ma",sinhVien.getMaSV());
    Assertions.assertEquals(2,sinhVien.getTuoi());
}
    @Test
    public void suatbvsmachong() {
        SinhVien sinhVien = new SinhVien("a", "a", 1);
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            service.update(sinhVien, "a", "", 1);
        });
        Assertions.assertEquals("Mã sinh viên không được bỏ trống", thrown.getMessage());
    }
@Test
    public void suavoituoinho1(){
    SinhVien sinhVien = new SinhVien("ma","m",1);
    service.update(sinhVien,"ma","m",-1);
    Assertions.assertEquals(-1,sinhVien.getTuoi());
}
@Test
    public void suavoitenchong(){
    SinhVien sinhVien = new SinhVien("ma","aa",1);
    IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class,()->
    {service.update(sinhVien,"","aa",1);});
    Assertions.assertEquals("ko bo chong ma",thrown.getMessage());
}
@Test
    public void xoatc(){
    SinhVien sinhVien = new SinhVien("aa","aa",1);
    service.add(sinhVien);
    service.xoa(sinhVien.getMaSV());
}
@Test
    public void xoatb() {


    SinhVien sinhVien = new SinhVien("", "aa", 1);

    IllegalArgumentException s = Assertions.assertThrows(IllegalArgumentException.class,()->{
        service.add(sinhVien);
        service.xoa(sinhVien.getMaSV());
    });
    Assertions.assertEquals("ma rong",s.getMessage());
}
@Test
    public void themtrung(){
    SinhVien sinhVien= new SinhVien("aa","aa",1);
    SinhVien sinhVien1= new SinhVien("aa","aa",1);
    service.add(sinhVien);
    IllegalArgumentException d = Assertions.assertThrows(IllegalArgumentException.class,()->{
       service.add(sinhVien1);
    });
    Assertions.assertEquals("ma ko dc trung nhau",d.getMessage());
}
}


