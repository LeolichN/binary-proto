package com.jd.blockchain.binaryproto;

import com.jd.blockchain.utils.io.NumberMask;

/**
 * 数值编码格式；
 * 
 * @author huanghaiquan
 *
 */
public enum NumberEncoding {

	/**
	 * 不做编码；
	 */
	NONE(null),

	/**
	 * 按照 {@link NumberMask#TINY} 进行编码，并校验数值的范围；
	 */
	TINY(NumberMask.TINY),

	/**
	 * 按照 {@link NumberMask#SHORT} 进行编码，并校验数值的范围；
	 */
	SHORT(NumberMask.SHORT),

	/**
	 * 按照 {@link NumberMask#NORMAL} 进行编码，并校验数值的范围；
	 */
	NORMAL(NumberMask.NORMAL),

	/**
	 * 按照 {@link NumberMask#LONG} 进行编码，并校验数值的范围；
	 */
	LONG(NumberMask.LONG);

	public final NumberMask MASK;

	private NumberEncoding(NumberMask mask) {
		this.MASK = mask;
	}

}
