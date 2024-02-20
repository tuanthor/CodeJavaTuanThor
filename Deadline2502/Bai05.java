package Deadline2502;

import java.util.Scanner;

public class Bai05 {
	 Scanner scanner = new Scanner(System.in);
     String str;
     void nhapStr(){
         System.out.print("Nhap vao mot chuoi ky tu:");
         str = scanner.nextLine();
  }
     void inKyTu() {
    	 System.out.print("Nhap vi tri can in ra: ");
         int vitri = scanner.nextInt();
         if (vitri >= 0 && vitri < str.length()) {
            char ch = str.charAt(vitri);
             System.out.println("Ky tu o vi tri " + vitri + " la: " + ch);
         } else {
             System.out.println("Nhap vi tri khong hop le");
         }	 
     }
    public static void main(String[] args) {
       Bai05 a = new Bai05();
       a.nhapStr();
       a.inKyTu();
        
    }
}

