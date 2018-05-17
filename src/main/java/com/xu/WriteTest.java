package com.xu;

import java.io.*;

public class WriteTest {
    public static void main(String[] args) throws IOException {
        File file=new File("bos.txt");
        if(!file.exists()){
            file.createNewFile();
        }
//        String aa="sadasdasdasdasdas";
        BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream("bos.txt",true));
        bos.write("java".getBytes());
//        bos.write(aa.getBytes());
        bos.write("\n".getBytes());
        bos.write("ssss".getBytes());
        bos.close();
    }


}
