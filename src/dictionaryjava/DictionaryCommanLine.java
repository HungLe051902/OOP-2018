/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionaryjava;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Le Hung
 */
public class DictionaryCommanLine {
    void dictionaryBasic() throws IOException {
        Scanner in = new Scanner (System.in);
        System.out.println("Nhap so luong tu : ");
        int e=in.nextInt();
        String k=in.nextLine();
        DictionaryManagement x = new DictionaryManagement();
        //x.insertFromFile();
        DictionaryCommandline y = new DictionaryCommandline(x.soluongtu,x);
        System.out.println(x.soluongtu);
        y.showAllWord();
    }
    void dictionayAdvanced() throws IOException {
        DictionaryManagement x = new DictionaryManagement();
        x.insertFromFile1();
        //x.dictionaryLookup();
        //x.AddWord();
        //x.deleteWord();
        x.changeWord();
        DictionaryCommandline y = new DictionaryCommandline(x.soluongtu,x);
        System.out.println("So luong tu trong tu dien : "+x.soluongtu);
        y.showAllWord();
    }
    void dictionaySearcher(DictionaryManagement x) throws IOException{
//        DictionaryManagement x = new DictionaryManagement();
//        x.insertFromFile1();
        Scanner on=new Scanner(System.in);
        System.out.print("Nhap tu ban muon tim : ");
        String S=on.nextLine().toLowerCase();
        for (int i=0;i<x.soluongtu;i++){
            if (x.a.arrayWord[i].word_taget.length()>=S.length()){
            if (x.a.arrayWord[i].word_taget.substring(0,S.length()).equals(S)){
                System.out.println(x.a.arrayWord[i].word_taget);
            }
        }
        }
    }
//    void readFile() throws IOException{
//        DictionaryManagement x = new DictionaryManagement();
//        x.insertFromFile1();
//    }
}
