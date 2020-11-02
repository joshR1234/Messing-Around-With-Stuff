package com.example;

public class Cat extends Animal implements Pet{
    
	private String name;
	
    public void setName(String name) {
		this.name = name;
	}
    
	public Cat() {
        this("Fluffy");
    }
	
	public Cat(String name) {
    	super(4);
    	this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Fish eat pond scum.");
    }
    
    
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void play() {
		System.out.println(name + " likes to play with string.");
		
	}
	
	@Override
	public void walk() {
        System.out.println("Cats prance");
    }


}