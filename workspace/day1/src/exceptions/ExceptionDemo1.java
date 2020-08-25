package exceptions;

import java.io.FileInputStream;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		try {
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			FileInputStream fis=new FileInputStream("");
			int a = 10;
			int b = 10;
			double d = a / b;
			int[] nums = { 1, 2, 3, 4 };
			System.out.println(nums[3]);
			String[] names=new String[10];
			//System.out.println(names[1].length());

			System.out.println("Try executed without exceptions..");
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally Executed..");
		}

		System.out.println("Code execution resumed...");
	}

}
