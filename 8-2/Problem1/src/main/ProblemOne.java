public class ProblemOne {

    public int LCS(String a, String b) {

        int result = 0;
        StringBuilder sub = new StringBuilder();

        for(int j = 0; j < a.length(); j++) {
            for(int i = j; i < a.length(); i++) {
                sub.append(a.charAt(i));
                if(!b.contains(sub)) {
                    sub.deleteCharAt(sub.length() - 1);
                    if(sub.length() > result) {
                        result = sub.length();
                    }
                    sub.setLength(0);
                    break;
                } else if(i == a.length() - 1) {
                    if(sub.length() > result) {
                        result = sub.length();
                    }
                    sub.setLength(0);
                }
            }
        }

        return result;
    }
}
