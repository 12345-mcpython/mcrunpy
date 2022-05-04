package com.laosun.mcrunpy;

import org.python.util.PythonInterpreter;

public class RunPython {
    public static PythonInterpreter interpreter;

    public static void init() {
        interpreter = new PythonInterpreter();
    }

    public static String runPython(String command) {
        PythonOutput pythonOutput = new PythonOutput();
        return "";
    }
}
