public class MathUtil {

    public static long getFactorial(int n) {

        //REFACTORING, REFACTOR: TỐI ƯU, TINH CHỈNH SOURCE CODE
        //CODE MỚI KHI ĐC ĐƯA LÊN SERVER, PHẢI ĐC CHECK LẠI NGAY Ở NHÁNH DEV, HOẶC KHI ĐƯA VÀO
        // NHÁNH MAIN THÌ CX PHẢI ĐC CHECK ĐỂ ĐẢM BẢO RẰNG NÓ MÀU XANH, PASSED CÁC TEST CASE
        //LÝ DO: HÀM PHẢI CHẠY ĐÚNG!
        // NẾU PROJECT CÓ SẴM TDD, UNIT TEST, THÌ QUÁ TRÌNH PHÁT TRIỂN THỬ LẠI CODE VỪA SỬA DIỄN RA RẤT NHANH RẤT TIỆN


        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid parameter. n must be between 0 and 20");
        }
        if (n == 0 || n == 1) {
            return 1; //n = 0 hay 1 return ngay,điêm dừng của đệ quy!!!
        }

        //đệ quy nè, recursion nè, gọi là chính mình ở quy mô nhỏ hơn nè
        return n * getFactorial(n - 1);


//        //thuật toán tính n! = 1.2.3... n, n từ 0...20
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid parameter. n must be between 0 and 20");
//        }
//        if (n == 0) {
//            return 1; //n = 0 return ngay
//        }
//        //sure n từ 1..20
//        long result = 1; //khởi đầu giai thừa bằng 1, nhân dồn
//            //code cố tình tạo bug: giai thừa đc nhân thêm 10
//        //sửa lại source thành 1 để mlem trở lại, green 4 ever
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;
    }
}