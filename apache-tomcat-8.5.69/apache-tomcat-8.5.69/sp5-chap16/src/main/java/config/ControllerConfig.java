package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.ChangePwdController;
import controller.LoginController;
import controller.MemberDetailController;
import controller.MemberListController;
import controller.RegisterController;
import controller.RestMemberController;
import spring.AuthService;
import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberRegisterService;
import survey.SurveyController;

@Configuration
public class ControllerConfig {
	
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private ChangePasswordService changePasswordService;
	@Autowired
	private MemberRegisterService memberRegSvc;
	@Autowired
	private AuthService authService;
	
	@Bean
	public RestMemberController restApi() {
		RestMemberController cont=new RestMemberController();
		cont.setMemberDao(memberDao);
		cont.setRegisterService(memberRegSvc);
		
		return cont;
	}
	@Bean
	public MemberDetailController memberDetailController() {
		MemberDetailController controller = new MemberDetailController();
		controller.setMemberDao(memberDao);
		return controller;
	}
	@Bean
	public MemberListController memberListController() {
		MemberListController controller = new MemberListController();
		controller.setMemberDao(memberDao);
		return controller;
	}
	
	@Bean
	public ChangePwdController changePwdController() {
		ChangePwdController controller = new ChangePwdController();
		controller.setChangePasswordService(changePasswordService);
		return controller;
	}
	@Bean
	public RegisterController registerController() {
		RegisterController controller = new RegisterController();
		controller.setMemberRegisterService(memberRegSvc);
		return controller;
	}
	
	@Bean
	public LoginController loginController() {
		LoginController controller = new LoginController();
		controller.setAuthService(authService);
		return controller;
	}
	
	@Bean
	public SurveyController surveyController() {
		return new SurveyController();
	}
	
}
