package com.yss.ms.generator.mapper;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器
 *
 * @Author: ${author}
 * @Date: ${datetime}
 */
public interface GeneratorMapper {
	
	List<Map<String, Object>> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	Map<String, String> queryTable(String tableName);
	
	List<Map<String, String>> queryColumns(String tableName);
}
