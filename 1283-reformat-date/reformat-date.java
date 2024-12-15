class Solution {
    public String reformatDate(String date) {

        HashMap<String, String> monthInfo = new HashMap<>();
        monthInfo.put("Jan", "01"); 
        monthInfo.put("Feb", "02"); 
        monthInfo.put("Mar", "03"); 
        monthInfo.put("Apr", "04"); 
        monthInfo.put("May", "05"); 
        monthInfo.put("Jun", "06"); 
        monthInfo.put("Jul", "07"); 
        monthInfo.put("Aug", "08"); 
        monthInfo.put("Sep", "09"); 
        monthInfo.put("Oct", "10"); 
        monthInfo.put("Nov", "11"); 
        monthInfo.put("Dec", "12"); 

        String arr[] = date.split(" ");
        StringBuffer sb = new StringBuffer();
        String dateNumberFormat = arr[0];
        // char dateNumberFormatArr[] = dateNumberFormat.toCharArray();
        // for(int i=0; i<dateNumberFormatArr.length; i++){
        //     if(Character.isDigit(dateNumberFormatArr[i])){
        //         sb.append(dateNumberFormatArr[i]);

        //     }
        // }
        // if (sb.length() == 1){
        //     sb.append(0);
        //     sb.reverse();
        // }
        // String newDateNumberFormat = sb.toString();

        String  newDateNumberFormat = dateNumberFormat.substring(0, dateNumberFormat.length()-2);
        if(newDateNumberFormat.length() == 1){
            newDateNumberFormat=  "0" +  newDateNumberFormat;
        }

        String month = arr[1];
        String monthStringFormat = monthInfo.get(month);
        String year = arr[2];


        // String resultDateFormat =  year + "-" +  monthStringFormat + "-" +  newDateNumberFormat;

        StringBuilder resultDateFormat = new StringBuilder();

        resultDateFormat.append(year)
                        .append("-")
                        .append(monthStringFormat)
                        .append("-")
                        .append(newDateNumberFormat);
        // dateFormat[0] = year;
        // dateFormat[1] = month;
        // dateFormat[2] = newDateNumberFormat;

        // String.join("-", dateFormat);

        return resultDateFormat.toString() ;



        // sb.append("-");
        // sb.append(month);
        // sb.append("-");
        // sb.append(date);

        // return sb.toString();

    }

}