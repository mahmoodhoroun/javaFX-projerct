package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class file {

    public static String read_stu() throws FileNotFoundException {
        File f = new File("C:\\Users\\Abood_Yasen\\Documents\\NetBeansProjects\\Progect_Java\\src\\project_java\\src\\Files\\student.txt");
        Scanner S = new Scanner(f);
        String txt = "";
        while (S.hasNextLine()) {
            txt += S.nextLine() + "\n";
        }
        return txt;

    }

    public static String read_tesh() throws FileNotFoundException {
        File f = new File("C:\\Users\\Abood_Yasen\\Documents\\NetBeansProjects\\Progect_Java\\src\\project_java\\src\\Files\\teaher.txt");
        Scanner S = new Scanner(f);
        String txt = "";
        while (S.hasNextLine()) {
            txt += S.nextLine() + "\n";
        }
        return txt;

    }

    public static String read_sub() throws FileNotFoundException {
        File f = new File("C:\\Users\\Abood_Yasen\\Documents\\NetBeansProjects\\Progect_Java\\src\\project_java\\src\\Files\\subject.txt");
        Scanner S = new Scanner(f);
        String txt = "";
        while (S.hasNextLine()) {
            txt += S.nextLine() + "\n";
        }
        return txt;

    }

    public static String read_Maneger() throws FileNotFoundException {
        File f = new File("/home/mahmood/NetBeansProjects/GUI_project/project_java/src/Files/Maneger.txt");
        Scanner S = new Scanner(f);
        String txt = "";
        while (S.hasNextLine()) {
            txt += S.nextLine() + "\n";
        }
        return txt;

    }

    public static String read_Employee() throws FileNotFoundException {
        File f = new File("/home/mahmood/NetBeansProjects/GUI_project/project_java/src/Files/Employee.txt");
        Scanner S = new Scanner(f);
        String txt = "";
        while (S.hasNextLine()) {
            txt += S.nextLine() + "\n";
        }
        return txt;

    }
//=================================================================================================================
//=================================================================================================================  

    public static void write_stu(String in) throws FileNotFoundException {
        File f = new File("C:\\Users\\Abood_Yasen\\Documents\\NetBeansProjects\\Progect_Java\\src\\project_java\\src\\Files\\student.txt");
        String txt = read_stu();
        PrintStream P = new PrintStream(f);
        P.print(txt + in);

    }

    public static void write_tesh(String in) throws FileNotFoundException {
        File f = new File("C:\\Users\\Abood_Yasen\\Documents\\NetBeansProjects\\Progect_Java\\src\\project_java\\src\\Files\\teaher.txt");
        String txt = read_tesh();
        PrintStream P = new PrintStream(f);
        P.print(txt + in);

    }

    public static void write_sub(String in) throws FileNotFoundException {
        File f = new File("C:\\Users\\Abood_Yasen\\Documents\\NetBeansProjects\\Progect_Java\\src\\project_java\\src\\Files\\subject.txt");
        String txt = read_sub();
        PrintStream P = new PrintStream(f);
        P.print(txt + in);

    }

    public static void write_Maneger(String in) throws FileNotFoundException {
        File f = new File("/home/mahmood/NetBeansProjects/GUI_project/project_java/src/Files/Maneger.txt");
        String txt = read_Maneger();
        PrintStream P = new PrintStream(f);
        P.print(txt + in);

    }

    public static void write_Employee(String in) throws FileNotFoundException {
        File f = new File("/home/mahmood/NetBeansProjects/GUI_project/project_java/src/Files/Employee.txt");
        String txt = read_Employee();
        PrintStream P = new PrintStream(f);
        P.print(txt + in);

    }

//========================================================================================
    public static boolean search_tesh(String name) throws FileNotFoundException {
        boolean x = false;
        String teah = file.read_tesh();
        Scanner S = new Scanner(teah);
        String N = "";
        while (S.hasNextLine()) {
            N = "";
            N = S.nextLine().split(",")[0].split("=")[1];

            if (name.equals(N)) {
                x = true;
                break;

            }
            if ((!S.hasNextLine())) {
                x = false;

            }
        }
        return x;
    }

    public static boolean search_stu(String name) throws FileNotFoundException {
        boolean x = false;
        String stu = file.read_stu();
        Scanner S = new Scanner(stu);
        String word = "";
        while (S.hasNextLine()) {
            word = "";
            word = S.nextLine().split(",")[0].split("=")[1];
            if (name.equals(word)) {
                x = true;
                break;

            }
            if ((!S.hasNextLine())) {
                x = false;
            }
        }

        return x;
    }

    public static String line(String type, int index) throws FileNotFoundException {
        String Emp = file.read_Employee();
        Scanner S = new Scanner(Emp);
        String word = null;
        while (S.hasNextLine()) {
            String w;
            word = S.nextLine();
            w = word.split(",")[index].split("=")[1];
            if (type.equals(w)) {
                break;
            }
            if ((!S.hasNextLine())) {
                word = null;
                break;
            }
        }
        return word;
    }
    public static String lineM(String type, int index) throws FileNotFoundException {
        String Emp = file.read_Maneger();
        Scanner S = new Scanner(Emp);
        String word = null;
        while (S.hasNextLine()) {
            String w;
            word = S.nextLine();
            w = word.split(",")[index].split("=")[1];
            if (type.equals(w)) {
                break;
            }
            if ((!S.hasNextLine())) {
                word = null;
                break;
            }
        }
        return word;
    }
    public static String lineT(String type, int index) throws FileNotFoundException {
        String Emp = file.read_tesh();
        Scanner S = new Scanner(Emp);
        String word = null;
        while (S.hasNextLine()) {
            String w;
            word = S.nextLine();
            w = word.split(",")[index].split("=")[1];
            if (type.equals(w)) {
                break;
            }
            if ((!S.hasNextLine())) {
                word = null;
                break;
            }
        }
        return word;
    }

    public static boolean search_E_id(String id) throws FileNotFoundException {
        boolean x = false;
        if (line(id, 1) == (null)) {
            x = false;
        } else {

            String word = line(id, 1).split(",")[1].split("=")[1];
            if (id.equals(word)) {
                x = true;
            }
        }
        return x;
    }
    public static boolean search_M_id(String id) throws FileNotFoundException {
        boolean x = false;
        if (lineM(id, 1) == (null)) {
            x = false;
        } else {

            String word = lineM(id, 1).split(",")[1].split("=")[1];
            if (id.equals(word)) {
                x = true;
            }
        }
        return x;
    }
    public static boolean search_T_id(String id) throws FileNotFoundException {
        boolean x = false;
        if (lineT(id, 1) == (null)) {
            x = false;
        } else {

            String word = lineT(id, 1).split(",")[1].split("=")[1];
            if (id.equals(word)) {
                x = true;
            }
        }
        return x;
    }

    public static boolean search_E_P(String password) throws FileNotFoundException {
        boolean x = false;
        if (line(password, 2) == (null)) {
            x = false;
        } else {

            String word = line(password, 2).split(",")[2].split("=")[1];
            if (password.equals(word)) {
                x = true;
            }
        }
        return x;
    }

 
    public static int L_N(String id) throws FileNotFoundException{
        
       String Emp = file.read_Employee();
        Scanner S = new Scanner(Emp);
        String word = null;
        int num = 1;
      
        while (S.hasNextLine()) {
            String w;
            word = S.nextLine();
            w = word.split(",")[1].split("=")[1];
            if (id.equals(w)) {
             
                break;
            }
            if ((!S.hasNextLine())) {
                num = 0;
                break;
            }
            num++;
        }
        return num;
    }


    public static void move(String id) throws FileNotFoundException {
           String Emp = file.read_Employee();
        Scanner S = new Scanner(Emp);
        Scanner S1 = new Scanner(Emp);
        int num1 = L_N(id);
      
        int num2 = 1;
                String line = S1.nextLine();
                File f = new File("/home/mahmood/NetBeansProjects/GUI_project/project_java/src/Files/Employee.txt");
                String txt ="";
                Scanner s = new Scanner(f);
                while(s.hasNextLine()){
            if (num1 == num2) {
                
                s.nextLine();
            }
            if(s.hasNextLine())
                    txt +=s.nextLine()+"\n";
             num2++;
          
                }
                PrintStream P = new PrintStream(f);
                     P.print(txt );}
       
    
}


