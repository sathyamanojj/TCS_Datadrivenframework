package test;

import org.testng.annotations.Test;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

import org.testng.annotations.Parameters;

import POM.Login;

public class LoginValidation extends BaseTest {

	//@Parameters({ "validUsername", "validPassword" })
	@Test
	public void validUsernameValidPassword(String username, String password) throws IOException {
	//public void validUsernameValidPassword() throws IOException {
		//Properties properties = new Properties();
		Yaml yaml = new Yaml();
		//InputStream inputstream = new FileInputStream((new File(C:\\Users\Administrator\\eclipse-workspace\\data-driven-framework\\src\\test\\resources\\properties\\read.yaml);
		//Map<String,Object> data = yaml.load(inputstream);
		//yaml.load(inputstream);
		InputStream inputstream = new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\data-driven-framework\\src\\test\\resources\\properties\\read.yaml");
		yaml.load(inputstream);
		System.out.println(yaml.getName());
		
	
		Login obj = new Login(driver);
		obj.loginWithCredentials(username, password);
	}

}
