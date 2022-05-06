package com.laosun.mcrunpy.utils;

import com.laosun.mcrunpy.RunPythonMod;

import java.io.IOException;
import java.io.OutputStream;

// Jython output to log4j
public class PythonOutput extends OutputStream {
    private String string = "";

    @Override
    public void write(int b) throws IOException {
        if (b == 10) {
            RunPythonMod.logger.info(string);
            string = "";
            return;
        }
        string += (char) b;
    }
}
