import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class PairProEnTest {

	@Test
	public void いちからone() {
		IntoToEng en = new IntoToEng();
		String expected = "one";
		String actual = en.translateEng(1);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void じゅうからten() {
		IntoToEng en = new IntoToEng();
		String expected = "ten";
		String actual = en.translateEng(10);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void にじゅうからtwenty() {
		IntoToEng en = new IntoToEng();
		String expected = "twenty";
		String actual = en.translateEng(20);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void じゅうさんからtwenty_three() {
		IntoToEng en = new IntoToEng();
		String expected = "twenty three";
		String actual = en.translateEng(23);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void さんじゅうからtwenty_three() {
		IntoToEng en = new IntoToEng();
		String expected = "thirty";
		String actual = en.translateEng(30);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ごじゅうはちからfifty_eight() {
		IntoToEng en = new IntoToEng();
		String expected = "fifty eight";
		String actual = en.translateEng(58);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void きゅうじゅうきゅうからninety_nine() {
		IntoToEng en = new IntoToEng();
		String expected = "ninety nine";
		String actual = en.translateEng(99);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ひゃくからone_hunderd() {
		IntoToEng en = new IntoToEng();
		String expected = "one hundred";
		String actual = en.translateEng(100);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void きゅうひゃくからさん() {
		IntoToEng en = new IntoToEng();
		String expected = "nine hundred thirteen";
		String actual = en.translateEng(913);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void せんにじゅうきゅう() {
		IntoToEng en = new IntoToEng();
		String expected = "one thousand twenty nine";
		String actual = en.translateEng(1029);
		assertThat(actual,is(expected));
	}
	@Test
	public void 九千九百九十九() {
		IntoToEng en = new IntoToEng();
		String expected = "nine thousand nine hundred ninety nine";
		String actual = en.translateEng(9999);
		assertThat(actual,is(expected));
	}
	@Test
	public void 一万() {
		IntoToEng en = new IntoToEng();
		String expected = "ten thousand";
		String actual = en.translateEng(10000);
		assertThat(actual,is(expected));
	}
	@Test
	public void 二十万() {
		IntoToEng en = new IntoToEng();
		String expected = "two hundred thousand";
		String actual = en.translateEng(200000);
		assertThat(actual,is(expected));
	}
	@Test
	public void 二百万() {
		IntoToEng en = new IntoToEng();
		String expected = "twenty hundred thousand";
		String actual = en.translateEng(2000000);
		assertThat(actual,is(expected));
	}
}