package com.nt.config;

import java.util.Properties;

import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
public class PersisstenceConfig {
	@Bean(name="oracleADS")
	public  AtomikosDataSourceBean createADSForOracle() {
		AtomikosDataSourceBean adsOracle=new AtomikosDataSourceBean();
		adsOracle.setUniqueResourceName("oraXADS");
		adsOracle.setXaDataSourceClassName("oracle.jdbc.xa.client.OracleXADataSource");
		Properties props=new Properties();
		props.setProperty("databaseName","orcl");
		props.setProperty("user","scott");
		props.setProperty("password","tiger");
		props.setProperty("URL","jdbc:oracle:thin:@localhost:1521:orcl");
		adsOracle.setXaProperties(props);
		return adsOracle;
	}
	
	@Bean(name="mysqlADS")
	public  AtomikosDataSourceBean createADSForMySQL() {
		AtomikosDataSourceBean adsMysql=new AtomikosDataSourceBean();
		adsMysql.setUniqueResourceName("mysqlXADS");
		adsMysql.setXaDataSourceClassName("com.mysql.cj.jdbc.MysqlXADataSource");
		Properties props=new Properties();
		props.setProperty("databaseName","srikanth");
		props.setProperty("user","root");
		props.setProperty("password","root");
		props.setProperty("URL","jdbc:mysql:///srikanth");
		adsMysql.setXaProperties(props);
		return adsMysql;
	}
	
	@Bean(name="oracleTemplate")
	public  JdbcTemplate  createJTForOracle() {
		return new JdbcTemplate(createADSForOracle());
	}
	
	@Bean(name="mysqlTemplate")
	public  JdbcTemplate  createJTForMysql() {
		return new JdbcTemplate(createADSForMySQL());
	}

}
