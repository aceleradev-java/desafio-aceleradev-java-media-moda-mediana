package br.com.codenation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import br.com.codenation.StatisticUtil;

public class StatisticUtilTest {

	@Test
	public void testAverage() {
		assertEquals(3, StatisticUtil.average(new int[] {1,2,3,4,5}));
		assertEquals(5, StatisticUtil.average(new int[] {2,9,4,5}));
	}

	@Test
	public void testMode() {
		assertEquals(3, StatisticUtil.mode(new int[] {1,2,3,3}));
		assertEquals(2, StatisticUtil.mode(new int[] {2,2,1,2,3,3}));
		assertEquals(4, StatisticUtil.mode(new int[] {1,2,2,3,3,4,4,4,5,5,6,7,8}));
	}


	@Test
	public void testModeWithNegativeMode() {
		assertEquals(-1, StatisticUtil.mode(new int[] {-1,-2,-3,-1}));
	}

	@Test
	public void testMedian() {
		assertEquals(3, StatisticUtil.median(new int[] {1,2,3,4,5}));
		assertEquals(4, StatisticUtil.median(new int[] {1,2,3,4,5,6,7}));
		assertEquals(8, StatisticUtil.median(new int[] {7,8,9}));
	}
	
	@Test
	public void testMedianWithEvenArrayUnOrdered() {
		assertEquals(3, StatisticUtil.median(new int[] {6,5,1,3,2,4}));
	}
	
}
