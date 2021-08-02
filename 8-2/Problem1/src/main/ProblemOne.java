public class ProblemOne {

    public int LCS(String a, String b) {

        int result = 0;

        int i = 0;
        StringBuilder sub = new StringBuilder();

        while(i < a.length()) {
            sub.append(a.charAt(i));
            if(!b.contains(sub)) {
                sub.deleteCharAt(sub.length() - 1);
                if(sub.length() > result) {
                    result = sub.length();
                } else if (sub.length() > 0) {
                    i--;
                }
                sub.setLength(0);
            }
            i++;
        }
        return result;
    }
}
