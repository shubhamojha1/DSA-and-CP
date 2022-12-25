//gives presentation error, plus TLE.. need to improve
import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;

// import javax.lang.model.util.ElementScanner14;
class Main {
    public static void main(String args[])throws FileNotFoundException{
        PrintStream o = new PrintStream(new File("A.txt"));
  
        // Store current System.out before assigning a new value
        PrintStream console = System.out;
  
        // Assign o to output stream
        System.setOut(o);
        // System.out.println(convertAllToNums("888-4567"));
        // System.out.println(convertAllToNums("ITS-EASY"));
        // System.out.println(convertAllToNums("3-10-10-10"));
        // System.out.println(convertAllToNums("888-GLOP"));
       Scanner sc = new Scanner(System.in);
    //    ArrayList<Integer> arr = new ArrayList<Integer>();
        int t = sc.nextInt();
        
        while(t--!=0){
            int numTelephones = sc.nextInt();
            String telephones[] = new String[numTelephones];
            for(int i=0;i<numTelephones;i++)
            {telephones[i]=sc.next();}
            
            SortedMap<String, Integer> map
            = new TreeMap<String, Integer>();
            for(int i=0;i<numTelephones;i++){
                String pureTelephoneNo = convertAllToNums(telephones[i]);
                // String pureTelephoneNo = telephones[i];
                //will convert letters to digits, and remove hyphens as well, 
                //easier, and hyphens can be added later
                if(map.containsKey(pureTelephoneNo)){
                    map.put(pureTelephoneNo, map.get(pureTelephoneNo)+1);
                }
                else{
                    map.put(pureTelephoneNo, 1);
                }
                // System.out.println(map);
               
            }
            boolean duplicates = false;

            for(Map.Entry mapElement : map.entrySet()){
                String telephoneNo = (String)mapElement.getKey();
                telephoneNo = telephoneNo.substring(0,3)+"-"+telephoneNo.substring(3);
                if((Integer)(mapElement.getValue()) > 1){
                    System.out.println(telephoneNo+" "+mapElement.getValue());
                    duplicates = true;
                } 
            }
            if(!duplicates)
            System.out.println("No duplicates.");

            System.out.println();
        }
    }

    public static String convertAllToNums(String telephoneNo){
        String slashesremoved = "";
        for(int i=0;i<telephoneNo.length();i++){
            char ch = telephoneNo.charAt(i);
            if(ch!='-')
            slashesremoved+=ch;
        }
        String finalTelephoneNo = "";
        for(int i=0;i<slashesremoved.length();i++){
            char ch = slashesremoved.charAt(i);
            if(ch>='A' && ch<='C')
            finalTelephoneNo+='2';
            else if(ch>='D' && ch<='F')
            finalTelephoneNo+='3';
            else if(ch>='G' && ch<='I')
            finalTelephoneNo+='4';
            else if(ch>='J' && ch<='L')
            finalTelephoneNo+='5';
            else if(ch>='M' && ch<='O')
            finalTelephoneNo+='6';
            else if(ch>='P' && ch<='S' && ch!='Q')
            finalTelephoneNo+='7';
            else if(ch>='T' && ch<='V')
            finalTelephoneNo+='8';
            else if(ch>='W' && ch<='Y')
            finalTelephoneNo+='9';
            else
            finalTelephoneNo+=ch;
        }
        return finalTelephoneNo;
        // return slashesremoved;
    }
}
