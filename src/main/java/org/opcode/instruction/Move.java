package org.opcode.instruction;

import org.opcode.model.Register;
import org.opcode.model.RegisterState;

public class Move implements Instruction{

    @Override
    public void process(String[] args, RegisterState registerState){
        Register des = registerState.getRegister(args[1].charAt(0));
        Register src = registerState.getRegister(args[2].charAt(0));
        des.setValue(src.getValue());
    }
}
