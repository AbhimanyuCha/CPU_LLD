package org.opcode.instruction.instructionTypes;

import org.opcode.instruction.Instruction;
import org.opcode.model.Register;
import org.opcode.model.RegisterState;

public class Set implements Instruction{
    @Override
    public void process(String[] args, final RegisterState registerState) {
        Register des = registerState.getRegister(args[1].charAt(0));
        int val = Integer.parseInt(args[2]);
        des.setValue(val);
    }
}
