package lab_service;

import lab__dao.SignUpDAO;
import lab__model.Signup;

public class Service {

	public boolean checkValid(Signup e, String confirmPassword) {
		SignUpDAO dao = new SignUpDAO();
		boolean flag = false;
		if (e.getPassword().equals(confirmPassword)) {
			flag = dao.signUp(e);
		}
		return flag;
	}

	public boolean checkUserIsPresent(Signup sUp) {
		SignUpDAO dao = new SignUpDAO();
		boolean flag = false;
		flag = dao.getLogin(sUp);
		return flag;
	}

}
