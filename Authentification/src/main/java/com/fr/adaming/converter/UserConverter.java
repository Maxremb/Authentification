package com.fr.adaming.converter;

import com.fr.adaming.dto.LoginDto;
import com.fr.adaming.entity.User;

public class UserConverter {

	public User ConvertDtoToUser(LoginDto ldto) {
		User u = new User();
		u.setEmail(ldto.getEmail());
		u.setPwd(ldto.getPwd());
		return u;

	}

	public LoginDto ConvertUserToDto(User u) {
		LoginDto ldto = new LoginDto();
		ldto.setEmail(u.getEmail());
		ldto.setPwd(u.getPwd());
		return ldto;
	}
}
