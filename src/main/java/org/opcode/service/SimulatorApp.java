package org.opcode.service;


import org.opcode.instruction.Instruction;
import org.opcode.instruction.InstructionFactory;
import org.opcode.model.Register;
import org.opcode.model.RegisterState;

import java.util.List;

public class SimulatorApp implements OpcodeSimulator{
    private InstructionFactory instructionFactory;
    private static RegisterState registerState;

    private static final String SPACE_DELIMITTER = "\\s+";
    private static final int OP0_SIZE = 3;
    private static final int OP1_SIZE = 1;
    private static final int OP_MIN_SIZE = 2;
    private static final int OP_MAX_SIZE = 3;

    public SimulatorApp(List<Register> registers){
        instructionFactory = new InstructionFactory();
        registerState = RegisterState.getInstance(registers);
    }

    @Override
    public RegisterState execute(List<String> instructions) throws RuntimeException{
//        validateInstructions(instructions); assuming the instructions are valid as of now.
        for(String command : instructions)
            process(command);
        return registerState;
    }

    private void deb(String o){
        System.out.println("DEBUG : " + o.toString());
    }

    private void process(String command){
        deb("command " + command);
        String ops[] = command.split(SPACE_DELIMITTER);
        Instruction ins = instructionFactory.get(ops[0]);

        System.out.println("Ops : ");
        for(String s : ops) System.out.print(s + " ");
        System.out.println();

//        deb("Got Instruction : " + ins.toString());

        ins.process(ops, registerState);
    }

    private void validateInstructions(List<String> instructions) throws RuntimeException{
        for(String command : instructions){
            String[] ops = command.split(SPACE_DELIMITTER);
            if(ops.length < OP_MIN_SIZE || ops[0].length() != OP0_SIZE || ops[1].length() != OP1_SIZE)
                throw new RuntimeException("Invalid Operation : " + command);
            if(ops.length > OP_MAX_SIZE)
                throw new RuntimeException("Invalid Operation : " + command);
            if(ops.length > OP_MIN_SIZE && containsAlphabet(ops[2]))
                throw new RuntimeException("Invalid Operation : " + command);
        }
    }

    private boolean containsAlphabet(String p){
        boolean atleastOneAlphabet = p.matches(".*[a-zA-Z]+.*");
        return atleastOneAlphabet;
    }
}
