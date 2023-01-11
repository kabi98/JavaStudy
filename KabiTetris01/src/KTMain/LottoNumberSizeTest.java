package KTMain;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

class LottoNumberSizeTest {

	@Test
	void testGenerate() {
		// given
		final LottoNumberGenerator lotNumGet = new LottoNumberGenerator();
		final int price = 1000;
		
		// when
		final List<Integer> listNum = lotNumGet.generate(price);
		
		// then
//		Assert.assertEquals(listNum.size(), 6);
//		fail("Not yet implemented");
	}

}
