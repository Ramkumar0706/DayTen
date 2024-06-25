package dayTen;

import java.util.Scanner;

public class KeyPadString {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String Here");
		String str=scanner.nextLine();
		String name=str.toLowerCase();//Hello World
		String[] keyPad= {" ","/.@","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz","+"};
		
		for(int i=0;i<name.length();i++) {
			secondLoop:
			for(int j=0;j<keyPad.length;j++) {
				String arr=keyPad[j];
				if(arr.contains(""+name.charAt(i))) {
					int h=0;
					while(h<arr.length()) {
						System.out.print(j);
						if(name.charAt(i)==arr.charAt(h)) {
						break secondLoop;
						}
						h++;
					}
				}
			}
		}
		scanner.close();
	}

}
