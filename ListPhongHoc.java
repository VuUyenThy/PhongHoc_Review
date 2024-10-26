package vuUyenThy;

import java.util.ArrayList;
import java.util.List;

public class ListPhongHoc {
	private List<PhongHoc> ls;
	public ListPhongHoc() {
		ls = new ArrayList<PhongHoc>();
		
	}
	public boolean themPhong(PhongHoc p) {
		if(ls.contains(p))
			return false;
		ls.add(p);
		return true;
	}
	public PhongHoc timPhong(String maPhong) {
		for(PhongHoc p: ls) {
			if(p.getMaPhong().equalsIgnoreCase(maPhong))
				return p;
		}
		return null;
	}
	public List<PhongHoc> danhSachDC(){
		List<PhongHoc> dsDC = new ArrayList<PhongHoc>();
		for(PhongHoc p : ls) {
			if(p.datChuan())
				dsDC.add(p);
		}
		return dsDC;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(PhongHoc p : ls) {
			sb.append(p.toString()).append("\n");
		}
		return super.toString();
	}
	
	
}
