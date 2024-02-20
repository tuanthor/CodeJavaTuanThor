package Deadline2502;

import java.util.Scanner;

public class Bai01 {
	Scanner sc = new Scanner(System.in);
	int n;
	int arr[];
	void nhapMang() {
		 
	     System.out.print("Nhập số lượng phần tử của mảng: ");
	     n = sc.nextInt();	        
	     arr = new int[n];	       
	     System.out.println("Nhập các phần tử của mảng:");
	     for (int i = 0; i < n; i++) {
	       System.out.print("Phần tử thứ " + (i + 1) + ": ");
	       arr[i] = sc.nextInt();
	    }
	}
	
	
	void timMax() {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
           if (arr[i] > max) {
             max = arr[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
	}
    public static void main(String[] args) {
       Bai01 a = new Bai01();
       a.nhapMang();
       a.timMax(); 

    }
}
