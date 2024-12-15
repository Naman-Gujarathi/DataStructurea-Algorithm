class Solution {
    public String reformatDate(String date) {

        HashMap<String, Integer> monthInfo = new HashMap<>();
        monthInfo.put("Jan", 1); 
        monthInfo.put("Feb", 2); 
        monthInfo.put("Mar", 3); 
        monthInfo.put("Apr", 4); 
        monthInfo.put("May", 5); 
        monthInfo.put("Jun", 6); 
        monthInfo.put("Jul", 7); 
        monthInfo.put("Aug", 8); 
        monthInfo.put("Sep", 9); 
        monthInfo.put("Oct", 10); 
        monthInfo.put("Nov", 11); 
        monthInfo.put("Dec", 12); 

        String arr[] = date.split(" ");
        StringBuffer sb = new StringBuffer();
        String dateNumberFormat = arr[0];
        char dateNumberFormatArr[] = dateNumberFormat.toCharArray();
        for(int i=0; i<dateNumberFormatArr.length; i++){
            if(Character.isDigit(dateNumberFormatArr[i])){
                sb.append(dateNumberFormatArr[i]);

            }
        }
        if (sb.length() == 1){
            sb.append(0);
            sb.reverse();
        }
        String newDateNumberFormat = sb.toString();

        String month = arr[1];
        int monthNumberFormat = monthInfo.get(month);
          String  monthStringFormat = "";
        if( (1 <= monthNumberFormat) && (monthNumberFormat <= 9)){
              monthStringFormat = "0" + monthNumberFormat;
        }else{
            monthStringFormat = String.valueOf(monthNumberFormat);
        }

        String year = arr[2];


        String resultDateFormat =  year + "-" +  monthStringFormat + "-" +  newDateNumberFormat;
        // dateFormat[0] = year;
        // dateFormat[1] = month;
        // dateFormat[2] = newDateNumberFormat;

        // String.join("-", dateFormat);

        return resultDateFormat ;



        // sb.append("-");
        // sb.append(month);
        // sb.append("-");
        // sb.append(date);

        // return sb.toString();

    }

}