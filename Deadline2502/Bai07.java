package Deadline2502;

import java.util.Scanner;

public class Bai07 {
 Scanner sc = new Scanner(System.in);
 double a, b, c;
 
 void nhapHeSo() {
	 System.out.println("Nhập hệ số a: ");
      a = sc.nextDouble();
     System.out.println("Nhập hệ số b: ");
      b = sc.nextDouble();
     System.out.println("Nhập hệ số c: ");
      c = sc.nextDouble();
 }
 
 void giaiPTBac2() {
	
     double delta = b * b - 4 * a * c;

    
     if (delta > 0) {
        
         double x1 = (-b + Math.sqrt(delta)) / (2 * a);
         double x2 = (-b - Math.sqrt(delta)) / (2 * a);
         System.out.println("Phương trình có hai nghiệm phân biệt:");
         System.out.println("x1 = " + x1);
         System.out.println("x2 = " + x2);
     } else if (delta == 0) {
        
         double x = -b / (2 * a);
         System.out.println("Phương trình có hai nghiệm kép:");
         System.out.println("x = " + x);
     } else {
         
         System.out.println("Phương trình không có nghiệm thực.");
     }
 }
 
 public static void main(String[] asgr) {
	 Bai07 pt = new Bai07();
	 pt.nhapHeSo();
	 pt.giaiPTBac2();
 }
}
