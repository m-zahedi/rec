package recursive;
public class recursive { 
	String array[];
 static int recursive_edit_dst(String str1, String str2, int length1, int length2){ 

     // If string1 is empty, return string2 
     if (length1 == 0) 
         return length2; 
     // If string2 is empty, return string1  
     if (length2 == 0) 
         return length1; 
     
     // If last characters of string1 & string2 are the same -> smaller subproblem 
     if (str1.charAt(length1 - 1) == str2.charAt(length2 - 1)) 
         return recursive_edit_dst(str1, str2, length1 - 1, length2 - 1); 

     // If last characters are not equal, consider all three options
     return 1 + minimum(recursive_edit_dst(str1, str2, length1, length2 - 1),    // Insert 
    		            recursive_edit_dst(str1, str2, length1 - 1, length2),    // Remove 
    		            recursive_edit_dst(str1, str2, length1 - 1, length2 - 1) // Replace 
                        ); 
 } 
 int i=0;
 static int minimum(int insert, int remove, int modify) { 
     if (insert <= remove && insert <= modify) {
         return insert; 
     } 
     if (remove <= insert && remove <= modify) {
         return remove; 
    	 
     } 
     else {
         return modify; 
     }

 } 
 
 public static void main(String args[]) { 
	 //AAM63747_cl_6
     String string1 = "MASSSALALRRLL";
     		        //+ "LDPFTPTRSLSQMLNFMDQVSEIPLVSATRGMGASGVRRGWNVKEKDDALHLRIDMPGLSREDVKLALEQ"
     	         	//+ "NTLVIRGEGETEEGEDVSGDGRRFTSRIELPEKVYKTDEIKAEMKNGVLKVVIPKIKEDERNNIRHINVD"; 
     //AAM67165_cl_2
     String string2 = "MSAVAINHFFGLPET";
     		     //   + "VEEERTLVIKSNGKRKRDDDESEEGSKYIRLERRLAQNLVKKFRLPEDADMASVTAKYQEGILTVVIKKL"
     	         //	+ "PPQPPKPKTVQIAVS"; 
     System.out.println(string1);
     System.out.println(string2);
     System.out.println(recursive_edit_dst(string1, string2, string1.length(), string2.length())); 
 } 
 
} 