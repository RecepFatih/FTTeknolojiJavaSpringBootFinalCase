package FtTeknolojiPracticum.FinalCase.business.abstracts;

import FtTeknolojiPracticum.FinalCase.core.utilities.results.DataResult;
import FtTeknolojiPracticum.FinalCase.entities.concretes.HesapBilgisi;

public interface HesapBilgisiService {
	
	DataResult<HesapBilgisi> findById(int id);
	
}
