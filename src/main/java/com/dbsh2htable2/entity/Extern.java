package com.dbsh2htable2.entity;


import javax.persistence.*;

@Entity
@Table(name="EXT")
public class Extern {

	/*
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="empid")
	private long empId;
	@Column(name="empname")
	private String empName;
	@Column(name="empemail")
	private String email;

	Exchange ,Unique_Identifier ,Equity ,	Lot,Trade_Type,Intra_Day ,	Price,Deal_ID,DAY_NUM

	*/

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="Exchange")
    private String market;

    @Column(name="Unique_Identifier")
    private String uniqueIdentifier;

    @Column(name="Equity")
    private String equity;

    @Column(name="Lot")
    private String tradedQuntity;
    @Column(name="Trade_Type")
    private String tradeType;

    @Column(name="Intra_Day")
    private String intraDay;

    @Column(name="Price")
    private Double price;

    public int getDayNum() {
        return dayNum;
    }

    public void setDayNum(int dayNum) {
        this.dayNum = dayNum;
    }

    @Column(name="Deal_ID")
    private String dealId;

    @Column(name="DAY_NUM")
    private int dayNum;

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
