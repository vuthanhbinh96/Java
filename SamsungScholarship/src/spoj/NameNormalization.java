package spoj;

public class NameNormalization {

	public static void main(String[] args) {
		String str = new String();
		str = "  helLo    wOrld      ";
		str = str.trim();
		str = str.replaceAll("\\s+", " ");

		String[] temp = str.split(" ");
		str = "";
		for (int i = 0; i < temp.length; i++) {
			str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1).toLowerCase();
			// str += temp[i].substring(0, 1).toUpperCase() +
			// temp[i].substring(1).toLowerCase();
			if (i < temp.length - 1)
				str += " ";
		}

		System.out.println(str);
	}

}
