package q01_basic.question05;

public class MemberManager {

	public MemberManager() {
	}

	public static void showAllMembers(AbstMember[] members) {
		for (AbstMember member : members) {
			member.showMember();
		}
	}
}