package me.wini.logstash.logback;

import lombok.Data;

@Data
public class Account {
	private long id;
	private String username;
	private String password;
	private String address;
	private String email;
}
