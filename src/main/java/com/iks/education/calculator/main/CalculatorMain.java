package com.iks.education.calculator.main;

import javax.swing.SwingUtilities;

import com.iks.education.calculator.gui.CalculatorGUI;

public class CalculatorMain {

	public static void main(String[] args) {
		CalculatorGUI gui = new CalculatorGUI();
		System.out.println("CalculatorApplication started in thread " + Thread.currentThread().getName());

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				gui.setupGUI();
			}
		});

		System.out.println("Waiting for all GUI thread to terminate: " + Thread.currentThread().getName());

	}

}
