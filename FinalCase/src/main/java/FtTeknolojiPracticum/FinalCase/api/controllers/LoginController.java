package FtTeknolojiPracticum.FinalCase.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import FtTeknolojiPracticum.FinalCase.business.abstracts.LoginService;
import FtTeknolojiPracticum.FinalCase.core.utilities.results.Result;

@RestController
@RequestMapping("/api/login/")
public class LoginController {
	
	private LoginService loginService;

	@Autowired
	public LoginController(LoginService loginService) {
		super();
		this.loginService = loginService;
	}
	
	@GetMapping("findByEPostaAndSifre")
	public Result findByEPostaAndSifre(@RequestParam String ePosta,@RequestParam String sifre) {
		return this.loginService.findByEPostaAndSifre(ePosta, sifre);
	}
	

}
