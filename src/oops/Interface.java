package oops;
interface Tvremote
{
	public void channelup();
	public void channeldown();
	public void volumeup();
	public void volumedown();
}
interface Smarttvremote extends Tvremote
{
	public void bluetooth();
	public void voicesearch();
	
}
class TV implements Smarttvremote
{

	@Override
	public void channelup() {
		// TODO Auto-generated method stub
		System.out.println("channelup");
	}

	@Override
	public void channeldown() {
		// TODO Auto-generated method stub
		System.out.println("channeldown");
	}

	@Override
	public void volumeup() {
		// TODO Auto-generated method stub
		System.out.println("volumeup");
	}

	@Override
	public void volumedown() {
		// TODO Auto-generated method stub
		System.out.println("volumedown");
	}

	@Override
	public void bluetooth() {
		// TODO Auto-generated method stub
		System.out.println("bluetooth");
	}

	@Override
	public void voicesearch() {
		// TODO Auto-generated method stub
		System.out.println("voicesearch");
	}
	
}
public class Interface {

	public static void main(String[] args) {
		TV ob=new TV();
		ob.channelup();
		ob.channeldown();
		ob.volumeup();
		ob.volumedown();
		ob.bluetooth();
		ob.voicesearch();
	

	}

}
