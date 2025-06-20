package java_project2025;

public class RegularExpression {

//	validateEmail(email: String): boolean
//	Kiểm tra email có đúng định dạng cơ bản hay không.

//	validatePassword(password: String): boolean
//	Kiểm tra mật khẩu có ít nhất: 8 ký tự trở lên ít nhất 1 chữ thường, 1 chữ hoa, 1 chữ số và 1 ký tự đặc biệt

//	validateDateVN(date: String): boolean
//	Kiểm tra ngày có định dạng dd/MM/yyyy, ví dụ: 19/06/2025

//	validateMST(mst: String): boolean
//	Kiểm tra mã số thuế Việt Nam (10 hoặc 13 chữ số, có thể có dấu - ngăn cách phần chi nhánh)

	public static boolean validateEmail(String email) {
		String pattern = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
		return email != null && email.matches(pattern);
	}

	public static boolean validatePassword(String password) {
		String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
		return password != null && password.matches(pattern);
	}

	public static boolean validateDateVN(String date) {
		String pattern = "^([0-2][0-9]|(3)[0-1])/(0[1-9]|1[0-2])/\\d{4}$";
		return date != null && date.matches(pattern);
	}

	public static boolean validateMST(String mst) {
		String pattern = "^\\d{10}(-\\d{3})?$";
		return mst != null && mst.matches(pattern);
	}

	// Example usage
	public static void main(String[] args) {
		System.out.println(validateEmail("user@example.com")); // true
		System.out.println(validatePassword("Aa@123456")); // true
		System.out.println(validateDateVN("19/06/2025")); // true
		System.out.println(validateMST("0312345678")); // true
		System.out.println(validateMST("0312345678-001")); // true
	}

}
