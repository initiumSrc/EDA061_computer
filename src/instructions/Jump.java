package instructions;

import computer.Memory;
import computer.ProgramCounter;

public class Jump implements Instruction {
	protected int nbr;

	public Jump(int nbr) {
		this.nbr = nbr;
	}

	@Override
	public void execute(ProgramCounter c, Memory m) {
		c.setIndex(nbr);
	}

	@Override
	public String toString() {
		return "JMP " + nbr;
	}
}
