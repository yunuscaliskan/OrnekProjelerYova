package tr.edu.medipol.yova.ornek1;

import org.apache.commons.lang3.StringUtils;

public class BosluklariTemizle {

	public static void main(String[] args) {
		String sonuc = StringUtils.deleteWhitespace(" aaa  bbb ccc ddd");
		System.out.println(sonuc);

	}

}
