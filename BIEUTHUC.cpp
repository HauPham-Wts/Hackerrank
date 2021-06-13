/*Lập trình nhập từ bàn phím các số nguyên a, b, c, d và x từ bàn phím. Tính và đưa ra màn hình giá trị biểu thức ax3 + bx2 + cx + d? (1 ≤ a, b, c, d, x ≤ 104)*/
#include<iostream>
using namespace std;
int main() {
	long long a, b, c, d, x;
	cin >> a >> b >> c >> d >> x;
	cout << a * (x * x * x) + b * (x * x) + c * x + d;
}