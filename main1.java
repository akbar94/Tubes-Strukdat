package tubes;
import java.io.*;
import java.util.Scanner;

public class main1 {

    public static void main(String[] args) {
        int data;
        String wordInput;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("========================");
        System.out.println(" Folder Indexer ");
        System.out.println("========================");
        System.out.println(" Input Your Text Here : ");
        wordInput = sc.next();
        System.out.println("========================");
        
        
        
        String path = "E:/dafiik/IT Telkom/SEMESTER 3/STRUKTDAT/tubes/asdf/20_newsgroups";
        File folder = new File(path);

        String[]isi = folder.list();
        System.out.println(" ");
        System.out.println(" Please wait . . . ");
        
        //System.out.println();

        for (int i = 0; i < isi.length; i++) {							
            File isiPath = new File(path + "/" + isi[i]);
            String[] newIsi = isiPath.list();
            	for (int j = 0; j < newIsi.length; j++) {
            	BufferedReader br = null;  //BACA FILE
 
            	try { 
					
                    String CurrentLine;
                    br = new BufferedReader(new FileReader(path + "/" + isi[i] + "/" + newIsi[j]));
 
                    while((CurrentLine = br.readLine()) != null) {
                            String[] sudahBaca = CurrentLine.split("\\s+");
                            for (int counter = 0; counter < sudahBaca.length; counter++){
                            	
                                 String fixPath = path + "/" + isi[i] + "/" + newIsi [j];
                                 String kataKetemu = sudahBaca[counter];
                                 
                                 linkList Dll = new linkList();
                                 Dll.insertFirst(kataKetemu, fixPath);
                                 Dll.searchPath(wordInput);
                               }
                    		}
                    
            			} catch (IOException ex) {
            				ex.printStackTrace();
            			} finally {
			
            				try {
            					if (br != null)br.close();
            					}catch (IOException ex) {
            						ex.printStackTrace();
            					}
            				}
                
            			}
        			}
                
    			}
			}
        
    


	