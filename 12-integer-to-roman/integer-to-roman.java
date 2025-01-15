class Solution {
    public String intToRoman(int num) {
        StringBuffer sb = new StringBuffer();
        while(num !=0){
            // System.out.println("num" + num);
            if(num >= 1 && num < 4){
                sb.append("I");
                num = num -1;
            }else if(num == 4){
                sb.append("IV");
                num = num -4;
            }else if(num >=5 && num < 9){
                sb.append("V");
                num = num -5;
            }else if(num == 9){
                sb.append("IX");
                num = num - 9;
            }else if(num >= 10 && num <40){
                sb.append("X");
                num = num - 10;
            }else if(num >= 40 && num < 50 ){
                sb.append("XL");
                num = num - 40;
            }else if(num >= 50 && num < 90){
                sb.append("L");
                num = num -50;
            }else if(num >= 90 && num < 100){
                sb.append("XC");
                num = num -90;
            }else if(num >= 100 && num < 400){
                sb.append("C");
                num = num -100;
            }else if(num >= 400 && num < 500){
                sb.append("CD");
                num = num -400;
            }else if(num >= 500 && num < 900){
                sb.append("D");
                num = num -500;
            }else if(num >= 900 && num < 1000){
                sb.append("CM");
                num = num - 900;
            }else{
                sb.append("M");
                num = num - 1000;
            }
        }

        return sb.toString();
    }
}