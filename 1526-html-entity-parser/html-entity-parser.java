class Solution {
    public String entityParser(String text) {
        HashMap<String, String> map = new HashMap<>();
        map.put("&quot;", "\"");
        map.put("&apos;", "\'");
        map.put("&amp;", "&");
        map.put("&gt;", ">");
        map.put("&lt;", "<");
        map.put("&frasl;", "/");

        String arr[] = text.split(" ");
        StringBuffer result = new StringBuffer();

        for(int i=0; i<arr.length; i++){
            String subText = arr[i];

            int start = -1;
            int end = -1;
            int start1 = -1;
            int end1 = -1;
            StringBuffer sb = new StringBuffer();
            for(int j=0; j<subText.length(); j++){
                sb.append(subText.charAt(j));
                if(subText.charAt(j) == '&'){
                    // sb.append(subText.charAt(j));
                    start = sb.length()-1;
                    start1 = j;
                    j++;

                    while(j<subText.length()){
                        sb.append(subText.charAt(j));
                        if(subText.charAt(j) == '&'){
                           start = sb.length()-1;
                           start1 = j;
                        }
                        else if(subText.charAt(j) == ';'){
                            end = sb.length()-1;
                            end1 = j;
                            break;
                        }
                        j++;
                    }

                    if(start != -1 && end != -1 && map.containsKey(subText.substring(start1, end1 + 1))){
                        sb.replace(start, end + 1, map.get(subText.substring(start1, end1 + 1)));
                        start = -1;
                        end = -1;
                        start1 = -1;
                        end1 = -1;
                    }
                }
            }

            result.append(sb.toString());
            if(i != (arr.length -1)){
                result.append(" ");
            }
            
        }

        return result.toString();

    }
}