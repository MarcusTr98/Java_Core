package baiTap_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachSinhVien {
	private final List<SinhVien> danhSach;

	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<>();
	}

// 1
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}

// 2
	public void inDanhSachSinhVien() {
		danhSach.forEach(System.out::println);
	}

// 3
	public boolean kiemTraDSSV() {
		return this.danhSach.isEmpty();
	}

// 4
	public int laySoLuongSV() {
		return this.danhSach.size();
	}

// 5
	public void xoaHetSinhVien() {
		danhSach.clear();
	}

// 6
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhSach.contains(sv);
	}

// 7
	public boolean xoaSV(SinhVien sv) {
		return this.danhSach.remove(sv);
	}

// 8
	public void timSV(String ten) {
		for (SinhVien sv : danhSach) {
			if (sv.getHoTen().indexOf(ten) >= 0) {
				System.out.println(sv);
			}
		}

//		danhSach.stream().filter(sv -> sv.getHoTen() != null && sv.getHoTen().contains(ten))
//				.forEach(System.out::println);
	}

// 9
	public void sapXepDSGiamDan() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if (o1.getDiemTB() > o2.getDiemTB()) {
					return -1;
				} else if (o1.getDiemTB() < o2.getDiemTB()) {
					return 1;
				} else {
					return 0;
				}
			}

		});
//		danhSach.sort(Comparator.comparing(SinhVien::getDiemTB).reversed());

	}

	public void sapXepDSTangDan() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if (o1.getDiemTB() < o2.getDiemTB()) {
					return -1;
				} else if (o1.getDiemTB() > o2.getDiemTB()) {
					return 1;
				} else {
					return 0;
				}
			}

		});
//		danhSach.sort(Comparator.comparing(SinhVien::getDiemTB));
	}
}
