package com.github.linsolas.katalisthenics;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Operation {

    protected final Date date = new Date();

    abstract Amount evaluateBalance(Amount oldBalance);

    public void printOperation(PrintStream stream, Amount balance) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy @ HH:mm:ss");
        String date = formatter.format(this.date);
        stream.print("[" + date + "] ");
    }

}
