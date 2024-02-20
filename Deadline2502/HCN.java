package Deadline2502;

import java.util.Scanner;

public class HCN  { // Bài 06
  Scanner sc = new Scanner(System.in);
  double dai, rong, cv, s;
  
  void nhap() {
	  System.out.println("Hay nhap chieu dai: ");
	  dai = sc.nextDouble();
	  System.out.println("Hay nhap chieu rong: ");
	  rong = sc.nextDouble();
  }
  
  void tinhChuVi() {
	  cv = (dai + rong)*2;
	  System.out.println("Chu vi cua hcn la :" + cv);
  }
  
  void tinhDienTich() {
	  s = dai*rong;
	  System.out.println("Dien tich cua hcn la :" + s);
  }
  
  public static void main(String[] asgr) {
	  HCN a = new HCN();
	  a.nhap();
	  a.tinhChuVi();
	  a.tinhDienTich();
	  
	  HCN b = new HCN();
	  b.nhap();
	  b.tinhChuVi();
	  b.tinhDienTich();
	  
	  HCN c = new HCN();
	  c.nhap();
	  c.tinhChuVi();
	  c.tinhDienTich();
  }
}
