//s23010
//Q23コンパイルエラー修正

class d48Q23 {
	public static void main(String[] args) {
		int i = 1;
		for (;;) {
			i = i + 3;
			if (i < 10) {
				continue;
			} else {
				break;
			}
			System.out.println(i);
		}
	}
}
