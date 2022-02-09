package com.alan.service;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TextSearchFile2 {
    static int countFiles = 0;// 声明统计文件个数的变量
    static int countFolders = 0;// 声明统计文件夹的变量
    static int count = 0;

    static StringBuffer sb = new StringBuffer();

    public static File[] searchFile(File folder, final String keyWord) {// 递归查找包含关键字的文件

        File[] subFolders = folder.listFiles(new FileFilter() {// 运用内部匿名类获得文件
            @Override
            public boolean accept(File pathname) {// 实现FileFilter类的accept方法
                if (pathname.isFile())// 如果是文件
                    countFiles++;
                else
                    // 如果是目录
                    countFolders++;
                if (pathname.isFile())
                    readFileByLines(pathname, keyWord);
                return true;

            }
        });

        List<File> result = new ArrayList<File>();// 声明一个集合
        for (int i = 0; i < subFolders.length; i++) {
            // 循环显示文件夹或文件
            if (subFolders[i].isFile()) {
                // 如果是文件则将文件添加到结果列表中
                result.add(subFolders[i]);
            } else {
                // 如果是文件夹，则递归调用本方法，然后把所有的文件加到结果列表中
                File[] foldResult = searchFile(subFolders[i], keyWord);
                for (int j = 0; j < foldResult.length; j++) {// 循环显示文件
                    result.add(foldResult[j]);// 文件保存到集合中
                }
            }
        }

        File files[] = new File[result.size()];// 声明文件数组，长度为集合的长度
        result.toArray(files);// 集合数组化
        return files;
    }

    /**
     * 以行为单位读取文件的内容
     *
     * @param fileName
     */
    public static Boolean readFileByLines(File file, String keyWord) {
        BufferedReader reader = null;
        try {
            // System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                if (tempString.toLowerCase().contains(keyWord.toLowerCase())) {
                    sb.append("文件：" + file.getAbsolutePath() + "第" + line
                            + "行： ——>" + tempString + "包含此关键字！");
                    sb.append("\r\n");
                    count++;
                }
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        if (count > 0) {
            return true;
        }
        return false;
    }

    // 在文件里写入字符串
    public static void WriteStringToFile(StringBuffer sb) {
        Date date = new Date();
        long time = date.getTime();
        String fileString = "D:/log" + time + ".txt";
        try {
            File file = new File(fileString);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                    System.out.println("创建成功！");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("创建失败！");
                }
            }
            PrintStream ps = new PrintStream(new FileOutputStream(file));
            // ps.println(sb);// 往文件里写入字符串
            ps.append(sb);//追加
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {// java程序的主入口处
        String fileName = "";
        String keyword = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要搜索文件夹的路径:");
        fileName = sc.next();
        System.out.print("请输入要搜索的关键字：");
        keyword = sc.next();

        if ("".equals(fileName) || "".equals(keyword)) {
            System.out.println("路径或者关键字不能为空！");
            System.exit(0);
        }

        File folder = new File(fileName);// 默认目录

        if (!folder.exists()) {// 如果文件夹不存在
            sb.append("目录不存在：" + folder.getAbsolutePath());
            sb.append("\r\n");
            return;
        }
        File[] result = searchFile(folder, keyword);// 调用方法获得文件数组
        sb.append("在 " + folder + " 以及所有子文件时查找对象" + keyword);
        sb.append("\r\n");
        System.out.println("在 " + folder + " 以及所有子文件时查找对象" + keyword);
        for (int i = 0; i < result.length; i++) {// 循环显示文件
            File file = result[i];
            sb.append(file.getAbsolutePath() + " ");
            sb.append("\r\n");
        }
        sb.append("查找了" + countFolders + " 个文件夹，共找到 " + +countFiles + " 个文件，"
                + count + " 个符合条件的内容");
        sb.append("\r\n");
        System.out.println(sb);
        WriteStringToFile(sb);
    }
}
