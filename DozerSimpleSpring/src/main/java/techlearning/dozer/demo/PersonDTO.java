package techlearning.dozer.demo;

public class PersonDTO {
	private int prdId;
	private String prdN;

	public int getPrdId() {
		return prdId;
	}

	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}

	public String getPrdN() {
		return prdN;
	}

	public void setPrdN(String prdN) {
		this.prdN = prdN;
	}

	@Override
	public String toString() {
		return "PersonDTO [prdId=" + prdId + ", prdN=" + prdN + "]";
	}

}
