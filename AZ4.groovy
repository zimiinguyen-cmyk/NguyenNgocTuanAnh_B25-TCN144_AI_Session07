// Hàm tính tổng các phần tử của mảng một cách ngắn gọn
int sumArray(int arr[], int n) {
    // Sử dụng vòng lặp for để duyệt từng phần tử và cộng dồn vào tổng
    int sum = 0; 
    for (int i = 0; i < n; sum += arr[i++]); // Gọn hơn bằng cách đặt cộng dồn ngay trong điều kiện lặp
    return sum; // Trả về kết quả tổng cuối cùng
}
