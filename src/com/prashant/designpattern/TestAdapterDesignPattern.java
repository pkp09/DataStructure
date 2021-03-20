package com.prashant;


public class TestAdapterDesignPattern {

	public static void main(String[] args) {
		SocketObjectAdapter soa = new SocketObjectAdapter();
		soa.get120Volt();
		soa.get12Volt();
		soa.get3Volt();
		System.out.println("********************************");
		SocketClassAdapter sca = new SocketClassAdapter();
		sca.get120Volt();
		sca.get12Volt();
		sca.get3Volt();
	}
}

class SocketObjectAdapter implements SocketAdapter{
	Socket socket = new Socket();
	
	@Override
	public Volt get12Volt() {
		Volt volt = socket.getVolt();
		return convert(volt, 12);
	}

	@Override
	public Volt get120Volt() {
		Volt volt = socket.getVolt();
		return convert(volt, 120);
	}

	@Override
	public Volt get3Volt() {
		Volt volt = socket.getVolt();
		return convert(volt, 3);
	}
	
	private Volt convert(Volt volt, int unit) {
		return new Volt(volt.getVolts() / unit);
	}
}

class SocketClassAdapter extends Socket implements SocketAdapter{

	@Override
	public Volt get12Volt() {
		return convert(getVolt(), 12);
	}

	@Override
	public Volt get120Volt() {
		return convert(getVolt(), 120);
	}

	@Override
	public Volt get3Volt() {
		return convert(getVolt(), 3);
	}
	
	private Volt convert(Volt volt, int unit) {
		return new Volt(volt.getVolts() / unit);
	}
}

interface SocketAdapter {
	public Volt get12Volt();
	public Volt get120Volt();
	public Volt get3Volt();
}

class Socket {
	public Volt getVolt() {
		System.out.println("Socket : getVolt() : ");
		return new Volt(120);
	}
}

class Volt {
	private int volts;
	
	public Volt(int volts) {
		System.out.println("Volts Input is : " + volts);
		this.volts = volts;
	}

	public int getVolts() {
		return volts;
	}

	public void setVolts(int volts) {
		this.volts = volts;
	}
}