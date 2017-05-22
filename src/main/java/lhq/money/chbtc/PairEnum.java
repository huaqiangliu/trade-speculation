package lhq.money.chbtc;

import lhq.money.enu.CurrencyEnum;

import java.math.BigDecimal;

public enum PairEnum {
	
	ETHCNY(CurrencyEnum.ETH, CurrencyEnum.CNY, new BigDecimal("0.0015"), new BigDecimal("1"), new BigDecimal("0.02")),
	ETCCNY(CurrencyEnum.ETC, CurrencyEnum.CNY, new BigDecimal("0.0020"), new BigDecimal("10"), new BigDecimal("0.2"));
	
	private CurrencyEnum currency1;
	private CurrencyEnum currency2;
	private BigDecimal fee;
	private BigDecimal volLimit;
	private BigDecimal minVol;
	
	PairEnum(CurrencyEnum currency1, CurrencyEnum currency2, BigDecimal fee, BigDecimal volLimit, BigDecimal minVol) {
		this.currency1 = currency1;
		this.currency2 = currency2;
		this.fee = fee;
		this.volLimit = volLimit;
		this.minVol = minVol;
	}

	public CurrencyEnum getCurrency1() {
		return currency1;
	}

	public CurrencyEnum getCurrency2() {
		return currency2;
	}

	public BigDecimal getFee() {
		return fee;
	}

	public BigDecimal getVolLimit() {
		return volLimit;
	}

	public BigDecimal getMinVol() {
		return minVol;
	}
	
	

}
