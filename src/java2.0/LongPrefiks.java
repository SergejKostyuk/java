public class LongPrefiks {
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        System.out.println(longPrefiks(strings));
        
    }
    static String longPrefiks(String[] strs){
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()){
                    return prefix;
                }
            }
        }
        return prefix;
    }
}
