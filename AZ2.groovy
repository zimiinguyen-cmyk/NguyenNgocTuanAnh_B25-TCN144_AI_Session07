// Hàm tính giai thừa của số nguyên dương n
int tinhGiaiThua(int n) {
    // Biến lưu kết quả giai thừa, khởi tạo bằng 1
    int ketQua = 1;

    // Lặp từ 1 đến n để nhân lần lượt các số
    for(int i = 1; i <= n; i++) {
        ketQua = ketQua * i; // Nhân kết quả với i ở mỗi bước
    }

    // Trả về kết quả giai thừa
    return ketQua;
}
