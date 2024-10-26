package vuUyenThy;

import java.util.Objects;

public abstract class PhongHoc {
	public abstract boolean datChuan();
	protected String maPhong, dayNha;
	protected double dienTich;
	protected int soBongDen;
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}
	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}
	
	
	public boolean duSang() {
		int s= (int) (getDienTich()/10);
		if(s/getSoBongDen() == 1)		{
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String duSang = duSang()?"Phong du sang":"Phong khong du sang";
		String s=" ";
		s+=s.format("%10s|%10s|%10s|%10s|%10s",getMaPhong(),getDayNha(),getDienTich(),getSoBongDen(),duSang);
				
		return s;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(maPhong, other.maPhong);
	}
	
	
	
}
