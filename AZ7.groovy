/*
Bước 1: Tạo cấu trúc project nhỏ với các file như sau:

- main.c: Chứa hàm main, gọi các hàm sumArray và maxValue ở các file utilsX.c, in kết quả.
- utils.h: Khai báo prototype cho các hàm sumArray và maxValue.
- utils1.c: Cài đặt sumArray sử dụng vòng lặp for, maxValue sử dụng vòng lặp for.
- utils2.c: Cài đặt sumArray sử dụng vòng lặp while, maxValue sử dụng vòng lặp while.
- utils3.c: Cài đặt sumArray sử dụng đệ quy, maxValue sử dụng đệ quy.

--------- utils.h ---------
*/

#ifndef UTILS_H
#define UTILS_H

int sumArray_for(const int arr[], int n);         // dùng for loop
int sumArray_while(const int arr[], int n);       // dùng while loop
int sumArray_recursive(const int arr[], int n);   // dùng đệ quy
int maxValue_for(const int arr[], int n);         // tìm max dùng for loop
int maxValue_while(const int arr[], int n);       // tìm max dùng while loop
int maxValue_recursive(const int arr[], int n);   // tìm max dùng đệ quy

#endif

/*
--------- utils1.c ---------
*/

#include "utils.h"

// Hàm tính tổng mảng bằng for loop
int sumArray_for(const int arr[], int n) {
    int sum = 0;
    for(int i = 0; i < n; i++) { // Duyệt qua từng phần tử
        sum += arr[i];           // Cộng dồn vào tổng
    }
    return sum; // Trả về tổng
}

/*
--------- utils2.c ---------
*/

#include "utils.h"

// Hàm tính tổng mảng bằng while loop
int sumArray_while(const int arr[], int n) {
    int sum = 0;
    int i = 0;
    while(i < n) { // Lặp đến hết mảng
        sum += arr[i]; // Cộng dồn 
        i++;           // Tăng chỉ số
    }
    return sum;
}

/*
--------- utils3.c ---------
*/

#include "utils.h"

// Hàm tính tổng mảng bằng đệ quy
int sumArray_recursive(const int arr[], int n) {
    if(n <= 0) return 0; // Trường hợp cơ sở: mảng rỗng
    return sumArray_recursive(arr, n-1) + arr[n-1]; // Cộng phần tử cuối với tổng phần còn lại
}

/*
--------- main.c ---------
*/

#include <stdio.h>
#include "utils.h"

int main() {
    int arr[] = {1, 2, 3, 4, 5};              // Khởi tạo mảng mẫu
    int n = sizeof(arr) / sizeof(arr[0]);

    int sum1 = sumArray_for(arr, n);
    int sum2 = sumArray_while(arr, n);
    int sum3 = sumArray_recursive(arr, n);

    printf("Tong (for loop): %d\n", sum1);
    printf("Tong (while loop): %d\n", sum2);
    printf("Tong (recursion): %d\n", sum3);

    return 0;
}

/*
--- Yêu cầu Cursor: ---
Sau khi tạo xong project, prompt: 
“Tìm tất cả các hàm maxValue trong project này. So sánh sự khác nhau và gợi ý viết 1 hàm chuẩn duy nhất.”

--- Ghi nhận ---
Cursor sẽ liệt kê (nếu có) mọi hàm maxValue, chỉ ra sự khác biệt trong cách cài đặt hoặc không có hàm nào, rồi đưa ra đề xuất chuẩn hóa (nếu có).
Chọn "Apply" hoặc "Keep All" để cập nhật code, chạy thử và kiểm tra kết quả. Đọc kỹ phần so sánh/giải thích của AI để hiểu cách tối ưu hoặc cải tiến mới.

--- Kết luận khi thực hiện ---
- Có thể thêm hàm maxValue ở mỗi utilsX.c để Cursor nhận diện và gợi ý, sau đó hợp nhất thành một phiên bản tối ưu, giải thích lý do vì sao nên như vậy (ví dụ trả về giá trị lớn nhất, kiểm tra độ dài mảng, v.v).
- Cursor thường đề xuất phiên bản chuẩn nhất, rõ ràng nhất, phù hợp cho nhiều trường hợp lỗi biên.
*/
