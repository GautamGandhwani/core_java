package co.in.interfac;

public class Businesman implements Richman, SocialWorker {

	@Override
	public void helpToOther() {
		System.out.println("Help to other");
	}

	@Override
	public void earnMoney() {
		System.out.println("Earning Money");
	}

	@Override
	public void donation() {
		System.out.println("Donation");
	}

	@Override
	public void party() {
		System.out.println("Party");
	}

	public static void main(String[] args) {
		Businesman b = new Businesman();
		b.donation();
		b.earnMoney();
		b.party();
		b.helpToOther();
	}

}
