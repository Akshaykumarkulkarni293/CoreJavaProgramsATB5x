package src.basics_004_17thDec2023;

public class Lab033 {

    public static void main(String[] args) {

        //interview
        //switch condition will work with byte,char,int,short,string

        int a = 30;
        switch (a) {
        }
        //it will work

        char c = 'A';
        switch (c) {}
        //it will work

        float f= 30.0F;
        switch ((int) f) {}
        // it will work, but need to explicit casting float to int

//        double d = 30.0;
//        switch(d){ }
//        //  it will not work, switch does not support double
//
//        boolean b = true;
//        switch(b){ }
//        //  it will not work, switch does not support boolean

        long a11=30;
        switch((int)a11){}
        // it will work, but need to explicit casting from long to int


    }
}