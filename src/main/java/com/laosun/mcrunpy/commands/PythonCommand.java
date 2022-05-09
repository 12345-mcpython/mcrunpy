package com.laosun.mcrunpy.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.server.command.CommandTreeBase;

import java.io.File;
import java.util.Objects;

import static com.laosun.mcrunpy.MCRunPythonMod.interpreter;
import static com.laosun.mcrunpy.MCRunPythonMod.logger;

public class PythonCommand extends CommandBase {
    @Override
    public String getName() {
        return "python";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "/python reload";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if (args.length == 0) {
            throw new WrongUsageException("/python reload");
        }
        if (args.length > 1) {
            throw new WrongUsageException("/python reload");
        }
        logger.info(args.length);
        if (args[0].equals("reload")) {
            File scripts = new File("python");
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
                        CommandTreeBase.notifyCommandListener(sender, this, "Reload Fail! Script: " + str);
                    }
                }
            }
            double end_script = System.currentTimeMillis();
            logger.info("Loading scripts Successful. (Cost {} s)", (end_script - start_script) / 1000);
            CommandTreeBase.notifyCommandListener(sender, this, "Reload Successful.");
        } else {
            throw new WrongUsageException("/python reload");
        }


    }
}
