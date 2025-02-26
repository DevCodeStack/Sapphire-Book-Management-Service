package com.devcodestack.apps.ls.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

//@Configuration
/*
 * For more control over database configuration
 * prefer creating  your own Datasource instead on relying on springboot's opinionated configuration
 * 
 */
public class DatasourceManager {
	
	@Value("${user_name}")
	private String username;
	
	@Value("${password}")
	private String password;
	
	@Value("${host}")
	private String host;
	
	private String url = "jdbc:postgresql://%s/capstone";
	
	@Bean
    public DataSource dataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        System.out.println("Connecting to database: " + String.format(url, host));
        dataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/capstone");
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName("org.postgresql.Driver");

        // HikariCP settings
        dataSource.setMaximumPoolSize(1);
        dataSource.setMinimumIdle(1);
        dataSource.setIdleTimeout(30000);
        dataSource.setMaxLifetime(1800000);
        dataSource.setConnectionTimeout(20000);
        dataSource.setPoolName("MyHikariPool");

        return dataSource;
    }
}
