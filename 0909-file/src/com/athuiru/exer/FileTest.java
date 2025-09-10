package com.athuiru.exer;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileTest {
    /**
     * 创建一个与hello.txt文件在相同文件目录下的另一个名为abc.txt文件
     */
    @Test
    public void test1() {
        // 获取hello.txt文件所在目录，获取绝对路径再获取parent
        File file1 = new File("resource//hello.txt");
        String parent = file1.getAbsoluteFile().getParent();

        // 基于获取的parent路径，创建File()
        File file2 = new File(parent, "abc.txt");

        // 在指定目录下createNewFile()
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 练习：
     * 判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
     * 提示：File类提供了文件过滤器方法（拓展）
     * public string[] list(FilenameFilter filter)
     */
    @Test
    public void test2() {
        // 基于指定目录路径创建File类
        File file = new File("C:\\Users\\17864\\Pictures\\证件");

        //方式1：
        // 获取指定目录下全部子文件或子文件目录list()
        for (String s : file.list()) {
            // 使用String类的endsWith()方法判断是否带有".jpg"后缀
            if (s.endsWith(".jpg")) {
                // 如果是，打印
                System.out.println(s);
            }
        }

        System.out.println("==================================");
        // 方式2：
        String[] strings = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg");
            }
        });

        for (String str : strings) {
            System.out.println(str);
        }
    }

    /**
     * 练习：
     * 遍历指定文件目录下的所有文件的名称，包括子文件目录中的文件，
     * public void printFileName(File file）//file可能是文件，也可能是文件目录
     * 拓展1：删除指定文件目录及其下的所有文件
     * public void deleteDirectory(File file) //file可能是文件，也可能是文件目录
     * 拓展2：计算指定文件目录占用空间的大小
     * public long getDirectorysize(File file) //file可能是文件，也可能是文件目录
     */
    @Test
    public void test3() {
        printFileName(new File("D:\\Java_all\\web"));

        deleteDirectory(new File("D:\\test"));

        System.out.println(getDirectorysize(new File("D:\\杂七杂八\\test")));
    }

    public void printFileName(File file) {
        if (file.isFile()) {
            System.out.println(file.getName());
            return;
        }

        for (File listFile : file.listFiles()) {
            printFileName(listFile);
        }
    }

    public void deleteDirectory(File file) {
        if (file.isDirectory() && file.list().length > 0) {
            for (File childFile : file.listFiles()) {
                deleteDirectory(childFile);
            }
        }

        file.delete();
    }

    public long getDirectorysize(File file) {
        if (file.isFile()) {
            return file.length();
        }

        long size = 0;
        for (File childFile : file.listFiles()) {
            size += getDirectorysize(childFile);
        }

        return size;
    }
}
