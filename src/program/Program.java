package program;

import java.util.ArrayList;

import computer.Memory;
import instructions.Instruction;

public class Program {
	private ArrayList<Instruction> instructionList;
	private ProgramCounter pc;

	public Program() {
		instructionList = new ArrayList<Instruction>();
		pc = new ProgramCounter();
	}

	public void execute(Memory mem) {
		while (pc.isPositive()) {
			System.out.println(pc.getIndex());
			instructionList.get(pc.getIndex()).execute(pc, mem);
		}
		
//		System.out.println(mem.getWord(1));
	}

	public void add(Instruction in) {
		instructionList.add(in);

	}

	public ArrayList<Instruction> getList() {
		return instructionList;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < instructionList.size(); i++)
			sb.append(i + " " + instructionList.get(i) + "\n");
		
		return sb.toString();
	}
}
