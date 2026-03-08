import java.util.*;
public class  Stack
{
    int maxSize;
    int stackArr[];
    int top;
    //default constructor
    public Stack() {
    maxSize=5;
    stackArr=new int[maxSize];
    top=-1;
    }
    //Parameter constructor
    public Stack(int size) {
    maxSize=size;
    stackArr=new int[maxSize];
    top=-1;
    }
    public  Stack(Stack ob,int size)
    {
        maxSize=size;
    stackArr=new int[maxSize];
    top=-1;
    }
    
    public void push(int data)
    {
        // System.out.println("Enter the Data");
    stackArr[++top]=data;
    
    }
    public void peek()
    {
        System.out.println("Top of the Stack is "+stackArr[top]);
    }
    public void pop()
    {
        System.out.println("Pooped Suuccessfully:"+stackArr[top--]);
    }
 public void display()
 {
    System.out.println("Stack Data:");
      for(int i=0;i<=top;i++)
   {
    System.out.print(stackArr[i]+" ");
   }
 }
 public void sort()
 {
int temp;
   for(int i=0;i<=top;i++)
   {

    for(int j=i;j<=top;j++)
    {
    if(stackArr[i]>stackArr[j])
    {
        temp=stackArr[i];
        stackArr[j]=stackArr[i];
        stackArr[i]=temp;
    }
    }
   display();
      }
 }
 public void search(int data)
 {
    for(int i=0;i<=top;i++)
   {
    if(stackArr[i]==data)
    {
    System.out.println(stackArr[i]+", Found");
    break;
    }
   }
   System.out.println("Not Found");
 }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of the Stack:");
        int s=sc.nextInt();
        int c,choice,data;
        Stack stack=new Stack(s);// parameter calling
        // Stack stack=new Stack();default calling
        // Stack stack=new Stack(stack,s);copy reference constructor calling

        do { 
            
            System.out.println("Enter the option :\n *push-1 \n *pop-2 \n *peek-3 \n *search-4 \n *sort-5 \n *display-6");
        System.out.print("Enter the Choice:"); 
        choice=sc.nextInt();
         switch(choice) {
            case 1:
                data=sc.nextInt();
                stack.push(data);                 
                break;
            case 2:stack.pop();
            break;
            case 3:stack.peek();
            break;
            case 4:data=sc.nextInt();
                   stack.push(data);                 
                   break;
            case 5: stack.sort();
            break;
            case 6:stack.display();
            break;  
         }
        System.out.println("Press 10 to Do you want to continue");
        c=sc.nextInt();
        } while (c==10);
     


    }
}