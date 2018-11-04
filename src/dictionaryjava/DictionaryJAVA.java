
package dictionaryjava;

import com.gtranslate.Audio;
import com.gtranslate.Language;
import java.util.Scanner;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import javazoom.jl.decoder.JavaLayerException;

public class DictionaryJAVA {

    public static void main(String[] args) throws IOException, JavaLayerException, SQLException {
// Phiên bản commandline
        /*DictionaryManagement DM = new DictionaryManagement(1000000);
        DM.insertFromFile1();
        DictionaryCommanLine DCL= new DictionaryCommanLine();
        DictionaryCommandline DCl= new DictionaryCommandline(DM.soluongtu, DM);
        while (true){
            int option;
            Scanner sc = new Scanner(System.in);
            
            System.out.println("                    ****   Welcom to my dictionary   ***");
            System.out.println("                           Press 0 to SHOW ALL WORD word .");
            System.out.println("                           Press 1 to FIND word .");
            System.out.println("                           Press 2 to FIND ALL HINT word .");
            System.out.println("                           Press 3 to ADD word .");
            System.out.println("                           Press 4 to EDIT word .");
            System.out.println("                           Press 5 to DELETE word .");
            System.out.println("                           Press 6 to EXIT word .");
            option=sc.nextInt();
            switch(option){
                case 0: DCl.showAllWord();break;
                case 1: DM.dictionaryLookup();break;
                case 2: DCL.dictionaySearcher(DM);break;
                case 3: DM.AddWord();break;
                case 4: DM.changeWord();break;
                case 5: DM.deleteWord();break;
                case 6: System.exit(0);break;
            }
        }*/
//        DictionaryManagement DM = new DictionaryManagement(1000000);
//        DM.insertFromFile(DM.fileE_V);
//        for (int i=0;i<DM.soluongtu;i++){
//            if(DM.a.arrayWord[i].word_taget.equals("he")){
//                System.out.println(DM.a.arrayWord[i].word_explain);
//                break;
//            }
//        }
//        Map<String, String> map = new TreeMap<String, String>();
//        File file = new File("E_V.txt");
//        Scanner fileSc = new Scanner(file);
//        int i = 0;
//        try {
//            String o;
//            while (fileSc.hasNextLine()) {
//                o = fileSc.nextLine();
//                String[] qw = o.split("<html>");
//                map.put(qw[0], qw[1]);
//            }
//        } catch (Exception e) {
//        }
//        System.out.println("HAHAHAHA");
//        map.remove("he");
        //System.out.println(map.get(startsWith("she")));
//        for (Entry<String, String> a : map.entrySet()) {
//            System.out.println(a.getKey() + "\t" + a.getValue());
//        }
//        Audio audio = Audio.getInstance();
//        InputStream sound = audio.getAudio("I am a bus", Language.ENGLISH);
//        audio.play(sound);
//        new SpeechLanguages();
//        new TranslatorTest().*/
// Phiên bản đồ họa
      
        new DictionaryApplication().ShowAll();

    }

}

class Word {

    String word_taget;
    String word_explain;

    public Word() {
    }

    public Word(String word_taget, String word_explain) {
        this.word_taget = word_taget;
        this.word_explain = word_explain;
    }
}

class Dictionary {

    int maxSize = 1000000;
    Word[] arrayWord;

    Dictionary() {
        this.arrayWord = new Word[maxSize];
    }
}

class DictionaryManagement {

    Dictionary a;
    int soluongtu;
    String fileE_V="E_V.txt";
    String fileV_E="V_E.txt";
    Map<String, String> map;
    DictionaryManagement(int w) {
        this.a = new Dictionary();
        soluongtu = w;
    }

    DictionaryManagement() throws IOException {
        this.a = new Dictionary();
// ARRAY        
        //this.insertFromFile(fileE_V);
        
// TREE MAP
        this.useTreeMapinsertFromFile(fileE_V);
    }
    

    void insertFromCommandline() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; soluongtu > i; i++) {
            a.arrayWord[i] = new Word();
        }
        for (int i = 0; i < soluongtu; i++) {
            System.out.println("Nhap tu Tieng Anh :");
            a.arrayWord[i].word_taget = in.nextLine();
            System.out.println("Nhap giai thich :");
            a.arrayWord[i].word_explain = in.nextLine();
        }
    }

    void insertFromFile(String fileTxt) throws IOException {
        File file = new File(fileTxt);
        Scanner fileSc = new Scanner(file);
        int i = 0;
        try {
            String o;
            while (fileSc.hasNextLine()) {
                o = fileSc.nextLine();
                String[] qw = o.split("<html>");
                a.arrayWord[i] = new Word(qw[0], qw[1]);
                i++;
            }
        } catch (Exception e) {
        }
        soluongtu = i;
    }

    void insertFromFile1() throws IOException {
        File file = new File("dictionaries2.txt");
        Scanner fileSc = new Scanner(file);
        int i = 0;
        try {
            String o;
            while (fileSc.hasNextLine()) {
                o = fileSc.nextLine();
                String[] qw = o.split("\t");
                a.arrayWord[i] = new Word(qw[0], qw[1]);
                i++;
            }
        } catch (Exception e) {
        }
        soluongtu = i;
    }
    
    void useTreeMapinsertFromFile(String fileTxt) throws FileNotFoundException{
        map = new TreeMap<String, String>();
        File file = new File(fileTxt);
        Scanner fileSc = new Scanner(file);
        int i = 0;
        try {
            String o;
            while (fileSc.hasNextLine()) {
                o = fileSc.nextLine();
                String[] qw = o.split("<html>");
                map.put(qw[0], qw[1]);
            }
        } catch (Exception e) {
        }
    }
    void insertFromSqlite() {

        DAO dao = new DAO();
        String sql = "SELECT * FROM tbl_edict";
        int j = 0;
        try {
            PreparedStatement ps = dao.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                a.arrayWord[j] = new Word(rs.getString("word"), rs.getString("detail"));
                j++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        soluongtu = j;
    }

    void dictionaryLookup() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập từ TA cần tìm : ");
        String q = in.nextLine().toLowerCase();
        boolean kt = false;
        for (int i = 0; i < soluongtu; i++) {
            if (a.arrayWord[i].word_taget.equals(q)) {
                System.out.println(a.arrayWord[i].word_explain);
                System.out.println("Bạn có muốn nghe phát âm của từ này : YES/NO ");
                String l = in.nextLine().toUpperCase();
                if (l.equals("YES")) {
                    new Freetts(q);
                }
                kt = true;
                break;
            }
        }
        if (kt == false) {
            System.out.println("Không tìm thấy từ này trong từ điển ! ");
        }
    }

    void AddWord() {
        
        Scanner on = new Scanner(System.in);
        
        String s,d;
        int we=0;
        System.out.print("Nhập từ Tiếng Anh cần thêm : ");
        s = on.nextLine().toLowerCase();
        System.out.print("Nhập nghĩa của từ Tiếng Anh cần thêm : ");
        d = on.nextLine().toLowerCase();
        for (int i = 0; i < soluongtu; i++){
            if(a.arrayWord[i].word_taget.equals(s)){
                we=1;
                System.out.println("Đã có từ này, mời thêm từ khác !");
                break;
            }
        }
        if (we==0){
            System.out.println("Từ đã được thêm ! ");
            a.arrayWord[soluongtu] = new Word(s,d);
        soluongtu++;
        }
    }

    void deleteWord() {
        Scanner on = new Scanner(System.in);
        int k = 0;
        System.out.print("Nhập từ muốn xóa : ");
        String s = on.nextLine().toLowerCase();
        for (int i = 0; i < soluongtu; i++) {
            if (a.arrayWord[i].word_taget.equals(s)) {
                soluongtu--;
                k = 1;
                for (int j = i; j < soluongtu; j++) {
                    a.arrayWord[j] = a.arrayWord[j + 1];
                }
                System.out.println("Từ đã được xóa ! ");
                break;
            }
        }
        if (k == 0) {
            System.out.println("Không tìm thấy từ cần xóa ! ");
        }
    }

    void changeWord() {
        Scanner on = new Scanner(System.in);
        int k = 0;
        System.out.print("Nhập từ Tiếng Anh bạn muốn thay đổi : ");
        String s = on.nextLine().toLowerCase();
        for (int i = 0; i < soluongtu; i++) {
            if (a.arrayWord[i].word_taget.equals(s)) {
                System.out.print("Bạn muốn sửa từ TA này thành : ");
                a.arrayWord[i].word_taget = on.nextLine().toLowerCase();
                System.out.print("Bạn có muốn sửa nghĩa của từ này : YES/NO ");
                String l = on.nextLine().toUpperCase();
                if (l.equals("YES")) {
                    System.out.println("Nhập nghĩa của từ muốn thay đổi : ");
                    a.arrayWord[i].word_explain = on.nextLine().toLowerCase();
                }
                k = 1;
                break;
            }
        }
        if (k == 0) {
            System.out.println("Không có từ mà bạn muốn thay đổi !" );
        }
    }

    void dictionaryExportToFile() throws IOException {
        File file = new File("E_V.txt");

        try (FileWriter fw = new FileWriter(file);
                BufferedWriter bf = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bf);) {
            for (int i = 0; i < soluongtu; i++) {
                pw.println(a.arrayWord[i].word_taget + "<html>" + a.arrayWord[i].word_explain);
            }
            pw.close();
            bf.close();
            fw.close();
        } catch (IOException e) {
        }
        finally{
           
        }

    }

    void insertFromFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class DictionaryCommandline {

    int soluongtu;
    DictionaryManagement k;
    
    DictionaryCommandline(int w, DictionaryManagement z) {
        soluongtu = w;
        this.k = z;
    }

    void showAllWord() {
        System.out.println("CAC TU TRONG TU DIEN : ");
        for (int i = 0; i < soluongtu; i++) {
            String t = "                                     ";
            String T = t.substring(k.a.arrayWord[i].word_taget.length());
            String q = "                            | ";
            String e = String.valueOf(i + 1);   // chuyen doi so nguyen thanh String
            String Q = q.substring(e.length());  // cat chuoi nho de hien thi
            System.out.println(i + 1 + Q + k.a.arrayWord[i].word_taget + T + " | " + k.a.arrayWord[i].word_explain);

        }
    }
}
