void print_out(){
    IO.println("крутость");
}

void square_eq(double a, double b, double c){
    double dis=b*b-4*a*c;
    double x1,x2;

    if (dis>0){
        x1=(-b-(Math.sqrt(dis)))/(a*2);
        x2=(-b+(Math.sqrt(dis)))/(a*2);
        IO.println((""+x1)+" "+(""+x2));
    }
    if (dis==0){
        IO.println(-b/(a*2));
    }
    if (dis<0){
        IO.println("no possible solutions");
    }
}

boolean palim_check(int int_num){
    String num = ""+int_num;
    boolean ans = true;

    for (int i=0;i<num.length();i++){
        if (num.charAt(i)!=num.charAt(num.length()-i-1)){
            ans = false;
        }
    }

    return ans;
}

void main() {
    print_out();

    square_eq(1,4,4);

    IO.println(palim_check(1221));
}
