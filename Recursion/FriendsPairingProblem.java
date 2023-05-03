package Recursion;


/*
 Friends Pairing Problem : 
 Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be 
 paired only once. Find out the total number of ways in which friends can remain or can be paired up.
 */

public class FriendsPairingProblem {

    public static int friendsPairings(int n) {
        //base case
        if(n==1||n==2) return n;

        return friendsPairings(n-1) + (n-1) * friendsPairings(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairings(6));
    }
    
}
