package main;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		System.out.println("드라이버를 선택하세요.");
		System.out.println("1 : mysql");
		System.out.println("2 : oracle");
		System.out.println("3 : postgres");
		
		// 숫자 입력받기
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		DBDriver dbDriver = null;

		if (num == 1) {
			dbDriver = new MySqlBDriver();
			dbDriver.dbConnect();
		} else if (num == 2) {
			dbDriver = new OracleDBDriver();
			dbDriver.dbConnect();
		} else if (num == 3) {
			dbDriver = new PostgresDBDriver();
			dbDriver.dbConnect();
		} else {
			System.out.println("잘못된 값이 입력되었습니다..");
		}

//		if (dbDriver != null) {
//			dbDriver.dbConnect();
//		}
	}

}

interface DBDriver {
	public void dbConnect();
}

class MySqlBDriver implements DBDriver {
	@Override
	public void dbConnect() {
		System.out.println("MySql DB에 연결합니다");
	}
}

class OracleDBDriver implements DBDriver {
	@Override
	public void dbConnect() {
		System.out.println("Oracle DB에 연결합니다.");
	}
}

class PostgresDBDriver implements DBDriver {
	@Override
	public void dbConnect() {
		System.out.println("Postgres DB에 연결합니다.");
	}
}