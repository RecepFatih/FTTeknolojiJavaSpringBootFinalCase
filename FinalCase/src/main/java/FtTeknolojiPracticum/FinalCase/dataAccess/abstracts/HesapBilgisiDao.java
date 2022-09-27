package FtTeknolojiPracticum.FinalCase.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import FtTeknolojiPracticum.FinalCase.entities.concretes.HesapBilgisi;

public interface HesapBilgisiDao extends JpaRepository<HesapBilgisi, Integer>{
	
	HesapBilgisi findById(int id);
}
