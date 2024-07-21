package everything;

import alsoPaper.E1;
import alsoPaper.E3;
import alsoPaper.E4;
import forPaper.*;
import testAssociation.anotherDepth.Drink;

import java.io.Serializable;
import java.util.*;
import java.util.Scanner;


public class All extends E1 implements E3, Inter, Serializable, Restaurant {
    int one;
    int two = 2;
    ArrayList<Integer> three;
    HashMap<Integer, Integer> four;
    HashSet<Integer> five = new HashSet<>();
    HashSet<Integer> six = five;
    ArrayList<HashMap<Other, HashSet<E1>>> someListing;
    Scanner trial;
    Queue<String> que;
    HashSet<E1> ee1 = new HashSet<>();
    HashSet<E1> ee2 = new HashSet<>();

    public void m1(int anInt, HashSet<Food> aFood,ArrayList<HashMap<Other, HashSet<Drink>>> aDrink){
    }
    private String m2(){
        return "the m2";
    }
    protected ArrayList<E1> m3(){

        return new ArrayList<>();
    }
    public ArrayList<E4> m4(){

        return new ArrayList<E4>();
    }
    private Some m5(){
        return new Some();
    }
}

