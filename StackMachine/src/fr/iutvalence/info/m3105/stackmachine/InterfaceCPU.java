package fr.iutvalence.info.m3105.stackmachine;

public interface InterfaceCPU  {

	public void run();
	
	public void wireToProgramMemory(Memory programMemory);
	
	public void wireToExpStack(Stack expStack);
	
	public void wireToCallStack(Stack callStack);
	
	public void wireToIoSubsystem(consoleIO ioSystem);
	
	public void clearStacks();
	
	public void setPC(int address);
}
