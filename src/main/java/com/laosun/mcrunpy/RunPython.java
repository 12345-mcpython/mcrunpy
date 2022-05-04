package com.laosun.mcrunpy;

import org.python.util.PythonInterpreter;

public class RunPython {
    public static PythonInterpreter interpreter;

    public static void init() {
        interpreter = new PythonInterpreter();
    }
}
