package analyzefilepath;
import java.io.File;
import java.util.Scanner;

import java.io.File;
import java.util.Scanner;

public class AnalyzeFilePath {

      private static final Scanner in = new Scanner(System.in);

    private static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.length() == 0) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }

    private static void checkInputPath() {
        System.out.print("Please input Path: ");
        String path = checkInputString();
        File file = new File(path);
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("Disk: " + getDisk(path));
                System.out.println("Extension: " + getExtension(path));
                System.out.println("File name: " + getFileName(path));
                System.out.println("Path: " + getPath(path));
                System.out.println("Folder: [" + getFolder(path)+ "]");
            } else if (file.isDirectory()) {
                System.out.println("Disk: " + getDisk(path));
                System.out.println("Path: " + getPath(path));
                System.out.println("Folder: [" + getFolder(path)+ "]");
            }
        } else {
            System.err.println("Path doesn't exist.");
        }
    }

   public static String getDisk(String path)
   {
       int stringFrom = path.indexOf("/");
       return path.substring(0,stringFrom);
   }
   public static String getFileName(String path)
   {
       int stringFrom = path.lastIndexOf("/");
       int stringTo = path.lastIndexOf(".");
       return path.substring(stringFrom + 1, stringTo);
   }
   public static String getPath (String path)
   {
       int stringFrom = path.indexOf("/");
       int stringTo = path.lastIndexOf("/");
       return path.substring(stringFrom+1, stringTo);
   }
   public static String getFolder (String path)
   {
       int stringFrom = path.substring(0, path.lastIndexOf("/")).lastIndexOf("/");
       int stringTo = path.lastIndexOf("/");
       return path.substring(stringFrom+1, stringTo);
   }
   public static String getExtension (String path)
   {
       int stringTo = path.lastIndexOf(".");
       return path.substring(stringTo+1);
   }

    public static void main(String[] args) {
        checkInputPath();
    }
}

