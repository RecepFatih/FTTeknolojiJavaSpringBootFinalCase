package FtTeknolojiPracticum.FinalCase.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "hesap_hareketleri")
@NoArgsConstructor
@AllArgsConstructor
public class HesapHareketi {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "islem_zamani")
	private LocalDateTime islemZamani = LocalDateTime.now();
	
	@Column(name = "alim_miktari")
	private int alimMiktari;
	
	@Column(name = "satis_miktari")
	private int satisMiktari;
	
	@Column(name = "aciklama")
	private String aciklama;
	
	@ManyToOne()
	@JoinColumn(name = "kullanici_id")
	private Kullanici kullanici;
	

}
