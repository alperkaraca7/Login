package PasswordLogin;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		String username = "patika123";
		String password = "java123";
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter the username :");
		String Logusername =scanner1.nextLine();  
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter the password :");
		String Logpassword =scanner2.nextLine(); 
		
		if ((Logusername.equals(username))&&(Logpassword.equals(password))) {
			System.out.println("welcome,you are logged in"); 
			
		}
		else {
			System.out.println("login failed :( ,username or password false "); 
			Scanner scanner3 = new Scanner(System.in);
			System.out.println("şifrenizi sıfırlamak isterseniz 1 e basınız çıkış için 2 basınız");
			int Respassword = scanner3.nextInt();
			
			if (Respassword==1) {
				Scanner scanner4= new Scanner(System.in);
				System.out.print("yeni şifrenizi giriniz :");
				String newpassword =scanner4.nextLine();
				
				if (newpassword.equals(password)) {
					System.out.println("şifre oluşturulamadı tekrar deneyinizz");
					
				}
				else {
					System.out.println("şifre başarıyla değiştirildi ");
					password = newpassword;			}
				password = newpassword;
			}
			else if (Respassword==2) {
				System.out.println("sistem kapatıldı :)");
				
				
			}
			
			
			
		}
		
				

	}

}
