package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する
		NonMember nonmember = new NonMember("Sato Kensuke");
		Member member = new Member(1, "PasswOrd", "Miura Manabu", 28, 2);
		MemberManager membermanager = new MemberManager();

		members[0] = nonmember;

		members[1] = member;

		membermanager.showAllMembers(members);

		nonmember.buyItem();
		member.buyItem();
	}

}
