package mypack;

public class Launcher {
	
	static LinkNode head=null;
	 
	 public Launcher() {
		 head=null;
	 }
	
	static void insertinEnd(Stud stud) {
		LinkNode c=new LinkNode(stud);
		if (head==null)
		head=c;
		else
		{
		LinkNode curr=head;
		while (curr.next!=null) curr=curr.next;
		curr.next=c;
		}
		
		}
		
	
	
	
	public static void main(String[]args) {
		
		insertinEnd(new Stud(12,"SAIM"));
		insertinEnd(new Stud(13,"Dhiraj"));
		insertinEnd(new Stud(14,"Surya"));
		
		
		/*LinkNode head=new LinkNode(new Stud(12,"saim"));
		
	head.next=new LinkNode(new Stud(13,"dhiraj"));
	head.next.next=new LinkNode(new Stud(14,"surya"));
	*/
	/*Stud s1=new Stud(15,"aman");
	head.next.next=new LinkNode(s1);*/
	
	LinkNode curr=head;
	while(curr!=null) {
		System.out.println(curr.data);
		curr=curr.next;
		
	}
	}

}
