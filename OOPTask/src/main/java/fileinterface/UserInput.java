package fileinterface;

import java.util.List;
import java.util.Scanner;

public class UserInput {
	public void userFromUser(int n, List<Author> authList) {
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			Author auth = new Author();
			System.out.print("Enter First name of author: ");
			auth.setfName(scn.next());
			System.out.print("Enter Last name of author: ");
			auth.setlName(scn.next());
			System.out.print("Enter Address of author: ");
			auth.setAddress(scn.next());
			System.out.print("Enter Email of author: ");
			auth.setEmail(scn.next());
			System.out.print("Enter Institution of author: ");
			auth.setInstitution(scn.next());

			// setting FUll name of author
			// System.out.print("Full name of author: ");
			auth.setName(auth.getfName(), auth.getlName());

			authList.add(auth);

		}
	}
}
