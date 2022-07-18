package homework.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("please input path");
        String path = scanner.nextLine();
        System.out.println("please input file's name");
        String fileName = scanner.nextLine();
        System.out.println("please input content");
        String content = scanner.nextLine();
       // fileSearch(path,fileName);
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        System.out.println("please input txtPath");
        String txtPath = scanner.nextLine();
       //   try {
          //  System.out.println(contentSearch(path,keyword));
        // } catch (IOException e) {
       //  e.printStackTrace();
       //  }
      //  printSizeOfPackage(path);
        findLines(txtPath,keyword);


        createFileWithContent(path,fileName,content);

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true ե//թե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static boolean fileSearch(String path, String fileName) {
        File file = new File(path, fileName);
        if (!file.exists() || file.isFile()) {
            return false;
        }
        File[] list = file.listFiles();
        for (File f : file.listFiles()) {
            if (f.getName().equals(fileName)) {
                return true;
            }
        }
        return false;
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static boolean contentSearch(String path, String keyword) throws IOException {
        File file = new File(path, keyword);

        if (!file.exists() || file.isFile()) {
            System.out.println("directory is not exist");
        } else {
            File[] list = file.listFiles();
            for (File f : file.listFiles()) {
                if (f.getName().endsWith(".txt")) {
                    BufferedReader inputStream = new BufferedReader(new FileReader(f));
                    String line = "";
                    while ((line = inputStream.readLine()) != null) {
                        if (line.contains(keyword))
                            System.out.println(line);
                        break;
                    }

                }
            }
        }

        return false;
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static boolean findLines(String txtPath, String keyword) throws IOException {
        File file = new File(txtPath, keyword);

        if (!file.exists() || file.isFile()) {
            System.out.println("directory is not exist");
        } else {
            File[] list = file.listFiles();
            for (File f : file.listFiles()) {
                if (f.getName().contains("java")) {
                    BufferedReader inputStream = new BufferedReader(new FileReader(f));
                    String line = "";
                    while ((line = inputStream.readLine()) != null) {
                        if (line.contains(keyword))
                            System.out.println(line);
                        break;
                    }

                }
            }
        }

        return false;
    }


    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage(String path) {
        File file = new File(path);
        if (file.isFile() && file.isDirectory()) {
            long sum = 0;
            for (File o : file.listFiles()) {
                sum += o.length();
            }
            System.out.println(sum);
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent(String path,String fileName,String content) {
        File file = new File(path);
        if (!file.exists() && file.isFile()) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write(content);
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}

