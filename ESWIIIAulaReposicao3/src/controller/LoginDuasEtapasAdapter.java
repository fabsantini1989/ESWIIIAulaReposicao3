package controller;

import model.Login;

public class LoginDuasEtapasAdapter implements IServicoLogin {

	LoginDuasEtapas lduasetapas;

	public LoginDuasEtapasAdapter(LoginDuasEtapas lgn2e) {
		this.lduasetapas = lduasetapas;
	}

	@Override
	public void logar(Login login) {
		lduasetapas.fazerLogin(login.getNome(), login.getSenha(), login.getCodigo());

	}

}
