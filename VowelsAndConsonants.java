package practice;

import java.util.*;
import java.io.*;

public class VowelsAndConsonants {

public static void main(String[] args) {
try {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String");
String str = sc.nextLine().toLowerCase();
int length = str.length();

File f1 = new File("Sentence.txt");
if(f1.exists()) {
System.out.println("File "+f1.getName()+" exists");
}
else {
f1.createNewFile();
System.out.println("File Created");
}

File fv = new File("Vowel.txt");
if(fv.exists()) {
System.out.println("File "+fv.getName()+" exists");
}
else {
fv.createNewFile();
System.out.println("File Created");
}

File fc = new File("Consonants.txt");
if(fc.exists()) {
System.out.println("File "+fc.getName()+" exists");
}
else {
fc.createNewFile();
System.out.println("File Created");
}

FileWriter f1w = new FileWriter(f1);
f1w.write(str);
f1w.close();


FileReader f1r  =new FileReader(f1);
char[] s = new char[length];
f1r.read(s);
f1r.close();

FileWriter fvw = new FileWriter(fv);
FileWriter fcw = new FileWriter(fc);

for(char ch: s) {
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
fvw.write(ch);
}
else {
fcw.write(ch);
}
}
fvw.close();
fcw.close();

FileReader fvr = new FileReader(fv);
FileReader fcr = new FileReader(fc);
FileReader f1r2 = new FileReader(f1);

BufferedReader br1 = new BufferedReader(f1r2);
BufferedReader br2 = new BufferedReader(fvr);
BufferedReader br3 = new BufferedReader(fcr);

String str1;
System.out.println("Contents of Sentence File:");
while((str1=br1.readLine())!=null) {
System.out.println(str1);
}

String str2;
System.out.println("Contents of Vowel File:");
while((str2=br2.readLine())!=null) {
System.out.println(str2);
}

String str3;
System.out.println("Contents of Consonants File:");
while((str3=br3.readLine())!=null) {
System.out.println(str3);
}

br1.close();
br2.close();
br3.close();
sc.close();

}
catch(Exception e) {
System.out.println("Exception Occurs");
}
}

}