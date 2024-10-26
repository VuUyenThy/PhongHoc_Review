package vuUyenThy;

public class PhongTN extends PhongHoc{

	@Override
	public boolean datChuan() {
		if(isBonRua()&& datChuan()) {
			return true;
		} else {
			return false;
		}
		
	}
	
	private boolean bonRua;

	public boolean isBonRua() {
		return bonRua;
	}

	public void setBonRua(boolean bonRua) {
		this.bonRua = bonRua;
	}

	public PhongTN(String maPhong, String dayNha, double dienTich, int soBongDen, boolean bonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.bonRua = bonRua;
	}

	public PhongTN(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		String datChuan= (datChuan())?"Da dat":"Chua dat";
		String bonRua = (isBonRua())?"Co bon rua":"Khong co bon rua";
		return super.toString()+String.format("|%10s|%10s", datChuan,bonRua);
	}
}
