package myapp;


class LinkedList{
        private Booking head;
        
	    public  LinkedList(){head=null;}

		public  void insert(int i, String n,String c, int h, int m, int rn, String rt)
	        {      Booking temp =new Booking(i, n,c, h,m, rn, rt);
			       temp.next=head;
			       head=temp;
			}
       
		public  Booking readBook(int el)
        {      if (head==null|| this.count()<el)
        	                 return null;
			   Booking temp=head;
               int current=1;
               while(current!=el) {
                       current++;
                       temp=temp.next;}
               return temp; } 


		public  int count()
	        {      Booking temp=head;
                   int res=0;
	               while(temp!=null) {
                          res++;
	                      temp=temp.next;}
	               
	               return res; }


		public String delete_first()
	       {         if (head==null)return null;
		             String res=head.readPerson();
		             head = head.next;
		             return res;
                  }
		public void delete_all()
	       {         head=null;
               }


	     public void printlist()
	                        {
		               Booking temp=head;
		               System.out.println("\nList:");
		               System.out.print("HEAD->");
			           while(temp!=null) {
			               temp.print();
			               temp=temp.next;}
			               
			            System.out.print("NULL");   
			               
			            }
	     
	     
	     public String getlist()
         {
	    	 String res ="";
    Booking temp=head;
   
    while(temp!=null) {
       res += temp.getDetails();
        temp=temp.next;
       }
	return res;
        
    
        
     }
	     
	     public  String search(String s1)
	        {     

	    	 Booking temp=head;
	    	 String res ="";
	           while(temp!=null) {
	              if(temp.readName().equals(s1))
	              {
	            	  res = temp.getDetails();
	              }
	               temp=temp.next;
	          }
	           return res;
	              
	        }
	     
	     public  String searchById(int s1)
	        {     

	    	 Booking temp=head;
	    	 String res ="";
	           while(temp!=null) {
	              if(temp.readID() == s1)
	              {
	            	  res = temp.getDetails();
	              }
	               temp=temp.next;
	          }
	           return res;
	              
	        }

   }


   