package org.marker.feixin;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;

public class Test {

	public static void main(String[] args) throws HttpException, IOException {

		MicroFeition sms = new MicroFeition("13518135097", "714624741");
		int status = sms.send("13518135097", "飞信API测试，我在写程序调用，发送给飞信好友消息，收到回复个消息哈！");
		
		System.out.println(status);
	}
}
