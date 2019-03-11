package com.boot.utils;

import io.swagger.annotations.Api;

import java.util.UUID;

@Api(description = "生成UUID工具类")
public class UUIDUtils {

	/**
	 * 工具类 生成UUID
	 */
	
	//生成UUID
	public static String getUUID()
	{
		return UUID.randomUUID().toString().replace("-", "");
	}
}
