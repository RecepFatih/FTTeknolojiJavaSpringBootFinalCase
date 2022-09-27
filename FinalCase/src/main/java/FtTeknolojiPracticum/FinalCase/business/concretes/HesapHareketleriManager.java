package FtTeknolojiPracticum.FinalCase.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import FtTeknolojiPracticum.FinalCase.business.abstracts.HesapHareketleriService;
import FtTeknolojiPracticum.FinalCase.core.utilities.results.DataResult;
import FtTeknolojiPracticum.FinalCase.core.utilities.results.SuccessDataResult;
import FtTeknolojiPracticum.FinalCase.dataAccess.abstracts.HesapHareketleriDao;
import FtTeknolojiPracticum.FinalCase.entities.concretes.HesapHareketi;

@Service
public class HesapHareketleriManager implements HesapHareketleriService{
	
	private HesapHareketleriDao hesapHareketleriDao;
	
	@Autowired
	public HesapHareketleriManager(HesapHareketleriDao hesapHareketleriDao) {
		super();
		this.hesapHareketleriDao = hesapHareketleriDao;
	}


	@Override
	public DataResult<List<HesapHareketi>> getAll(int pageNo) {
		Pageable pageable = PageRequest.of(pageNo-1, 5);
		
		return new SuccessDataResult<List<HesapHareketi>>
		(this.hesapHareketleriDao.findAll(pageable).getContent());
	}

}
