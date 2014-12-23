package queens;


class ChampConst {
    static StringBuilder createConst(int lastDigit){
        StringBuilder constant = new StringBuilder();
        int i = 1;
        while(constant.length() < lastDigit){
            constant.append(String.valueOf(i));
            i++;
        }
        return constant;
    }
    
    static int getProduct(StringBuilder str, int... indices){
        int prod = 1;
        for(int i:indices){
            prod *= Integer.valueOf(str.charAt(i)+"");
            System.out.println(str.charAt(i));
        }
        return prod;
    }
    
    public static void main(String[] args){
        StringBuilder s = createConst(1000000);
        System.out.println(getProduct(s, 1-1, 10-1, 100-1, 1000-1, 10000-1, 100000-1, 1000000-1));
    }
}
