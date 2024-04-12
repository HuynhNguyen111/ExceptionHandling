package InnputMark;

import java.util.Scanner;

public class InputMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double mark;
		System.out.println("nhap điểm 0<=điểm<=10");
		try {
			mark=sc.nextDouble();
			if (mark>10||mark<0) {
				System.out.println("nhap sai moi nhap lai");
			} else {
				System.out.println("thanh cong");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("nhap sai dinh dang");
		}
		System.out.println("code");
	}

}