package controller;

import model.Login;

public class LoginTokenAdapter implements IServicoLogin {
	
	LoginToken lt;
	
	public LoginTokenAdapter (LoginToken lt) {
		this.lt = lt;
	}

	@Override
	public void logar(Login login) {
		lt.enviarToken(login.getToken());
		
	}

}