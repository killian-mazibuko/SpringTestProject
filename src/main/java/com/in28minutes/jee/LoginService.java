package com.in28minutes.jee;

public class LoginService {
	public boolean isValid(String user, String password)
	{
		if ( user.equals("in28minutes")&& password.equals("somePassword"))
			return true;
		else
			return false;
	}
}
