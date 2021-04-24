package com.pool.ConfigurationProperties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("shiva")
public class MyProperties {
private String url;
private Integer port;

public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public Integer getPort() {
	return port;
}
public void setPort(Integer port) {
	this.port = port;
}
@Override
public String toString() {
	return "MyProperties [url=" + url + ", port=" + port + "]";
}


}
