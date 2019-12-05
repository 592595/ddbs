package com.pan.util;

/**
 * 用于切换数据源
 */
public class DataSourceUtil {
	public static String dataSource = "datasource_oracle_u_2_4_1_1";

	public static String getDataSource() {
		return dataSource;
	}

	public static void setDataSource(String dataSource) {
		DataSourceUtil.dataSource = dataSource;
	}
}
