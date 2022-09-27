package FtTeknolojiPracticum.FinalCase.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import FtTeknolojiPracticum.FinalCase.business.abstracts.HesapHareketleriService;
import FtTeknolojiPracticum.FinalCase.core.utilities.results.DataResult;
import FtTeknolojiPracticum.FinalCase.entities.concretes.HesapHareketi;

@RestController
@RequestMapping("/api/hesapHareketleri/")
public class HesapHareketleriController {
	
	private HesapHareketleriService hesapHareketleriService;

	@Autowired
	public HesapHareketleriController(HesapHareketleriService hesapHareketleriService) {
		super();
		this.hesapHareketleriService = hesapHareketleriService;
	}
	
	@GetMapping("/getAllByPage")
	public DataResult<List<HesapHareketi>> getAll(int pageNo){
		return this.hesapHareketleriService.getAll(pageNo);
	}

}
