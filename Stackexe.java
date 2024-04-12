public class Stackexe {
    private int top ;
    private int arrray[];

    public Stackexe(int max){
        this.top = -1;
        this.arrray = new int[max];

    }

    void push(int data){
        if(top == arrray.length-1){
           System.out.println("Stack is full");
           return ;
        }
        top ++;
        arrray[top]=data;

    }

    int pop(){
        if(top==-1){
            System.out.println("NO E;ement in Statck");
            return -1 ;
        }
        int x = arrray[top];
        arrray[top] = 0;
        top--;
        return x;
    }
    int peek(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arrray[top];
    }

    public static void main(String[] args) {
        Stackexe st = new Stackexe(20);
        st.push(5);
        st.push(10);
        st.pop();
        System.out.println("Top value is : " + st.peek());
    }
    
    
}
