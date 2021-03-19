import java.util.*;
import java.awt.*;

public class FriendsList {
    ArrayList <Person> friends;


public Person(){
    this.friends = new ArrayList<Person>();
}

public void addFriends(Person nf){
    this.friends.add(nf);
}

public boolean removeFriends(String firstname, String lastname){
    for(int x = 0; x < friends.size(); x++){
        if(friends.get(x).getFirstname() == firstname && friends.get(x).getLastname() == lastname ){
            friends.remove(x);
            return true;
        }
    }
    return false;
}

public void modiffyperson(String firstname , String lastname, long pn, String bm, int bd, int index){
    Person np = new Person(firstname, lastname, pn, bm, bd);
    for(int x = 0; x < friends.size();x++){
        if(x == index){
            this.friends.set(index, np);
        }

    }

}
public ArrayList<String> friendsSortedLN() {

    ArrayList<String> friendsnames = new ArrayList<>();
    for(int x = 0; x < friends.size(); x++) {
        friendsnames.add(this.friends(x).getLastname());
    }
        Collections.sort(friendsnames);
    

}
public int numberFriends(){
    return friends.size();
}

public Array<Person> friendsBornGivenMonth(String month){
    ArrayList<Person> sbb = new ArrayList<>();

    for(int x = 0; x < friends.size(); x++){
        if(friends.get(x).getBmonth().equals(month)){
            sbb.add(friends.get(x));
        }
    }

    ArrayList<Integer>sortbydob = new ArrayList<>();
    ArrayList<Person>dsorted = new ArrayList<>();
    for(int x = 0; sbb.size(); x++){
        sortbydob.add(sbb.get(x).getBday());
    }

    Collection.sort(sortbydob);

    for(int x = 0; x < sortbydob.size();x++){
        for(int y = 0; y < sbb.size();y++){
            if(sbb.get(y).getBday() == sortbydob(x)){
                dsorted.add(sbb.get(y));

            }
        }
    }
    return dsorted;
}
public String cellnumber(String fn, String ln){
    for(int x = 0; x <friends.size(); x++){
        if(friends.get(x).getFirstname().equals(fn)&&friends.get(x).getLastname().equals(ln)){
            return friends.get(x).getPhonenumber();

        }
    }
    return "no number";
}

public ArrayList<Person>removeS(){
    ArrayList<Person>removeshane = new ArrayList<>();

    for(int x = 0; x<friends.size(); x++){
        removeshane.add(friends.get(x));
    }

    for(int x = 0; x< friends.size();x++){
        if(removeshane.get(x).getFirstname().equals("Shane")){
            removeshane.remove(x);


        }

    }
    return removeshane;

}



}


