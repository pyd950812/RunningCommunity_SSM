package com.pengyd.common.util.ip;

public class TestIPSeeker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IPSeeker seeker = IPSeeker.getInstance();
		String ip = "172.26.35.1";
		String country = seeker.getCountry(ip);
		String area = seeker.getArea(ip);
		System.out.println( country+"*******" + area);
	}
}
