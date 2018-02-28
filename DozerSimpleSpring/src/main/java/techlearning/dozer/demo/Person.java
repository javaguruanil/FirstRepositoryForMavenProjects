package techlearning.dozer.demo;

public class Person {
	private int pId;
	private String pN;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpN() {
		return pN;
	}

	public void setpN(String pN) {
		this.pN = pN;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pN=" + pN + "]";
	}

}
