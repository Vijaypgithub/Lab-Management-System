package lab__model;

public class CbcTest {
	private float hemoglobin;
	private float platelates;
	private float erythrocytes;
	private int leucocytes;
	private int eosinophil;
	private int lymphocyte;
	private int monocyte;
	private int basophils;

	public CbcTest() {

	}

	public CbcTest(float hemoglobin, float platelates, float erythrocytes, int leucocytes, int eosinophil,
			int lymphocyte, int monocyte, int basophils) {
		this.hemoglobin = hemoglobin;
		this.platelates = platelates;
		this.erythrocytes = erythrocytes;
		this.leucocytes = leucocytes;
		this.eosinophil = eosinophil;
		this.lymphocyte = lymphocyte;
		this.monocyte = monocyte;
		this.basophils = basophils;
	}

	public void setHemoglobin(float hemoglobin) {
		this.hemoglobin = hemoglobin;
	}

	public void setPlatelates(float platelates) {
		this.platelates = platelates;
	}

	public void setErythrocytes(float erythrocytes) {
		this.erythrocytes = erythrocytes;
	}

	public void setLeucocytes(int leucocytes) {
		this.leucocytes = leucocytes;
	}

	public void setEosinophil(int eosinophil) {
		this.eosinophil = eosinophil;
	}

	public void setLymphocyte(int lymphocyte) {
		this.lymphocyte = lymphocyte;
	}

	public void setMonocyte(int monocyte) {
		this.monocyte = monocyte;
	}

	public void setBasophils(int basophils) {
		this.basophils = basophils;
	}

	public float getHemoglobin() {
		return hemoglobin;
	}

	public float getPlatelates() {
		return platelates;
	}

	public float getErythrocytes() {
		return erythrocytes;
	}

	public int getLeucocytes() {
		return leucocytes;
	}

	public int getEosinophil() {
		return eosinophil;
	}

	public int getLymphocyte() {
		return lymphocyte;
	}

	public int getMonocyte() {
		return monocyte;
	}

	public int getBasophils() {
		return basophils;
	}

	@Override
	public String toString() {
		return "hemoglobin=" + hemoglobin + ", platelates=" + platelates + ", erythrocytes=" + erythrocytes
				+ ", leucocytes=" + leucocytes + ", eosinophil=" + eosinophil + ", lymphocyte=" + lymphocyte
				+ ", monocyte=" + monocyte + ", basophils=" + basophils;
	}

}
