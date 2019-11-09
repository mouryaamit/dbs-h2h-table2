package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Extern {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String market;
	
	private String uniqueIdentifier;
	
	private String equity;
	
	private String tradedQuntity;
	
	private String tradeType;
	
	private String intraDay;
	
	private Double price;
	
	private String dealId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public String getUniqueIdentifier() {
		return uniqueIdentifier;
	}

	public void setUniqueIdentifier(String uniqueIdentifier) {
		this.uniqueIdentifier = uniqueIdentifier;
	}

	public String getEquity() {
		return equity;
	}

	public void setEquity(String equity) {
		this.equity = equity;
	}

	public String getTradedQuntity() {
		return tradedQuntity;
	}

	public void setTradedQuntity(String tradedQuntity) {
		this.tradedQuntity = tradedQuntity;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getIntraDay() {
		return intraDay;
	}

	public void setIntraDay(String intraDay) {
		this.intraDay = intraDay;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDealId() {
		return dealId;
	}

	public void setDealId(String dealId) {
		this.dealId = dealId;
	}
	
	
	
	
}
