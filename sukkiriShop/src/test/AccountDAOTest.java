package test;

import dao.AccountDAO;
import model.Account;
import model.Login;

public class AccountDAOTest {
	public static void main (String[] args) {
		testFindByLogic1();
		testFindByLogic2();
	}

	public static void testFindByLogic1() {
		Login login = new Login("minato", "1234");
		AccountDAO dao = new AccountDAO();
		Account result = dao.findByLogin(login);
		String id =result.getUserId().trim();

		if (result != null) {
			System.out.println("ユーザーが見つかりました");
		}
		if (result.getUserId() == null) {
			System.out.println("IDがNULLです");
		} else {
			System.out.println(result.getUserId());
		}
		if (id.equals("minato")) {
			System.out.println("IDが一致しました");
		}
		if (result.getPass().equals("1234")) {
			System.out.println("パスワードが一致しました");
		}
		if (result.getMail().equals("minato@sukkiri.com")) {
			System.out.println("メールアドレスが一致しました");
		}
		if (result.getName().equals("湊 雄輔")) {
			System.out.println("姓名が一致しました");
		}
		if (result.getAge() == 23) {
			System.out.println("年齢が一致しました");
		}

		if (result != null &&
				result.getUserId().trim().equals("minato") &&
				result.getPass().equals("1234") &&
				result.getMail().equals("minato@sukkiri.com") &&
				result.getName().equals("湊 雄輔") &&
				result.getAge() == 23) {
			System.out.println("testFindByLogic1:成功しました");
		} else {
			System.out.println("testFindByLogic1:失敗しました");
		}
	}

	public static void testFindByLogic2() {
		Login login = new Login("minato", "12345");
		AccountDAO dao = new AccountDAO();
		Account result = dao.findByLogin(login);

		if (result == null) {
			System.out.println("testFindByLogic2:成功しました");
		} else {
			System.out.println("testFindByLogic2:失敗しました");
		}
	}
}
