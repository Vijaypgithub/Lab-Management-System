package lab__model;

public class lipidPanel {
	private int ch;
	private int tr;
	private int cho;
	private int lch;
	private int vldl;
	private int ldl;
	private int total;

	public lipidPanel(int ch, int tr, int cho, int lch, int vldl, int ldl, int total) {
		this.ch = ch;
		this.tr = tr;
		this.cho = cho;
		this.lch = lch;
		this.vldl = vldl;
		this.ldl = ldl;
		this.total = total;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getTr() {
		return tr;
	}

	public void setTr(int tr) {
		this.tr = tr;
	}

	public int getCho() {
		return cho;
	}

	public void setCho(int cho) {
		this.cho = cho;
	}

	public int getLch() {
		return lch;
	}

	public void setLch(int lch) {
		this.lch = lch;
	}

	public int getVldl() {
		return vldl;
	}

	public void setVldl(int vldl) {
		this.vldl = vldl;
	}

	public int getLdl() {
		return ldl;
	}

	public void setLdl(int ldl) {
		this.ldl = ldl;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
