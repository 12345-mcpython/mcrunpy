package com.laosun.mcrunpy.utils;

import com.laosun.mcrunpy.MCRunPythonMod;

import java.io.OutputStream;

// Jython output to log4j
public class PythonOutput extends OutputStream {
    private String string = "";

    @Override
    public void write(int b) {
        if (b == 10) {
            MCRunPythonMod.logger.info(string);
            string = "";
            return;
        }
        string += (char) b;
    }
}
