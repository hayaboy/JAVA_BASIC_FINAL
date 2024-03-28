package com.spring.ex01;

public class PersonServiceImpl implements PersonService {

	private String fruit;
	
	private int amount;

	
	public PersonServiceImpl() {
	
	}
	
	
	
	public PersonServiceImpl(String fruit) {
		super();
		this.fruit = fruit;
	}



//	public void setFruit(String fruit) {
//		this.fruit = fruit;
//	}	
	
	
	public PersonServiceImpl(String fruit, int amount) {
		super();
		this.fruit = fruit;
		this.amount = amount;
	}



	@Override
	public void sayHello() {
		System.out.println(this.fruit);
		System.out.println(this.amount);

	}

}
