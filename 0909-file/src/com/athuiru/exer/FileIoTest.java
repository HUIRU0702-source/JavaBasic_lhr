package com.athuiru.exer;

import org.junit.Test;

import java.io.*;

public class FileIoTest {
    /**
     * 需求：
     * 复制一份hello.txt文件，命名为hello_copy.txt
     */
    @Test
    public void test1() {
        // 读取hello.txt文件内容，FileReader()
        String content = readFileChars();
        System.out.println(content);

        // 写入hello_copy.txt，FileWriter()
        writeFileChars(content);
    }

    private String readFileChars() {
        FileReader fr = null;
        StringBuilder sb = null;
        try {
            // 1. 创建File对象
            File file = new File("resource/hello.txt");

            // 2. 创建文件输入字符流
            fr = new FileReader(file);

            // 3. 读取数据
            sb = new StringBuilder();
            char[] chars = new char[5];
            int len;
            while ((len = fr.read(chars)) != -1) {
                for (int i = 0; i < len; i++) {
                    sb.append(chars[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭输入流
            try {
                if (fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return sb.toString();
    }

    public void writeFileChars(String writeData) {
        // 1. 创建File对象
        FileWriter fw = null;
        try {
            File file = new File("resource/hello_copy.txt");
            System.out.println(file.getAbsolutePath());

            // 2. 创建文件输出字符流，写入数据
            fw = new FileWriter(file);
            fw.write(writeData);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭输出流
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * 需求：复制一份web.png文件，命名为web_copy.png
     */
    @Test
    public void test2() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcFile = new File("resource\\web.png");
            File bakFile = new File("resource\\web_copy.png");

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(bakFile);

            byte[] bytes = new byte[1024];// 1kb(b-byte)
            int len;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
