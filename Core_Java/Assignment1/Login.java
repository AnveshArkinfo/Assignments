import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String userIdInDb ="Anvesh";
		String userPwdInDb = "anvesh";
		int wrg =1;
		
		Scanner sc = new Scanner(System.in);
		
		while(wrg<4) {
			System.out.println("Enter User ID : ");
			String ip = sc.next();
			System.out.println("Enter Password :");
			String pwd = sc.next();
			
			if(ip.equals(userIdInDb) && pwd.equals(userPwdInDb)) {
				System.out.println("WELCOME "+userIdInDb);
				break;
				}
			
			else if(wrg!= 3){System.out.println("Credentials are wrong, Try Again");
								}
			
			else {System.out.println("Account Blocked. Contact Admin");
			break;
			}
			
			++wrg;
		}
		
		sc.close();

	}

}
