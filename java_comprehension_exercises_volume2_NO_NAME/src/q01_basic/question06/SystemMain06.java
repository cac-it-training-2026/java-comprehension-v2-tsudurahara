package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) throws IOException {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		//TODO ここから実装する

		System.out.print("input id>>>");
		int memberId = cr.inputNumber();
		System.out.print("input password>>");
		String memberpassword = cr.inputString();

		Member member = new Member(memberId, memberpassword, "Miura Manabu", 28, 2);

		member.showMember();

	}

}
