package FtTeknolojiPracticum.FinalCase.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import FtTeknolojiPracticum.FinalCase.entities.concretes.Kullanici;

public interface KullaniciDao extends JpaRepository<Kullanici, Integer>{
	
	Kullanici findByEpostaAndSifre(String ePosta, String sifre);
	
}
