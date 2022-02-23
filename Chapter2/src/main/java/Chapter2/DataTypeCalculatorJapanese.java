package Chapter2;

import java.util.Scanner;

public class DataTypeCalculatorJapanese {

	public static void main(String[] args) {

		byte byteType = 1;
		short shortType = 2;
		int intType = 4;
		long longType = 8L;
		System.out.println(longType);
		float floatType = 4.0F;
		double doubleType = 4.0;
		char charType = '1';

		System.out.println("本計算機は二種類の変数を加えた後のデータ型を判断できる");
		System.out.println("加数と被加数のデータ型をお選びください");

		while (true) {
			System.out.println("--------------------------------------------------");
			System.out.println("被加数のデータ型をお選びください、もしくは0を選択しシステムを終了させてください");
			System.out.println("1. Byte型");
			System.out.println("2. Short型");
			System.out.println("3. Int型");
			System.out.println("4. Long型");
			System.out.println("5. FLoat型");
			System.out.println("6. Double 型");
			System.out.println("7. Char型");
			Scanner sc = new Scanner(System.in);
			String choiceOne = sc.nextLine();

//入力した内容は0-7の数字かどうかを判断
			while ((choiceOne.contentEquals("1") | choiceOne.contentEquals("2")| choiceOne.contentEquals("3") | 
					choiceOne.contentEquals("4") | choiceOne.contentEquals("5") | choiceOne.contentEquals("6") | 
					choiceOne.contentEquals("7")|choiceOne.contentEquals("0") ) != true ) {
				System.out.println("ご入力の内容は間違っています、0から7までお選びください");
				choiceOne = sc.nextLine();
			}
//循環を中止する
			if (choiceOne.contentEquals("0")) {
				System.out.println("ご利用ありがとうございました");
				System.exit(0);
			}

			System.out.println("--------------------------------------------------");
			System.out.println("加数のデータ型をお選びください");
			System.out.println("1. Byte型");
			System.out.println("2. Short型");
			System.out.println("3. Int型");
			System.out.println("4. Long型");
			System.out.println("5. FLoat型");
			System.out.println("6. Double 型");
			System.out.println("7. Char型");
			String choiceTwo = sc.nextLine();
			System.out.println("--------------------------------------------------");

			switch (choiceOne + choiceTwo) {
			case "11":
				System.out.println("お選びになったのはByte型+Byte型");
				System.out.print("加えた後のデータ型は");
				displayType(byteType + byteType);
				break;

			case "12":
			case "21":
				System.out.println("お選びになったのはByte型+Short型");
				System.out.print("加えた後のデータ型は");
				displayType(byteType + shortType);
				break;

			case "13":
			case "31":
				System.out.println("お選びになったのはByte型+Integer型");
				System.out.print("加えた後のデータ型は");
				displayType(byteType + intType);
				break;

			case "14":
			case "41":
				System.out.println("お選びになったのはByte型+Long型");
				System.out.print("加えた後のデータ型は");
				displayType(byteType + longType);
				break;

			case "15":
			case "51":
				System.out.println("お選びになったのはByte型+Float型");
				System.out.print("加えた後のデータ型は");
				displayType(byteType + floatType);
				break;

			case "16":
			case "61":
				System.out.println("お選びになったのはByte型+Double型");
				System.out.print("加えた後のデータ型は");
				displayType(byteType + doubleType);
				break;

			case "17":
			case "71":
				System.out.println("お選びになったのはByte型+Character型");
				System.out.print("加えた後のデータ型は");
				displayType(byteType + charType);
				break;

			case "22":
				System.out.println("お選びになったのはShort型+Short型");
				System.out.print("加えた後のデータ型は");
				displayType(shortType + shortType);
				break;

			case "23":
			case "32":
				System.out.println("お選びになったのはShort型+Integer型");
				System.out.print("加えた後のデータ型は");
				displayType(shortType + intType);
				break;

			case "24":
			case "42":
				System.out.println("お選びになったのはShort型+Long型");
				System.out.print("加えた後のデータ型は");
				displayType(shortType + longType);
				break;

			case "25":
			case "52":
				System.out.println("お選びになったのはShort型+Float型");
				System.out.print("加えた後のデータ型は");
				displayType(shortType + floatType);
				break;

			case "26":
			case "62":
				System.out.println("お選びになったのはShort型+Double型");
				System.out.print("加えた後のデータ型は");
				displayType(shortType + doubleType);
				break;

			case "27":
			case "72":
				System.out.println("お選びになったのはShort型+Character型");
				System.out.print("加えた後のデータ型は");
				displayType(shortType + charType);
				break;

			case "33":
				System.out.println("お選びになったのはInteger型+Integer型");
				System.out.print("加えた後のデータ型は");
				displayType(intType + intType);
				break;

			case "34":
			case "43":
				System.out.println("お選びになったのはInteger型+Long型");
				System.out.print("加えた後のデータ型は");
				displayType(intType + longType);
				break;

			case "35":
			case "53":
				System.out.println("お選びになったのはInteger型+Float型");
				System.out.print("加えた後のデータ型は");
				displayType(intType + floatType);
				break;

			case "36":
			case "63":
				System.out.println("お選びになったのはInteger型+Double型");
				System.out.print("加えた後のデータ型は");
				displayType(intType + doubleType);
				break;

			case "37":
			case "73":
				System.out.println("お選びになったのはInteger型+Character型");
				System.out.print("加えた後のデータ型は");
				displayType(intType + charType);
				break;

			case "44":
				System.out.println("お選びになったのはLong型+Long型");
				System.out.print("加えた後のデータ型は");
				displayType(longType + longType);
				break;

			case "45":
			case "54":
				System.out.println("お選びになったのはLong型+Float型");
				System.out.print("加えた後のデータ型は");
				displayType(longType + floatType);
				break;

			case "46":
			case "64":
				System.out.println("お選びになったのはLong型+Double型");
				System.out.print("加えた後のデータ型は");
				displayType(longType + doubleType);
				break;

			case "47":
			case "74":
				System.out.println("お選びになったのはLong型+Character型");
				System.out.print("加えた後のデータ型は");
				displayType(longType + charType);
				break;

			case "55":
				System.out.println("お選びになったのはFloat型+Float型");
				System.out.print("加えた後のデータ型は");
				displayType(floatType + floatType);
				break;

			case "56":
			case "65":
				System.out.println("お選びになったのはFloat型+Double型");
				System.out.print("相加后的数据类型为");
				displayType(floatType + doubleType);
				break;

			case "57":
			case "75":
				System.out.println("お選びになったのはFloat型+Character型");
				System.out.print("加えた後のデータ型は");
				displayType(floatType + charType);
				break;

			case "66":
				System.out.println("お選びになったのはDouble型+Double型");
				System.out.print("加えた後のデータ型は");
				displayType(doubleType + doubleType);
				break;

			case "67":
			case "76":
				System.out.println("お選びになったのはDouble型+Character型");
				System.out.print("加えた後のデータ型は");
				displayType(doubleType + charType);
				break;

			case "77":
				System.out.println("お選びになったのはCharacter型+Character型");
				System.out.print("加えた後のデータ型は");
				displayType(charType + charType);
				break;

			default:
				System.out.println("ご入力の数字が間違っています，1から7までお選びください");
			}
		}
	}

	// displayTypeメソッドを定義する
	public static void displayType(Object a) {
		StringBuilder dataType = new StringBuilder();
		// StringBuilder型の変数を通じて、文字列化された引数のデータ型を格納する
		// getClassメソッドで引数のデータ型をゲットした後、String型に変換する（文字列化する）
		// ゲットしたデータ型はclass java.lang.〇〇〇の形なので、17位から後ろの文字列を出力する
		for (int i = 16; i < a.getClass().toString().length(); i++) {
			dataType.append(a.getClass().toString().charAt(i));
		}
		System.out.println(dataType + "型");
	}
}