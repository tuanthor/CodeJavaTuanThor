package Deadline2502;

import java.util.Scanner;
import java.util.Arrays;

public class Bai10 {
	Scanner sc = new Scanner(System.in);
	int n, arr[], newArr[];
	
	void nhapMang() {
	 System.out.print("Hãy nhập số lượng phần tử của mảng: ");
     n = sc.nextInt();
     arr = new int[n];	       
     System.out.println("Nhập các phần tử của mảng:");
     for (int i = 0; i < n; i++) {
       System.out.print("Phần tử thứ " + (i + 1) + ": ");
       arr[i] = sc.nextInt();
    }
} 
	// ta sử dụng ý của bài 02
	void xuLyPhanTuGiongNhau() {
        System.out.println("Mảng vừa nhập:");
        System.out.println(Arrays.toString(arr)); 
        Arrays.sort(arr); 
        int dem = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[dem] = arr[i];
                dem++;
            }
        }
     
        newArr = Arrays.copyOf(arr, dem);    
}
	
	void inPhanTu() {
		System.out.println("Phần tử nhỏ nhất là: " + newArr[0]);
		System.out.println("Phần tử nhỏ nhất thứ hai là: " + newArr[1]);
}
    

    
    
    public static void main(String[] args) {
        Bai10 a = new Bai10();
        a.nhapMang();
        a.xuLyPhanTuGiongNhau();
        a.inPhanTu();
    }
}
