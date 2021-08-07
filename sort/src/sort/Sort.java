package sort;

public class Sort {

	public static void main(String[] args) {
		String str[] = { "Bulb", "Apple", "Cat", "Mango", "App" };
		for (int i = 1; i < str.length; i++) {
			String key = str[i];
			int j = i - 1;
			while (j >= 0 && key.compareTo(str[j]) < 0) {
				str[j+1] = str[j];
				j = j - 1;
			}
			str[j + 1] = key;
		}
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
}
