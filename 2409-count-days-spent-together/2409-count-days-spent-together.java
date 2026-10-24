class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aa = getDay(arriveAlice);
        int la = getDay(leaveAlice);
        int ab = getDay(arriveBob);
        int lb = getDay(leaveBob);

        int start = Math.max(aa, ab);

        int end = Math.min(la, lb);

        if(start > end) 
        {
            return 0;
        }
        return end - start + 1;
    }

    private int getDay(String date) 
    {

        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int total = 0;

        for(int i = 0; i < month-1; i++) 
        {
            total = total + days[i];
        }
        total = total + day;
        return total;
    }
}