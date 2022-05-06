package com.laosun.mcrunpy;


import com.laosun.mcrunpy.utils.PythonOutput;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import org.python.core.PySystemState;
import org.python.util.PythonInterpreter;

import java.io.File;
import java.util.Objects;


/**
 * TODO:1.Add texture and language for the items and blocks created by script.
 * TODO:2.Add entity, liquid and enchantments support.
 */

@Mod(modid = RunPythonMod.MODID, name = RunPythonMod.NAME, version = RunPythonMod.VERSION)
public class RunPythonMod {
    public static final String MODID = "mcrunpy";
    public static final String NAME = "Run Python Mod";
    public static final String VERSION = "1.12.2-alpha-1.0.0-1";
    public static final PythonInterpreter interpreter = new PythonInterpreter();

    public static Logger logger;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Loading Run Python Mod and scripts.");
        double start_python = System.currentTimeMillis();
        interpreter.setOut(new PythonOutput());
        File scripts = new File("python");
        if (!scripts.exists()) {
            if (scripts.mkdir()) {
                logger.info("Create python directory successful");
            } else {
                logger.error("Create python directory fail");
            }
        }
        PySystemState sys = interpreter.getSystemState();
        sys.path.add(scripts.getAbsolutePath());
        double end_python = System.currentTimeMillis();
        logger.info("Loading Python Successful. (Cost {} s)", (end_python - start_python) / 1000);
        double start_script = System.currentTimeMillis();
        if (scripts.list() != null) {
            for (String str : Objects.requireNonNull(scripts.list())) {
                if (new File("python/" + str).isDirectory()) {
                    continue;
                }
                try {
                    interpreter.execfile("python/" + str);
                } catch (Exception e) {
                    logger.error("An error occurred while loading the script " + str);
                    e.printStackTrace();
                    logger.error("", e);
                }
            }
        }
        double end_script = System.currentTimeMillis();
        logger.info("Loading scripts Successful. (Cost {} s)", (end_script - start_script) / 1000);
    }

}
