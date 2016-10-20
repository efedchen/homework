package ArraysNcollections;

public class Arrays {
    public static void main(String[] args) {

        //declaration of the array
        String[] superFriends = new String[3];
        superFriends[0] = "Bodya";
        superFriends[1] = "Slava";
        superFriends[2] = "Serg";

        //that kind of declaration also possible:
        String [] String [] = {{"s"}};

        //declaration of the array immediately
        String[] friends = {"masha", "Sasha", "Petya", "Alex"};

        //multi-dimensional arrays could be declared that way:
        String[][] myFriendsPhoneNumb = new String[5][2]; //five friends, and each have 2 fields to store smth

        //there is no restrictions how many dimensions could be created
        //String helloWorld [][][]=new String [2][2][2];

        //String myFriendsPhoneNumb [][] - also could be declared that way
        myFriendsPhoneNumb[0][0] = "Serg";
        myFriendsPhoneNumb[0][1] = "576 173 387";
        myFriendsPhoneNumb[1][0] = "Slava";
        myFriendsPhoneNumb[1][1] = "095 435 11 64";
        myFriendsPhoneNumb[2][0] = "Bodya";
        myFriendsPhoneNumb[2][1] = "-";
        myFriendsPhoneNumb[3][0] = "jan";
        myFriendsPhoneNumb[3][1] = "123 345 345";
        myFriendsPhoneNumb[4][0] = "Stefa";
        myFriendsPhoneNumb[4][1] = "432 423 422";

        for (int i = 0; i < myFriendsPhoneNumb.length; i++) {
            for (int j = 0; j <myFriendsPhoneNumb[0].length; j++) {
                System.out.println(myFriendsPhoneNumb[i][j]);
            }
        }
    }
}
