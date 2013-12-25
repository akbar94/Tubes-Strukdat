package tubes;

class Elemen {

	    String isi;
	    String path;
	    Elemen next;
	    Elemen prev;
	    }


	public class linkList {
		Elemen first,last;

	    public linkList () { 
	        first = null;
	        last = null;
	    }

	    boolean isEmpty() {
	        return (first == null && last == null);
	    }

	    void insertFirst(String isi, String path) {  
	        Elemen data = new Elemen ();
	        data.isi = isi ;
	        data.path = path ;
	        
	        if (isEmpty()) {
	            last = data;
	        } else {
	            first.prev = data;
	        }
	        data.next = first;
	        first = data;
	        
	    }

	    /*
	     * void insertLast(String isi, String path) {
	        Elemen data = new Elemen ();
	        data.isi = isi ;
	        data.path = path ;
	        
	        if (isEmpty()) {
	            first = data;
	        } else {
	            last.next = data;
	        }
	        data.prev = last;
	        last = data;
	    } */
	    
	    void searchPath (String cari){
	        Elemen tmp = first ;
	        
	        while (tmp != null){
	            if (tmp.isi.contains(cari) ){
	                  
	                System.out.println();
	                System.out.println(" Detected " + tmp.isi+ " at : " + tmp.path);
	             }
	            	tmp =tmp.next;
	        }
	        
	    }
	 
	    void readFront() {
	        Elemen tmp = first;
	        while (tmp != null) {
	            System.out.println(tmp.isi);
	            //System.out.println(tmp.path);
	            tmp = tmp.next;
	        }
	    }
	}




