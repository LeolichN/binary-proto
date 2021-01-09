package com.jd.blockchain.binaryproto;

import com.jd.blockchain.binaryproto.impl.DataContractContext;

/**
 * 数据实体注册表；
 * 
 * @author huanghaiquan
 *
 */
public class DataContractRegistry {

	private static DataContractRegistry instance = new DataContractRegistry();

	public static DataContractRegistry getInstance() {
		return instance;
	}

	private DataContractRegistry() {
	}

	public static DataContractEncoder register(Class<?> contractType) {
		DataContractEncoder encoder = DataContractContext.resolve(contractType);
		return encoder;
	}

	public static DataContractEncoder getEncoder(Class<?> contractType) {
		return DataContractContext.ENCODER_LOOKUP.lookup(contractType);
	}

	public static DataContractEncoder getEncoder(int contractCode, long version) {
		return DataContractContext.ENCODER_LOOKUP.lookup(contractCode, version);
	}

	public static <T> void registerBytesConverter(Class<T> javaType, BytesConverter<T> converter) {
		DataContractContext.registerBytesConverter(javaType, converter);
	}

}
