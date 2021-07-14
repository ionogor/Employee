package com.step.Tests;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Singelton {

    private static Singelton INSTANCE=null;

    private Singelton()  {
        System.out.println("Creat");
    }

    public static Singelton getINSTANCE ()
    {

        if(INSTANCE==null)
        {

                 INSTANCE=new Singelton();
        }
        return INSTANCE;
    }

    public  void showMessage()
    {
        System.out.println("Hello Singelton");
    }


}
