package FtTeknolojiPracticum.FinalCase.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import FtTeknolojiPracticum.FinalCase.business.abstracts.ExchangeService;
import FtTeknolojiPracticum.FinalCase.core.utilities.results.Result;

@RestController
@RequestMapping("/api/exchange/")
public class ExchangeController {
	
	private ExchangeService exchangeService;

	@Autowired
	public ExchangeController(ExchangeService exchangeService) {
		super();
		this.exchangeService = exchangeService;
	}
	
	@GetMapping("alim")
	public Result alim(@RequestParam int miktar,@RequestParam String eposta,@RequestParam String sifre,@RequestParam int dovizTuru) {
		return this.exchangeService.alim(miktar, eposta, sifre, dovizTuru);
	}

}
