class BooleanArray {
    public static void main(String args[]){
        boolean array[];
        array=new boolean[4];
        array[0]=true;
        array[1]=false;
        array[2]=false;
        array[3]=false;
        System.out.println("Java boolean array example");
        for(int i=0;i<array.length;i++){
            System.out.println("boolean array element at: "+i+" "+array[i]);
        }
    }
}
