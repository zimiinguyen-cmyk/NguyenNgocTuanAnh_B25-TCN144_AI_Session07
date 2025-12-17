// Hàm tính tổng các phần tử trong mảng sử dụng Groovy (dễ hiểu cho người mới):
int tinhTongMang(int[] arr) {
    int tong = 0;
    for(int i = 0; i < arr.length; i++) {
        tong += arr[i];
    }
    return tong;
}

// So sánh:
// - Cursor AI thường sinh ra code như trên: diễn giải rõ ràng, từng dòng đều có ý nghĩa minh bạch, dễ hiểu với người mới học lập trình.
// - GitHub Copilot đôi khi sinh ra dạng ngắn gọn hơn, ví dụ: return arr.sum(); 
//   => Tuy ngắn nhưng có thể khó hiểu cho người mới nếu chưa biết hàm sum là gì.
//
// Kết luận: Cách Cursor AI sinh code thường phù hợp hơn cho người bắt đầu học lập trình, vì chú trọng sự rõ ràng, từng bước giúp dễ tiếp cận và hiểu luồng lệnh so với code ngắn gọn mà Copilot có thể đề xuất.
