package com.test.ibatis;

import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class SqlMapConfig {
	private static final SqlMapClient sqlMap;
	
	static{
		try{
			String resource = "com/test/ibatis/SqlMapConfig.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException("���̹�Ƽ�� �ʱ�ȭ �ϴ� ������"+e);
		}
	}
	
	public static SqlMapClient getSqlMapInstance(){
		return sqlMap;
	}
}