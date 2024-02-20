package Deadline2502;

import java.util.Scanner;
import java.util.Arrays;

public class Bai02 {
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
	 
    void xuLyPhanTuGiongNhau() {
        System.out.println("Mảng ban đầu:");
        System.out.println(Arrays.toString(arr)); // phương thức toString để in mảng
        Arrays.sort(arr); // sắp xếp mảng từ nhỏ đến lớn
        int dem = 1;
        // loại bỏ các phần tử trùng nhau
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[dem] = arr[i];
                dem++;
            }
        }
     
        int[] newArr = Arrays.copyOf(arr, dem); // đưa các phần tử vào một mảng mới
        System.out.println("Mảng sau khi loại bỏ các phần tử trùng lặp:");
        System.out.println(Arrays.toString(newArr));
    }
    
    public static void main(String[] args) {
       Bai02 a = new Bai02();
       a.nhapMang();
       a.xuLyPhanTuGiongNhau();
    }
}

