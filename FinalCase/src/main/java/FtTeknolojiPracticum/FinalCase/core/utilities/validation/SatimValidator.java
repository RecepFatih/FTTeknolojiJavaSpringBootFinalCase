package FtTeknolojiPracticum.FinalCase.core.utilities.validation;

import FtTeknolojiPracticum.FinalCase.core.utilities.results.ErrorResult;
import FtTeknolojiPracticum.FinalCase.core.utilities.results.Result;
import FtTeknolojiPracticum.FinalCase.core.utilities.results.SuccessResult;

public class SatimValidator {
	
	public static Result yeterliMi(int hesapBilgisi, int miktar) {
		
		if(hesapBilgisi >= miktar) {
			return new SuccessResult();
		}
		return new ErrorResult("Hesapta yeterli miktarda para yok!");
	}

}
