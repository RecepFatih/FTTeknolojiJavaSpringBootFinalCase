package FtTeknolojiPracticum.FinalCase.business.concretes;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import FtTeknolojiPracticum.FinalCase.business.abstracts.ExchangeService;
import FtTeknolojiPracticum.FinalCase.core.utilities.results.ErrorResult;
import FtTeknolojiPracticum.FinalCase.core.utilities.results.Result;
import FtTeknolojiPracticum.FinalCase.core.utilities.results.SuccessResult;
import FtTeknolojiPracticum.FinalCase.core.utilities.validation.AlimValidator;
import FtTeknolojiPracticum.FinalCase.dataAccess.abstracts.HesapBilgisiDao;
import FtTeknolojiPracticum.FinalCase.dataAccess.abstracts.HesapHareketleriDao;
import FtTeknolojiPracticum.FinalCase.dataAccess.abstracts.KullaniciDao;
import FtTeknolojiPracticum.FinalCase.entities.concretes.HesapHareketi;
import FtTeknolojiPracticum.FinalCase.entities.concretes.Kullanici;

@Service
public class ExchangeManager implements ExchangeService{

	private KullaniciDao kullaniciDao;
	private HesapHareketleriDao hesapHareketleriDao;
	
	@Autowired
	public ExchangeManager(KullaniciDao kullaniciDao,HesapHareketleriDao hesapHareketleriDao) {
		super();
		this.kullaniciDao = kullaniciDao;
		this.hesapHareketleriDao = hesapHareketleriDao;
	}

	@Override
	public Result alim(int miktar, String eposta, String sifre, int dovizTuru) {
		
		Kullanici kullanici = this.kullaniciDao.findByEpostaAndSifre(eposta, sifre);
		
		int kurDolar = 18;
		int kurEuro = 17;
		int kurAltın = 1000;
		
		if(dovizTuru == 1) {
			
			Result altın = AlimValidator.yeterliMi(kullanici.getHesapBilgisi().getTl(), miktar, kurAltın);
			if(!altın.isSuccess()) return new ErrorResult(altın.getMessage());
			
			kullanici.getHesapBilgisi().setAltin(kullanici.getHesapBilgisi().getAltin()+miktar);
			kullanici.getHesapBilgisi().setTl(kullanici.getHesapBilgisi().getTl()-(miktar*kurAltın));
			
			HesapHareketi hesapHareketi = new HesapHareketi();
			hesapHareketi.setKullanici(kullanici);
			hesapHareketi.setAlimMiktari(miktar);
			hesapHareketi.setSatisMiktari(miktar*kurAltın);
			hesapHareketi.setIslemZamani(LocalDateTime.now());
			hesapHareketi.setAciklama("Alınan miktar: " + String.valueOf(miktar) + " Alım kuru: " + String.valueOf(kurAltın));
			this.hesapHareketleriDao.save(hesapHareketi);
			
			return new SuccessResult("Alım başarılı");
			
			
		}
		
		else if (dovizTuru == 2) {
			
		}
		
		else if(dovizTuru == 3) {
			
		}
		
		return null;
	}

	@Override
	public Result satim(int miktar, String eposta, String sifre, int dovizTuru) {
		// TODO Auto-generated method stub
		return null;
	}

}
