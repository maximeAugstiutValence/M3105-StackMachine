package fr.iutvalence.info.m3105.stackmachine;

public interface InterfaceMemory {

	int getStartAddress();

	void write(int currentAddress, int opCode);

}
