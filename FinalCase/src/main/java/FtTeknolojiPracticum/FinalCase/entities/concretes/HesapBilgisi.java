package FtTeknolojiPracticum.FinalCase.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "hesap_bilgileri")
@NoArgsConstructor
@AllArgsConstructor
public class HesapBilgisi {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "tl")
	private int tl;
	
	@Column(name = "altin")
	private int altin;
	
	@Column(name = "dolar")
	private int dolar;
	
	@Column(name = "euro")
	private Integer euro;
	
	@OneToOne()
	@JoinColumn(name = "kullanici_id")
	private Kullanici kullanici;
	
}
