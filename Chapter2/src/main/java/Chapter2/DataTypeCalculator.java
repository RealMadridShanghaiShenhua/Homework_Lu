package Chapter2;

import java.util.Scanner;

public class DataTypeCalculator {

	public static void main(String[] args) {

		byte byteType = 1;
		short shortType = 2;
		int intType = 4;
		long longType = 8L;
		System.out.println(longType);
		float floatType = 4.0F;
		double doubleType = 4.0;
		char charType = '1';

		System.out.println("本计算机可以展示不同数据类型相加后的数据结果");
		System.out.println("请选择您想查看哪两种数据类型相加的结果");

		while (true) {
			System.out.println("--------------------------------------------------");
			System.out.println("请选择第一个数的数据类型或按0退出");
			System.out.println("1. Byte型");
			System.out.println("2. Short型");
			System.out.println("3. Int型");
			System.out.println("4. Long型");
			System.out.println("5. FLoat型");
			System.out.println("6. Double 型");
			System.out.println("7. Char型");
			Scanner sc = new Scanner(System.in);
			String choiceOne = sc.nextLine();


			while ((choiceOne.contentEquals("1") | choiceOne.contentEquals("2")| choiceOne.contentEquals("3") | 
					choiceOne.contentEquals("4") | choiceOne.contentEquals("5") | choiceOne.contentEquals("6") | 
					choiceOne.contentEquals("7")|choiceOne.contentEquals("0") ) != true ) {
				System.out.println("您的第一个选择有误，请选择0-7之间的数");
				choiceOne = sc.nextLine();
			}
			
			if (choiceOne.contentEquals("0")) {
				System.out.println("谢谢使用");
				System.exit(0);
			}

			System.out.println("--------------------------------------------------");
			System.out.println("请选择第二个数的数据类型");
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
				System.out.println("您选择的是Byte型+Byte型");
				System.out.print("相加后的数据类型为");
				displayType(byteType + byteType);
				break;

			case "12":
			case "21":
				System.out.println("您选择的是Byte型+Short型");
				System.out.print("相加后的数据类型为");
				displayType(byteType + shortType);
				break;

			case "13":
			case "31":
				System.out.println("您选择的是Byte型+Integer型");
				System.out.print("相加后的数据类型为");
				displayType(byteType + intType);
				break;

			case "14":
			case "41":
				System.out.println("您选择的是Byte型+Long型");
				System.out.print("相加后的数据类型为");
				displayType(byteType + longType);
				break;

			case "15":
			case "51":
				System.out.println("您选择的是Byte型+Float型");
				System.out.print("相加后的数据类型为");
				displayType(byteType + floatType);
				break;

			case "16":
			case "61":
				System.out.println("您选择的是Byte型+Double型");
				System.out.print("相加后的数据类型为");
				displayType(byteType + doubleType);
				break;

			case "17":
			case "71":
				System.out.println("您选择的是Byte型+Character型");
				System.out.print("相加后的数据类型为");
				displayType(byteType + charType);
				break;

			case "22":
				System.out.println("您选择的是Short型+Short型");
				System.out.print("相加后的数据类型为");
				displayType(shortType + shortType);
				break;

			case "23":
			case "32":
				System.out.println("您选择的是Short型+Integer型");
				System.out.print("相加后的数据类型为");
				displayType(shortType + intType);
				break;

			case "24":
			case "42":
				System.out.println("您选择的是Short型+Long型");
				System.out.print("相加后的数据类型为");
				displayType(shortType + longType);
				break;

			case "25":
			case "52":
				System.out.println("您选择的是Short型+Float型");
				System.out.print("相加后的数据类型为");
				displayType(shortType + floatType);
				break;

			case "26":
			case "62":
				System.out.println("您选择的是Short型+Double型");
				System.out.print("相加后的数据类型为");
				displayType(shortType + doubleType);
				break;

			case "27":
			case "72":
				System.out.println("您选择的是Short型+Character型");
				System.out.print("相加后的数据类型为");
				displayType(shortType + charType);
				break;

			case "33":
				System.out.println("您选择的是Integer型+Integer型");
				System.out.print("相加后的数据类型为");
				displayType(intType + intType);
				break;

			case "34":
			case "43":
				System.out.println("您选择的是Integer型+Long型");
				System.out.print("相加后的数据类型为");
				displayType(intType + longType);
				break;

			case "35":
			case "53":
				System.out.println("您选择的是Integer型+Float型");
				System.out.print("相加后的数据类型为");
				displayType(intType + floatType);
				break;

			case "36":
			case "63":
				System.out.println("您选择的是Integer型+Double型");
				System.out.print("相加后的数据类型为");
				displayType(intType + doubleType);
				break;

			case "37":
			case "73":
				System.out.println("您选择的是Integer型+Character型");
				System.out.print("相加后的数据类型为");
				displayType(intType + charType);
				break;

			case "44":
				System.out.println("您选择的是Long型+Long型");
				System.out.print("相加后的数据类型为");
				displayType(longType + longType);
				break;

			case "45":
			case "54":
				System.out.println("您选择的是Long型+Float型");
				System.out.print("相加后的数据类型为");
				displayType(longType + floatType);
				break;

			case "46":
			case "64":
				System.out.println("您选择的是Long型+Double型");
				System.out.print("相加后的数据类型为");
				displayType(longType + doubleType);
				break;

			case "47":
			case "74":
				System.out.println("您选择的是Long型+Character型");
				System.out.print("相加后的数据类型为");
				displayType(longType + charType);
				break;

			case "55":
				System.out.println("您选择的是Float型+Float型");
				System.out.print("相加后的数据类型为");
				displayType(floatType + floatType);
				break;

			case "56":
			case "65":
				System.out.println("您选择的是Float型+Double型");
				System.out.print("相加后的数据类型为");
				displayType(floatType + doubleType);
				break;

			case "57":
			case "75":
				System.out.println("您选择的是Float型+Character型");
				System.out.print("相加后的数据类型为");
				displayType(floatType + charType);
				break;

			case "66":
				System.out.println("您选择的是Double型+Double型");
				System.out.print("相加后的数据类型为");
				displayType(doubleType + doubleType);
				break;

			case "67":
			case "76":
				System.out.println("您选择的是Double型+Character型");
				System.out.print("相加后的数据类型为");
				displayType(doubleType + charType);
				break;

			case "77":
				System.out.println("您选择的是Character型+Character型");
				System.out.print("相加后的数据类型为");
				displayType(charType + charType);
				break;

			default:
				System.out.println("您的第二个选择有误，请选择1-7之间的数");
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