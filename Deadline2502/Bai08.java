package Deadline2502;

import java.util.Scanner;

public class Bai08 {
Scanner sc = new Scanner(System.in);
int year;

void nhapYear() {
	do {
	System.out.println("Hãy nhập năm cần kiểm tra : ");
	year = sc.nextInt();
}while (year <= 0);
	
 }

boolean checkNamNhuan(int year) {
    
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 != 0) {
                return false;
            }
        }
        return true;
    }
    return false;
}

void inNamNhuan() {
	 if (checkNamNhuan(year)) {
         System.out.println(year + " là năm nhuận.");
     } else {
         System.out.println(year + " không phải là năm nhuận.");
     }
  }

public static void main(String[] asgr) {
	Bai08 a = new Bai08();
	a.nhapYear();
	a.inNamNhuan();
  }
}
