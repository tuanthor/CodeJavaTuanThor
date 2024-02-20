package Deadline2502;

import java.util.Scanner;

public class Bai09 {
	Scanner sc = new Scanner(System.in);
	int dem;
	long number, newnumber;
	
	void nhapNumber() {
		do {
		 System.out.print("Nhập một số nguyên(nhỏ hơn 1 tỷ): ");
	     number = sc.nextInt();
		} while (number > 1000000000);
	}
    

    // Phương thức để đếm số lượng chữ số của một số nguyên dương
    void  demSoChuSo() {
         dem = 0;
        // Sử dụng vòng lặp để đếm số lượng chữ số
         newnumber = number; // gán number vào biến khác để không in ra number = 0
         while (newnumber != 0) {
            newnumber /= 10;
            dem++;
        }
       System.out.println("Số chữ số của " + number + " là: " + dem);
    }
    
    
    public static void main(String[] args) {
        Bai09 a = new Bai09();
        a.nhapNumber();
        a.demSoChuSo();       
    }
}
