package com.github.linsolas.katalisthenics;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Operation {

    protected final Date date = new Date();
    protected String type;

    abstract Amount evaluateBalance(Amount oldBalance);

    public void printOperation() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        String d = sdf.format(date);
        System.out.print(d + " - ");
    }

}
