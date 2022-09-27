package FtTeknolojiPracticum.FinalCase.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import FtTeknolojiPracticum.FinalCase.business.abstracts.HesapBilgisiService;
import FtTeknolojiPracticum.FinalCase.core.utilities.results.DataResult;
import FtTeknolojiPracticum.FinalCase.core.utilities.results.SuccessDataResult;
import FtTeknolojiPracticum.FinalCase.dataAccess.abstracts.HesapBilgisiDao;
import FtTeknolojiPracticum.FinalCase.entities.concretes.HesapBilgisi;

@Service
public class HesapBilgisiManager implements HesapBilgisiService{
	
	private HesapBilgisiDao hesapBilgisiDao;

	@Autowired
	public HesapBilgisiManager(HesapBilgisiDao hesapBilgisiDao) {
		super();
		this.hesapBilgisiDao = hesapBilgisiDao;
	}

	@Override
	public DataResult<HesapBilgisi> findById(int id) {
		
		return new SuccessDataResult<HesapBilgisi>(this.hesapBilgisiDao.findById(id),"Hesap bilgisi başarılı bir şekilde getirildi.");
	}
	
	

}
