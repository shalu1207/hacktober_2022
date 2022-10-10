
public class linear {
    public static int linear(int n[],int key){
        for(int i=0;i<=n.length;i++){
            if(n[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n[]={2,3,4,5,6,10};
        int key=10;
        int index=linear(n,key);
        if(index==-1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("key is at index"+index);
        }

    }
}
