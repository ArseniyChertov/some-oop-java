public class MyFriends {
    public static void main(String[]args){
        FriendsList fl = new FriendsList();

    Person per = new Person("Nick", "Makel", "2263334444" ,"july", 14 );
    fl.addFriends(per);
    Person per2 = new Person("Devin", "Man", "2269872345" ,"January", 18 );
    fl.addFriends(per2);
    Person per3 = new Person("Kayla", "Bar", "2263334432" ,"April", 2 );
    fl.addFriends(per3);

    Scanner s = new Scanner(System.in);
    System.out.println("enter the following option 1 is add friends, 2 is remove friend, 3 is modify friend, 4 to sort by last name, 5 to born in a given month sorted by day, 6 is to find phone number and 7 is to remove all friends with name shane ");
    int find = s.nextInt();


    if(find  == 0){
        System.out.println("enter first name");
        String firstname = s.next();
        System.out.println("enter last name");
        String lastname = s.next();
        System.out.println("enter phone number");
        String phonenumber = s.next();
        System.out.println("enter month of birth");
        String bmonth = s.next();
        System.out.println("enter day of birth");
        int dbirth = s.nextInt();
        fl.addFriends(new Person(firstname,lastname,phonenumber,bmonth,dbirth));
        System.out.println(fl);
    }

    if(find ==2){
        System.out.println("enter first name");
        String frstname = s.next();
        System.out.println("enter last name");
        String lstname = s.next();
        fl.removeFriends(frstname, lstname);
        System.out.println(fl);
    }
    if(find == 3){
        System.out.println("enter first name");
        String firstnam = s.next();
        System.out.println("enter last name");
        String lastnam = s.next();
        System.out.println("enter phone number");
        String phnenumber = s.next();
        System.out.println("enter month of birth");
        String bmont = s.next();
        System.out.println("enter day of birth");
        int dbirt = s.nextInt();
        System.out.println("enter index you ant to modify");
        int index = s.nextInt();
        
        fl.addFriends(new Person(firstnam,lastnam,phnenumber,bmont,dbirt,index));
        System.out.println(fl);
        
    }
    if(find == 4){
        fl.friendsSortedByLN();
        System.out.println(fl);
    }

    if(find == 5){
        System.out.println("enter month");
        String m = s.next();
        fl.sbb(m);
        System.out.println(m);

    }
    if(find == 6){
        System.out.println("enter first name");
        String fn = s.next();
        System.out.println("enter last name");
        String ln= s.next();
        fl.phonenumber(fn,ln);
        System.out.println(fl);

    }

    if(find == 7){
        fl.removeS();
        System.out.println(fl);
    }



    }
}
