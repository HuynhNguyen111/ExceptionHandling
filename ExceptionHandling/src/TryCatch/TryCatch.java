package TryCatch;

public class TryCatch {
	public static void main(String[] args) {
		try {
			int a=50/0;
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("code here");
	}
}
