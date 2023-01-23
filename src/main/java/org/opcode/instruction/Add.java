package org.opcode.instruction;

import org.opcode.model.Register;
import org.opcode.model.RegisterState;

public class Add implements Instruction{
    @Override
    public void process(String[] args, final RegisterState registerState) {
        final Register des = registerState.getRegister(args[1].charAt(0));
        int value = Integer.parseInt(args[2]);
        des.setValue(des.getValue() + value);
    }
}
