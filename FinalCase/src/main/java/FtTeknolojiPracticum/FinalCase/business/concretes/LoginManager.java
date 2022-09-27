package FtTeknolojiPracticum.FinalCase.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import FtTeknolojiPracticum.FinalCase.business.abstracts.LoginService;
import FtTeknolojiPracticum.FinalCase.core.utilities.results.ErrorResult;
import FtTeknolojiPracticum.FinalCase.core.utilities.results.Result;
import FtTeknolojiPracticum.FinalCase.core.utilities.results.SuccessResult;
import FtTeknolojiPracticum.FinalCase.dataAccess.abstracts.KullaniciDao;
import FtTeknolojiPracticum.FinalCase.entities.concretes.Kullanici;

@Service
public class LoginManager implements LoginService{
	
	private KullaniciDao kullaniciDao;

	@Autowired
	public LoginManager(KullaniciDao kullaniciDao) {
		super();
		this.kullaniciDao = kullaniciDao;
	}

	@Override
	public Result findByEPostaAndSifre(String ePosta, String sifre) {
		
		Kullanici kullanici = this.kullaniciDao.findByEpostaAndSifre(ePosta, sifre);
		 
		if(kullanici == null) return new ErrorResult("Kullanıcı bulunamadı. Mail veya şifre hatalı!");
		 
		 
		return new SuccessResult("Giriş başarılı bir şekilde yapıldı.");
	}
	

}
