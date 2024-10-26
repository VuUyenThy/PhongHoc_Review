package vuUyenThy;

public class PhongMT extends PhongHoc {

	@Override
	public boolean datChuan() {
		if (getDienTich()/mayTinh > 1.5 && getDienTich()/mayTinh < 3) {
			return true;
		} else {
			return false;
		}
		
	}
	
	private int mayTinh;

	public int getMayTinh() {
		return mayTinh;
	}

	public void setMayTinh(int mayTinh) {
		this.mayTinh = mayTinh;
	}

	public PhongMT(String maPhong, String dayNha, double dienTich, int soBongDen, int mayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.mayTinh = mayTinh;
	}

	public PhongMT(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		String datChuan =(datChuan())?"Dat chuan":"Khong dat";
		return super.toString()+String.format("|%10s|%10s",getMayTinh(),datChuan());
	}

}
