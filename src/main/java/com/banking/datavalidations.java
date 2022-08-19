package com.banking;
import java.io.IOException;
import java.util.regex.Pattern;


public class datavalidations {
	//checks the username with out regex
	public boolean checkUsername(String username) throws IOException{
		
		if(Pattern.matches("[a-zA-Z]{5,13}", username))
		{
			return true;
		}
		else {
			throw new IOException("username is not valid"); 
		}
		
	}
	//check password with our regex
public boolean checkPassword(String pwd) throws IOException{
		
		if(Pattern.matches("[a-zA-Z0-9@#]{6,}", pwd))
		{
			return true;
		}
		else {
			throw new IOException("password is not valid"); 
		}
		
	}
	//matching the password
public boolean logincheck(String username,String password) throws IOException
{
	String pwd=username.substring(0,3);
	pwd +="@123";
	
	if(password.equals(pwd))
	{
		return true;
	}
	else {
		throw new IOException("Wrong username or password");
	}
	
}	
}
