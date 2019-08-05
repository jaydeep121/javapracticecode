package com.innovaccer.Interface2;

public interface Vehichal {
	default void start() {
		System.out.println("Vehichal : start");
	}
	default void stop(){
		System.out.println("Vehichal : stop");
	}

}
