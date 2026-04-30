package q01_basic.question01;

/**
 * question01出力例
 * 詳細は問題ドキュメントを参照すること

---SHOW DATA---
***MEMBER DATA***
name:Miura Manabu
age:24
rank:1
*****************
***MEMBER DATA***
name:Sato Kensuke
age:36
rank:2
*****************

 * 
 */
public class SystemMain01 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member member01 = new Member();
		Member member02 = new Member();

		member01.name = "Miura Manabu";
		member01.age = 24;
		member01.rank = 1;

		member02.name = "Sato Kensuke";
		member02.age = 36;
		member02.rank = 2;

		member01.showMember();
		member02.showMember();

	}

}
