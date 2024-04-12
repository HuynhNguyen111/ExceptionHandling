package MultipleEx;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"1","2",null};
		try {
			int a=Integer.parseInt(s[5]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("loi");
		}
		System.out.println("loi");
	}

}
