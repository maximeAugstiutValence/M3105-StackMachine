package fr.iutvalence.info.m3105.stackmachine;

public class Memory implements InterfaceMemory {

	private int startAdress;
	private int adress2;

	public Memory(int adress1, int adress2) {
		this.startAdress=adress1;
		this.adress2=adress2;
	}

	public int getStartAddress() {
		return this.startAdress;
	}

	public void write(int currentAddress, Object opcode) {
		// TODO Auto-generated method stub
		
	}

	public void write(int currentAddress, int opCode) {
		// TODO Auto-generated method stub
		
	}

}
