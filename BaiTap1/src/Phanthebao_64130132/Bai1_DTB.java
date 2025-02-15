/**
 * 
 */
package Phanthebao_64130132;
import java.util.Scanner;

/**
 * 
 */
public class Bai1_DTB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Nhập họ và tên sinh viên");
		String hoten = scanner.nextLine();
		System.out.print("Nhập điểm trung bình: ");
	    double diemTrungBinh = scanner.nextDouble();
	        
	    System.out.println("Họ và tên: " + hoten);
	    System.out.println("Điểm trung bình: " + diemTrungBinh);
	    
	    scanner.close();
	}

}

