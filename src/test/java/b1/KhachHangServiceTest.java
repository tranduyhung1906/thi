package b1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class KhachHangServiceTest {

        private KhachHangService service;

        @BeforeEach
        void setUp() {
            service = new KhachHangService();
            service.add(new KhachHang("SV01", "Nguyen Van A", 20, "abc@gmail.com", "0365737723"));
            service.add(new KhachHang("SV02", "Nguyen Van b", 25, "hgfshgahg@gmail.com", "012782863898"));
            service.add(new KhachHang("SV03", "Nguyen Van C", 20, "gfasgdfahg@gmail.com", "76387362432"));
        }

        @Test
        void testTimKiemKhachHang_TonTai() {
            KhachHang khachHang = service.timKiemTheoMa("SV01");
            assertNotNull(khachHang);
            assertEquals("Nguyen Van A", khachHang.getTenKh());
        }

        @Test
        void testTimKiemKhachHang_KhongTonTai() {
            KhachHang khachHang = service.timKiemTheoMa("SV99");
            assertNull(khachHang);
        }

        @Test
        void testTimKiemKhachHang_Bien() {
            KhachHang khachHang = service.timKiemTheoMa("SV02");
            assertNotNull(khachHang);
            assertEquals("Nguyen Van B", khachHang.getTenKh());
        }

        @Test
        void testTimKiemKhachHang_MaChuHoa() {
            KhachHang khachHang = service.timKiemTheoMa("SV03");
            assertNotNull(khachHang);
            assertEquals("Nguyen Van C", khachHang.getTenKh());
        }


        @Test
        void testTimKiemKhachHang_MaNull() {
            KhachHang khachHang = service.timKiemTheoMa(null);
            assertNull(khachHang);
        }
    }

