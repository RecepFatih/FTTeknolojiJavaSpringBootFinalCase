package FtTeknolojiPracticum.FinalCase.business.abstracts;

import FtTeknolojiPracticum.FinalCase.core.utilities.results.Result;

public interface LoginService {
	
	Result findByEPostaAndSifre(String ePosta, String sifre);

}
