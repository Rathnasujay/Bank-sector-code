package org.bnk;

public class Tmb extends Sbi{


@Override
	public void Deposits() {
		System.out.println("Rocky");
		super.Deposits();
		
	}
@Override
	public void Fixed() {
		System.out.println("25%");
		super.Fixed();
		super.Savings();
	}
public static void main(String[] args) {
	Tmb t = new Tmb();
	t.Savings();
	t.Deposits();
	t.Fixed();
}
}
