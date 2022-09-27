package FtTeknolojiPracticum.FinalCase.business.abstracts;

import FtTeknolojiPracticum.FinalCase.core.utilities.results.Result;

public interface ExchangeService {
	
	Result alim(int miktar, String eposta, String sifre, int dovizTuru);
	Result satim(int miktar, String eposta, String sifre, int dovizTuru);
	

}
