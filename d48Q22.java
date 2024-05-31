//s23010
//d48Q22のコンパイルエラーを修正

enum Connection {OFFLINE,ONLINE}

class d48Q22 {
	public static void main(String[] args) {
		Connection s = Connection.OFFLINE;
		if (s == Connection.OFFLINE) {
			s = Connection.ONLINE;
		}
		System.out.println(s);
	}
}

