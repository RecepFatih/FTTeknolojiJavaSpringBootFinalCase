package FtTeknolojiPracticum.FinalCase.entities.concretes;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "kullanicilar")
@NoArgsConstructor
@AllArgsConstructor

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Kullanici {
	
	@Id
	@Column(name = "id", nullable = false, unique = true)
	private int id;
	
	@Column(name = "ad")
	private String ad;
	
	@Column(name = "soyad")
	private String soyad;
	
	@Column(name = "e_posta")
	private String eposta;
	
	@Column(name = "sifre")
	private String sifre;
	
	@JsonIgnore
	@OneToMany(mappedBy = "kullanici")
	private List<HesapHareketi> hesapHareketleri;
	
	@JsonIgnore
	@OneToOne(mappedBy = "kullanici")
	private HesapBilgisi hesapBilgisi;

}
