class Test {

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.rFactorial(5));
    }

    public int rFactorial(int n){
        return tFactorial(5,1);
    }

    private int tFactorial(int n, int f) {
        if(n<=0){
            return 1;
        }
        return tFactorial(n-1,n*f);
    }
}

