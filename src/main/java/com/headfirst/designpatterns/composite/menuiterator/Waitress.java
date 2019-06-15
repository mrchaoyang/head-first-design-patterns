package com.headfirst.designpatterns.composite.menuiterator;

import java.util.Iterator;
  
public class Waitress {
	com.headfirst.designpatterns.composite.menuiterator.MenuComponent allMenus;
 
	public Waitress(com.headfirst.designpatterns.composite.menuiterator.MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
  
	public void printVegetarianMenu() {
		Iterator iterator = allMenus.createIterator();

		System.out.println("\nVEGETARIAN MENU\n----");
		while (iterator.hasNext()) {
			com.headfirst.designpatterns.composite.menuiterator.MenuComponent menuComponent =
					(com.headfirst.designpatterns.composite.menuiterator.MenuComponent)iterator.next();
			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {}
		}
	}
}
