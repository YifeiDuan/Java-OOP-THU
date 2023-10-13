package hugeinteger;

public class HugeInteger {
    public int[] digits = new int[40];
    public int length = 0;

    HugeInteger(String str){
        for(int i = 0 ; i < 40 ; i ++) {
            digits[i] = 0;
        }

        char[] chr = str.toCharArray();
        for(int i = 0; i < chr.length; i ++){
            digits[i + 40 - chr.length] = Integer.parseInt(String.valueOf(chr[i]));
        }
        length = chr.length;
    }

    public void input(String str){
        for(int i = 0 ; i < 40 ; i ++) {
            digits[i] = 0;
        }

        char[] chr = str.toCharArray();
        for(int i = 0; i < chr.length; i ++){
            digits[i + 40 - chr.length] = Integer.parseInt(String.valueOf(chr[i]));
        }
        length = chr.length;
    }

    public void output(){
        for(int i = 40 - length; i < 40 ; i ++){
            System.out.print(digits[i]);
        }
    }

    public void add(HugeInteger B){
        for(int i = 39; i > 0 ; i --){
            int temp = digits[i] + B.digits[i];
            if(temp > 9){
                digits[i] = temp - 10;
                digits[i - 1] += 1;
            }
            else digits[i] = temp;
        }
        digits[0] = digits[0] + B.digits[0];

        int tmp = 0;
        for(int i = 0 ; i < 40 ; i ++){
            if(digits[i] == 0) tmp += 1;
            else break;
        }
        if(tmp != 40) length = 40 - tmp;
        else length = 1;
    }

    public boolean isEqualTo(HugeInteger B){
        return (compare(B) == 0);
    }

    public boolean isNotEqualTo(HugeInteger B){
        return (compare(B) != 0);
    }

    public boolean isGreaterThan(HugeInteger B){
        return (compare(B) == 1);
    }

    public boolean isLessThan(HugeInteger B){
        return (compare(B) == 2);
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger B){
        return (compare(B) != 2);
    }

    public boolean isLessThanOrEqualTo(HugeInteger B){
        return (compare(B) != 1);
    }

    private int compare(HugeInteger B){
        if(length > B.length) return 1;
        if(length < B.length) return 2;

        for(int i = 40 - length ; i < 40 ; i ++){
            if(digits[i] > B.digits[i]) return 1;
            if(digits[i] < B.digits[i]) return 2;
        }

        return 0;
    }
}
