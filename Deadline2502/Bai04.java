package Deadline2502;

import java.util.Scanner;

public class Bai04 {
	    Scanner sc = new Scanner(System.in);
	    String str;
	    void nhapStr() {
	    	
	    	System.out.print("Nhap chuoi ky tu can dao nguoc:");
	    	str = sc.nextLine();
	    }
	     
	    void daoNguocChuoi() {
	        StringBuilder strDaoNguoc = new StringBuilder(); // khởi tạo đối tượng đảo ngược chuỗi   
	        for (int i = str.length() - 1; i >= 0; i--) {    // duyệt các ký tự của chuỗi từ cuối về đầu
	            strDaoNguoc.append(str.charAt(i));           // thêm mỗi ký tự vào chuỗi đảo ngược
	        }      
	       System.out.println(strDaoNguoc);      
	    }
	    
	    
	    public static void main(String[] args) {
	       Bai04 a = new Bai04();
	       a.nhapStr();
	       a.daoNguocChuoi();     
	   }
}

	


