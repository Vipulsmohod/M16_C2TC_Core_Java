package com.tns.client;


import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Client {

	public static void main(String[] args) 
	{
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(123,"Anurag",550,true);
		NormalAcc n=new GSNormalAcc(124,"Vipul",500,10);
		System.out.println("Prime account ");
		p.bookProduct(p.getCharge());
		System.out.println("Normal account");
		n.bookProduct(n.getCharges());
		
		
		System.out.println(p);
		System.out.println(n);
		}

	}
