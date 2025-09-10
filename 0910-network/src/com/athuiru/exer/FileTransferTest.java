package com.athuiru.exer;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class FileTransferTest {
    @Test
    public void client() {
        Socket socket = null;
        FileInputStream fileInputStream = null;
        OutputStream outputStream = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            // 1. 创建Socket
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            int port = 9090;
            socket = new Socket(inetAddress, port);

            // 2. 创建File和FileInputStream对象
            File file = new File("web学习路线.png");
            fileInputStream = new FileInputStream(file);

            // 3. 文件数据读取，并写入到Socket对象的输出流中
            outputStream = socket.getOutputStream();
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
            }
            System.out.println("文件读取完毕！");

            // 4. 告知数据发送完毕
            socket.shutdownOutput();

            // 5. 接收数据
            inputStream = socket.getInputStream();
            byte[] bytes1 = new byte[1024];
            int len1;
            byteArrayOutputStream = new ByteArrayOutputStream();
            while ((len1 = inputStream.read(bytes1)) != -1) {
                byteArrayOutputStream.write(bytes1, 0, len1);
            }
            System.out.println(byteArrayOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 6. 关闭Socket和流
            try {
                if (byteArrayOutputStream != null)
                    byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileInputStream != null)
                    fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void server() {
        ServerSocket serverSocket = null;
        FileOutputStream fileOutputStream = null;
        Socket socket = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            // 1. 创建ServerSocket
            int port = 9090;
            serverSocket = new ServerSocket(port);

            // 2. 创建File和FileOutputStream对象
            File file = new File("wen学习路线_copy.png");
            fileOutputStream = new FileOutputStream(file);

            // 3. 数据读取，并写入文件
            socket = serverSocket.accept();
            inputStream = socket.getInputStream();

            byte[] bytes = new byte[1024];
            int len;
            while ((len = inputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
            System.out.println("文件写入完毕！");

            // 4. 输出数据
            outputStream = socket.getOutputStream();
            outputStream.write("我已接收到数据！".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 5. 关闭Socket和流
            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileOutputStream != null)
                    fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (serverSocket != null)
                    serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
