package FtTeknolojiPracticum.FinalCase.business.abstracts;

import java.util.List;

import FtTeknolojiPracticum.FinalCase.core.utilities.results.DataResult;
import FtTeknolojiPracticum.FinalCase.entities.concretes.HesapHareketi;


public interface HesapHareketleriService {
	DataResult<List<HesapHareketi>> getAll(int pageNo);
}
