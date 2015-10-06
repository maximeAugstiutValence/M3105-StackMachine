package fr.iutvalence.info.m3105.stackmachine;

public class Program implements InterfaceProgram{

	private Instruction[] instructions;

	public Program( Instruction[] instructions){
		this.instructions = instructions;
	}

	public int getInstructionCount() {
		
		return instructions.length;
	}

	public Instruction getInstructionAt(int instructionNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
