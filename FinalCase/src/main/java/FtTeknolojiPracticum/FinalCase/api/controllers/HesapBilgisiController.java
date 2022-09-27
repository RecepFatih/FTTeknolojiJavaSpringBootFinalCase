package FtTeknolojiPracticum.FinalCase.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import FtTeknolojiPracticum.FinalCase.business.abstracts.HesapBilgisiService;
import FtTeknolojiPracticum.FinalCase.core.utilities.results.DataResult;
import FtTeknolojiPracticum.FinalCase.entities.concretes.HesapBilgisi;

@RestController
@RequestMapping("/api/hesapBilgisi/")
public class HesapBilgisiController {
	
	private HesapBilgisiService hesapBilgisiService;

	@Autowired
	public HesapBilgisiController(HesapBilgisiService hesapBilgisiService) {
		super();
		this.hesapBilgisiService = hesapBilgisiService;
	}
	
	@GetMapping("findById")
	public DataResult<HesapBilgisi> findById(int id){
		return this.hesapBilgisiService.findById(id);
	}

}
