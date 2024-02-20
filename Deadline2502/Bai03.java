package Deadline2502;

import java.util.Scanner;

public class Bai03 {
  Scanner sc = new Scanner(System.in);
  int hang, cot;
  int matran[][];	
  
  void nhapMatran() {

		System.out.print("Nhap so hang cua matran :");
		hang = sc.nextInt();
		System.out.print("Nhap so cot cua ma tran :");
	    cot = sc.nextInt();
		matran = new int[hang][cot];
	 for(int i=0;i<hang;i++) {
		for(int j=0;j<cot;j++) {
		 System.out.print("Nhap pha tu hang "+(i+1)+" va cot "+(j+1)+": ");
		  matran[i][j]= sc.nextInt();
				
		     }
		}  
  } 
  
  void inMatran(){
	  System.out.println("Matran ban cua nhap la:");
	  for (int i = 0; i < hang; i++) {
	         for (int j = 0; j < cot; j++) {
	             System.out.print(matran[i][j] +" ");
	         }
	         System.out.println(""); 
	     }
  }

  void matranChuyenVi(){
	  System.out.println("Matran chuyen vi la:");
	  for (int i = 0; i < cot; i++) {
	         for (int j = 0; j < hang; j++) {
	             System.out.print(matran[j][i] +" ");
	         }
	         System.out.println(""); 
	     }  
  }
  public static void main(String[] args) {
	  Bai03 matran = new Bai03();
	  matran.nhapMatran();
	  matran.inMatran();
	  matran.matranChuyenVi();
  }
  
}