package FtTeknolojiPracticum.FinalCase.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import FtTeknolojiPracticum.FinalCase.entities.concretes.HesapHareketi;

public interface HesapHareketleriDao extends JpaRepository<HesapHareketi, Integer>{

	
	
}
