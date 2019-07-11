package day7.mycollection;


/**
 * �Զ���һ������
 * ����get����
 * @author Administrator
 *
 */
public class SxtLinkedList02 {
	
	private   Node  first;
	private  Node  last;
	
	private  int size;
	
	

	//[]    
	//["a","b","c","d","e","f"]           2
	public  Object  get(int index) {  
	
		
		if(index<0||index>size-1){
			throw  new RuntimeException("�������ֲ��Ϸ�:"+index);
		}
		
		Node  temp = null;
		//TODO ���ֲ���
		if(index<=(size>>1)){   //size>>1�൱�ڳ���2
			temp = first;
			for(int i=0;i<index;i++){
				temp = temp.next;
			}
		}else{
			temp = last;
			for(int i=size-1; i>index;i--){
				temp = temp.previous;
			}
		}
		
		
		return temp.element;
	}
	
	

	public  void  add(Object  obj) {
		Node  node  = new Node(obj);
		
		if(first==null){
//			node.previous = null;
//			node.next = null;
			first = node;
			last = node;
		}else{
			
			node.previous = last;
			node.next = null;
			
			last.next = node;
			last = node;
			
		}
		
		size++;
		
		
	}
	
	@Override
	public String toString() {
		//[a,b,c]     first=a,    last=c
		//a,b,c
		StringBuilder   sb = new StringBuilder("[");
		Node  temp = first;
		while(temp!=null){
			sb.append(temp.element+",");
			temp = temp.next;
		}
		sb.setCharAt(sb.length()-1, ']'); 
		
		return sb.toString();
	}	
	
	public static void main(String[] args) {
		SxtLinkedList02  list = new SxtLinkedList02();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
		System.out.println(list.get(3));
		
		
	}
	
	
}
