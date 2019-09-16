package com.kgc.drug.util;

import java.util.UUID;

public class UUIDUtil {
	/*
	 * UUID
	 */
	
	public static String getId() {
		return  UUID.randomUUID().toString().replace("-", "").toUpperCase();
				
	}
	
	/**
	   * 随机生成码
	 * 
	 */
	
	
	public static String getCode() {
		return getId();
		
	}
	
	public static void main(String[] args) {
		System.out.println(UUIDUtil.getCode());
	}

}
