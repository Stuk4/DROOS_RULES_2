package edu.cibertec.drools.bean;

public class Transaction {
	
	private String trace;
	private String mti;
	private String 	prcode;
	private int amount;
	private String merchant;
	private String authID;
	private int ccode;
	private String toApp;
	
	public Transaction() {
		super();
	}
	
	public Transaction(String trace, String mti, String prcode, int amount,
			String merchant, String authID, int ccode) {
		super();
		this.trace = trace;
		this.mti = mti;
		this.prcode = prcode;
		this.amount = amount;
		this.merchant = merchant;
		this.authID = authID;
		this.ccode = ccode;
	}
	public String getTrace() {
		return trace;
	}
	public void setTrace(String trace) {
		this.trace = trace;
	}
	public String getMti() {
		return mti;
	}
	public void setMti(String mti) {
		this.mti = mti;
	}
	public String getPrcode() {
		return prcode;
	}
	public void setPrcode(String prcode) {
		this.prcode = prcode;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getMerchant() {
		return merchant;
	}
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	public String getAuthID() {
		return authID;
	}
	public void setAuthID(String authID) {
		this.authID = authID;
	}
	public int getCcode() {
		return ccode;
	}
	public void setCcode(int ccode) {
		this.ccode = ccode;
	}
	public String getToApp() {
		return toApp;
	}
	public void setToApp(String toApp) {
		this.toApp = toApp;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((authID == null) ? 0 : authID.hashCode());
		result = prime * result + ccode;
		result = prime * result
				+ ((merchant == null) ? 0 : merchant.hashCode());
		result = prime * result + ((mti == null) ? 0 : mti.hashCode());
		result = prime * result + ((prcode == null) ? 0 : prcode.hashCode());
		result = prime * result + ((toApp == null) ? 0 : toApp.hashCode());
		result = prime * result + ((trace == null) ? 0 : trace.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (amount != other.amount)
			return false;
		if (authID == null) {
			if (other.authID != null)
				return false;
		} else if (!authID.equals(other.authID))
			return false;
		if (ccode != other.ccode)
			return false;
		if (merchant == null) {
			if (other.merchant != null)
				return false;
		} else if (!merchant.equals(other.merchant))
			return false;
		if (mti == null) {
			if (other.mti != null)
				return false;
		} else if (!mti.equals(other.mti))
			return false;
		if (prcode == null) {
			if (other.prcode != null)
				return false;
		} else if (!prcode.equals(other.prcode))
			return false;
		if (toApp == null) {
			if (other.toApp != null)
				return false;
		} else if (!toApp.equals(other.toApp))
			return false;
		if (trace == null) {
			if (other.trace != null)
				return false;
		} else if (!trace.equals(other.trace))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Trx [trace=" + trace + ", mti=" + mti + ", prcode=" + prcode
				+ ", amount=" + amount + ", merchant=" + merchant + ", authID="
				+ authID + ", ccode=" + ccode + ", toApp=" + toApp + "]";
	}
	

	
	
}
