package fr.iutvalence.info.m3105.stackmachine;

public class Instruction {
	private static int operator;
	private static int[] adress;

	public Instruction(int operator, int[] adress) {
		this.operator = operator;
		this.adress = adress;
	}

	public int getOpCode() {
		// TODO Auto-generated method stub
		return this.operator;
	}

	public int[] getParams() {
		// TODO Auto-generated method stub
		return this.adress;
	}

	

}
