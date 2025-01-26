package INTERVIEWQUETION;

class Find_Leap_Year{
    static boolean checkYear(int n) {
        if (n % 4 == 0)
        {
            if (n % 100 == 0) {
                return n % 400 == 0;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int year = 2021;
        if (checkYear(year)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}