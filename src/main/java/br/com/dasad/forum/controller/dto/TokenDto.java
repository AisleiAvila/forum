package br.com.dasad.forum.controller.dto;

public class TokenDto {
	
	public String token;
	public String tipo;

	public TokenDto(String token, String tipo) {
		this.tipo = tipo;
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
